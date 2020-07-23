package com.btireland.order.appointment.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.btireland.order.appointment.DTO.Appointment;
import com.btireland.order.appointment.DTO.OrderDataDTO;
import com.btireland.order.appointment.DTO.OrderDetailsDTO;
import com.btireland.order.appointment.DTO.ResponseDTO;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class AppointmentService {
	
//	@Autowired
//	AppointmentRepository appointmentRepository;
	
	 ObjectMapper objectMapper= new ObjectMapper();
	
//	public void saveAppointment(Appointment appointment) {
//		
//	appointmentRepository.save(appointment);
//	}
	
	public ResponseDTO validateRequest(OrderDataDTO orderDataDTO ) throws JsonMappingException, JsonProcessingException {
		
		//OrderDataDTO orderRequest=objectMapper.readValue(orderDataDTO,OrderDataDTO.class);
		OrderDetailsDTO detailsDTO= new OrderDetailsDTO();
		ResponseDTO responseDTO= new ResponseDTO();
		detailsDTO.setRequiredDAte(orderDataDTO.getOrderDetailsDTO().getRequiredDAte());
		
		if(orderDataDTO.getOrderDetailsDTO().getRequiredDAte().toString().equals(null)||orderDataDTO.getOrderDetailsDTO().getRequiredDAte().toString().isEmpty()){
			responseDTO.setAvailabilityFlag(false);
			responseDTO.setGreen(false);
		}
		else
		{
			responseDTO.setAvailabilityFlag(true);
			responseDTO.setGreen(true);
		}
		responseDTO.setAppointmentId("app123");
		responseDTO.setApplicationDate(orderDataDTO.getOrderDetailsDTO().getApplicationDate());
		responseDTO.setRequiredDAte(orderDataDTO.getOrderDetailsDTO().getRequiredDAte());
		responseDTO.setOrderNumber(orderDataDTO.getOrderDetailsDTO().getOrderNumber());
		responseDTO.setType(orderDataDTO.getOrderDetailsDTO().getType());
		responseDTO.setEIRCode(orderDataDTO.getServiceDetailsDTO().getEIRCode());
		responseDTO.setServcieCode(orderDataDTO.getServiceDetailsDTO().getServcieCode());
	
		return responseDTO;
		
		
	
	}	
		
	}



