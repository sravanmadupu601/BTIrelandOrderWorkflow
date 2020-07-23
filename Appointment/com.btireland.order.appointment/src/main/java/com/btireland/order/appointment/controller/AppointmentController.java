package com.btireland.order.appointment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.btireland.order.appointment.DTO.Appointment;
import com.btireland.order.appointment.DTO.OrderDataDTO;
import com.btireland.order.appointment.DTO.OrderDetailsDTO;
import com.btireland.order.appointment.DTO.ResponseDTO;
import com.btireland.order.appointment.service.AppointmentService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class AppointmentController {
	
	@Autowired
	AppointmentService appointmentService;
	 ObjectMapper objectMapper= new ObjectMapper();
	
	 String mockJson="{\"APPOINTMENT_ID\":\"app123\",\"AVAILABILITY_FLAG\":true,\"ORDER_NUMBER\":123,\"SERVICE_CODE\":\"NBICS\",\"GREEN\":true,\"TYPE\":\"123\",\"APPLICATION_DATE\":\"1993-04-02T11:12:09\",\"REQUIRED_DATE\":\"1993-05-02T11:12:09\",\"EIR_CODE\":\"A00A000\"}";
	@GetMapping("/getAppointment")
	public String test() {
		return mockJson;
	}
	
	
	
//	@PostMapping("/save")
//	public void saveAppointment(@RequestBody Appointment appointment) {
//		System.out.println("IN SAVE");
//		appointmentService.saveAppointment(appointment);
//	}
	
	@PostMapping("/validateAppointment")
	public String validateRequest(@RequestBody OrderDataDTO orderDataDTO) {
		System.out.println("in validate");
		String response=null;
		try {
			ResponseDTO responseDTO= new ResponseDTO();
			
			responseDTO=appointmentService.validateRequest(orderDataDTO);
			response=objectMapper.writeValueAsString(responseDTO);
			
			
			
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  response;
	}
}
