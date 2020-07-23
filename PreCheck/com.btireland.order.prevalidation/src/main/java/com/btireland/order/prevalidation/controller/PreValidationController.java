package com.btireland.order.prevalidation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.btireland.order.prevalidation.prevalidationservice.PreValidationService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class PreValidationController {
	
	@Autowired
	PreValidationService preValidationService;
	
	ObjectMapper objectMapper= new ObjectMapper();
	
	String mockJson="{\"VALIDATION_RESULT\":\"ACCEPTED\",\"VALID\":true,\"ORDER_NUMBER\":123,\"SERVICE_CODE\":\"NBICS\",\"NAME\":\"SKY\",\"TYPE\":\"PFIB\",\"EIRCODE\":\"A00A000\",\"REQUIRED_DATE\":\"1993-05-02T11:12:09\",\"APPLICATION_DATE\":\"1993-04-02T11:12:09\"}";
	@GetMapping("/getValidation")
	public String test() {
		return mockJson;
	}
	
	
	@PostMapping("/preValidation")
	public String validateRequest(@RequestBody String json) throws JsonMappingException, JsonProcessingException {
		String flag=objectMapper.writeValueAsString(preValidationService.processOderRequest(json));
		//System.out.println("RESPONSE 1::"+flag);
		return flag;
	}
	
	
	

}
