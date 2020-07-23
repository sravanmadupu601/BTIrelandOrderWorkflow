package com.camunda.workflow.bt.order.delegates;

import camundajar.impl.com.google.gson.JsonElement;
import camundajar.impl.com.google.gson.JsonObject;
import camundajar.impl.com.google.gson.JsonParser;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

@Component(value = "spqrValidation")
public class SPQRValidationService implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        String sURL = "http://localhost:8085/getInfo";
        URL url = new URL(sURL);
        URLConnection request = url.openConnection();
        request.connect();
        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        JsonObject rootobj = root.getAsJsonObject();
        String valid_status = rootobj.get("flag").getAsString();
        System.out.println(valid_status);
        boolean status=Boolean.parseBoolean(valid_status);

        delegateExecution.setVariable("green", status);
    }
}
