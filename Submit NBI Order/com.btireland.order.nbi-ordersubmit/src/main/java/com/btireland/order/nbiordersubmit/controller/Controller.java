package com.btireland.order.nbiordersubmit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	String Json="{\"id\":100,\"http_response\":\"success\",\"order_id\":\"CLK98123\",\"order_Acceptance\":\"Yes\",\"success\":true,\"APPOINTMENT_ID\":\"app123\",\"AVAILABILITY_FLAG\":true,\"ORDER_NUMBER\":123,\"SERVICE_CODE\":\"NBICS\",\"GREEN\":true,\"TYPE\":\"123\",\"APPLICATION_DATE\":\"1993-04-02T11:12:09\",\"REQUIRED_DATE\":\"1993-05-02T11:12:09\",\"EIR_CODE\":\"A00A000\"}";
	
	@GetMapping("/orderSubmit")
	public String mockorderSubmit() {
		return Json;
	}
}
