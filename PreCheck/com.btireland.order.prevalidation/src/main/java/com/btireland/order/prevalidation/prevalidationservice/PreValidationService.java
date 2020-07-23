package com.btireland.order.prevalidation.prevalidationservice;

import org.springframework.stereotype.Service;

import com.btireland.order.prevalidation.dto.OrderDataDTO;
import com.btireland.order.prevalidation.dto.OrderDetailsDTO;
import com.btireland.order.prevalidation.dto.ResponseDTO;
import com.btireland.order.prevalidation.dto.ServiceDetailsDTO;
import com.btireland.order.prevalidation.entity.ModelRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class PreValidationService {

	 ObjectMapper objectMapper= new ObjectMapper();
	 
	
	
	public ResponseDTO processOderRequest(String request) throws JsonMappingException, JsonProcessingException {
		 ServiceDetailsDTO detailsDTO= new ServiceDetailsDTO();
		 ResponseDTO responseDTO= new ResponseDTO();
		 ResponseDTO responseDTO1= new ResponseDTO();
		OrderDataDTO orderRequest=objectMapper.readValue(request,OrderDataDTO.class);
		
		detailsDTO.setServcieCode(orderRequest.getServiceDetailsDTO().getServcieCode());
		detailsDTO.setEIRCode(orderRequest.getServiceDetailsDTO().getEIRCode());
		System.out.println(orderRequest.getOrderDetailsDTO().getApplicationDate());
	    responseDTO.setApplicationDate(orderRequest.getOrderDetailsDTO().getApplicationDate());
	    responseDTO.setRequiredDAte(orderRequest.getOrderDetailsDTO().getRequiredDAte());
	    responseDTO.setOrderNumber(orderRequest.getOrderDetailsDTO().getOrderNumber());
	    responseDTO.setType(orderRequest.getOrderDetailsDTO().getType());
	    responseDTO.setEIRCode(orderRequest.getServiceDetailsDTO().getEIRCode());
	    responseDTO.setServcieCode(orderRequest.getServiceDetailsDTO().getServcieCode());
	    responseDTO.setName(orderRequest.getCustomerDetailsDTO().getName());
	    
	   responseDTO1=validateRequest(detailsDTO);
	   responseDTO.setValidationResult(responseDTO1.getValidationResult());
	   responseDTO.setValid(responseDTO1.getValid());
	   return responseDTO;
		
	}
	
	public ResponseDTO validateRequest(ServiceDetailsDTO detailsDTO) {
		 String serviceCode=detailsDTO.getServcieCode();
		 ResponseDTO responseDTO= new ResponseDTO();
		 Boolean valid=false;
		 String flag="REJECTED";
		 switch (serviceCode) {
		case "NBICS":
			flag="ACCEPTED";
			valid=true;
			break;
		case "NBICP":
			flag="ACCEPTED";
			valid=true;
			break;
		case "NBICE":
			flag="ACCEPTED";
			valid=true;
			break;
		default:
			flag="REJECTED";
			valid=false;
			break;
		}
		 responseDTO.setValidationResult(flag);
		 responseDTO.setValid(valid);
		 
		return responseDTO;
		 
		 
		
	}
}
