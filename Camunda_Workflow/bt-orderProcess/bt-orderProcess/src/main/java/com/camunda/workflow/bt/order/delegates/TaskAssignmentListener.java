package com.camunda.workflow.bt.order.delegates;

import org.camunda.bpm.engine.IdentityService;
import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.TaskListener;
import org.camunda.bpm.engine.identity.User;
import org.camunda.bpm.engine.impl.context.Context;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TaskAssignmentListener implements TaskListener {

    private static final String HOST = "smtp.gmail.com";
    private static final String USER = "shravanmadupu601@gmail.com";
    private static final String PWD = "Ramvijaya@143";


    @Override
    public void notify(DelegateTask delegateTask) {

        String assignee = delegateTask.getAssignee();
        String taskId = delegateTask.getId();

        if (assignee != null) {
            IdentityService identityService = Context.getProcessEngineConfiguration().getIdentityService();
            User user = identityService.createUserQuery().userId(assignee).singleResult();

            if (user != null) {
                String recipient = user.getEmail();
//                Email email = new SimpleEmail();
//                email.setCharset("utf-8");
//                email.setHostName(HOST);
//                email.setSmtpPort(587);
//                email.setSSLCheckServerIdentity(true);
//                email.setStartTLSEnabled(false);
//                email.setAuthentication(USER, PWD);

                Properties props = new Properties();
                props.setProperty("mail.transport.protocol", "smtp");
                props.setProperty("mail.host", "smtp.gmail.com");
                props.put("mail.smtp.auth", "true");
                props.put("mail.smtp.port", "465");
                props.put("mail.debug", "true");
                props.put("mail.smtp.socketFactory.port", "465");
                props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
                props.put("mail.smtp.socketFactory.fallback", "false");
                Session session = Session.getDefaultInstance(props,
                        new javax.mail.Authenticator() {
                            protected PasswordAuthentication getPasswordAuthentication() {
                                return new PasswordAuthentication(USER,PWD);
                            }
                        });


                try {
//                    email.setFrom("noreply@camunda.org");
//                    email.setSubject("Task assigned: " + delegateTask.getName());
//                    email.setMsg("Please complete: http://localhost:8085/camunda/app/tasklist/default/#/task=" + taskId);
//                    email.addTo(recipient);
//                    email.send();

                    Transport transport = session.getTransport();
                    InternetAddress addressFrom = new InternetAddress(USER);

                    MimeMessage message = new MimeMessage(session);
                    message.setSender(addressFrom);
                    message.setSubject("Task assigned: " + delegateTask.getName());
                    message.setContent("Please complete: http://localhost:8085/camunda/app/tasklist/default/#/task=" + taskId, "text/plain");
                    message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));

                    transport.connect();
                    Transport.send(message);
                    transport.close();

                    System.out.println("Task Assignment Email successfully sent to user '" + assignee + "' with address '" + recipient + "'.");

                } catch (Exception e) {
                    System.out.println("Could not send email to assignee");
                }
            } else {
                System.out.println("Not sending email to user " + assignee + "', user has no email address.");
            }
        } else {
            System.out.println("Not sending email to user " + assignee + "', user is not enrolled with identity service.");
        }
    }
}
