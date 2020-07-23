package com.btireland.order.prevalidation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.btireland.order.prevalidation.dto.ResponseDTO;
import com.btireland.order.prevalidation.prevalidationservice.PreValidationService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
@EnableScheduling
public class Application {
	@Autowired
	PreValidationService preValidationService;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	ObjectMapper objectMapper= new ObjectMapper();
	
	String json="{\"ORDER_DETAILS\":{\"ORDER_NUMBER\":\"123\",\"TYPE\":\"123\",\"APPLICATION_DATE\":\"1993-04-02T11:12:09\",\"REQUIRED_DATE\":\"1993-05-02T11:12:09\"},\"CUSTOMER_DETAILS\":{\"NAME\":\"yz\"},\"SERVICE_DETAILS\":{\"SERVICE_CODE\":\"NBICS\",\"EIRCODE\":\"abc\"}}";
	String json1="{\"ORDER_DETAILS\":{\"ORDER_NUMBER\":\"123\",\"TYPE\":\"123\",\"APPLICATION_DATE\":\"1993-04-02T11:12:09\",\"REQUIRED_DATE\":\"1993-05-02T11:12:09\"},\"CUSTOMER_DETAILS\":{\"NAME\":\"yz\"},\"SERVICE_DETAILS\":{\"SERVICE_CODE\":\"NBICP\",\"EIRCODE\":\"abc\"}}";
	String json2="{\"ORDER_DETAILS\":{\"ORDER_NUMBER\":\"123\",\"TYPE\":\"123\",\"APPLICATION_DATE\":\"1993-04-02T11:12:09\",\"REQUIRED_DATE\":\"1993-05-02T11:12:09\"},\"CUSTOMER_DETAILS\":{\"NAME\":\"yz\"},\"SERVICE_DETAILS\":{\"SERVICE_CODE\":\"NBICE\",\"EIRCODE\":\"abc\"}}";
	String json3="{\"ORDER_DETAILS\":{\"ORDER_NUMBER\":\"123\",\"TYPE\":\"123\",\"APPLICATION_DATE\":\"1993-04-02T11:12:09\",\"REQUIRED_DATE\":\"1993-05-02T11:12:09\"},\"CUSTOMER_DETAILS\":{\"NAME\":\"yz\"},\"SERVICE_DETAILS\":{\"SERVICE_CODE\":\"OTHER\",\"EIRCODE\":\"abc\"}}";
//	@Scheduled(fixedRate = 10000)
//	public String scheduledMethod() throws JsonMappingException, JsonProcessingException {
//		
//		
//		String flag=objectMapper.writeValueAsString(preValidationService.processOderRequest(json));
//		System.out.println("RESPONSE 1::"+flag);
//		return flag;
//		
//		
//		
//	}
//	
//	@Scheduled(fixedRate = 20000)
//	public String scheduledMethod2() throws JsonMappingException, JsonProcessingException {
//		
//		
//		String flag=objectMapper.writeValueAsString(preValidationService.processOderRequest(json1));
//		
//		System.out.println("RESPONSE 2::"+flag);
//		return flag;
//	}
//	
//	@Scheduled(fixedRate = 30000)
//	public String scheduledMethod3() throws JsonMappingException, JsonProcessingException {
//		
//		
//	String flag=objectMapper.writeValueAsString(preValidationService.processOderRequest(json2));
//		
//		System.out.println("RESPONSE 3::"+flag);
//		return flag;
//	}
//	@Scheduled(fixedRate = 40000)
//	public String scheduledMethod4() throws JsonMappingException, JsonProcessingException {
//		
//		
//	String flag=objectMapper.writeValueAsString(preValidationService.processOderRequest(json3));
//		
//		System.out.println("RESPONSE 4::"+flag);
//		return flag;
//		
//	}
	
}
