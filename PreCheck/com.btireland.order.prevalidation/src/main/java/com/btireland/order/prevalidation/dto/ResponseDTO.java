package com.btireland.order.prevalidation.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseDTO {

	
	private String validationResult;
	private Boolean valid;
	private String Name;
	private int orderNumber;
	private String Type;
	private Date ApplicationDate;
	private Date RequiredDAte;
	private String servcieCode;
	private String EIRCode;
	@JsonProperty("VALIDATION_RESULT")
	public String getValidationResult() {
		return validationResult;
	}
	public void setValidationResult(String validationResult) {
		this.validationResult = validationResult;
	}
	
	@JsonProperty("VALID")
	public Boolean getValid() {
		return valid;
	}
	public void setValid(Boolean valid) {
		this.valid = valid;
	}
	@JsonProperty("NAME")
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@JsonProperty("ORDER_NUMBER")
	public int getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	@JsonProperty("TYPE")
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	
	@JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
	@JsonProperty("APPLICATION_DATE")
	public Date getApplicationDate() {
		return ApplicationDate;
	}
	public void setApplicationDate(Date applicationDate) {
		ApplicationDate = applicationDate;
	}
	
	@JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
	@JsonProperty("REQUIRED_DATE")
	public Date getRequiredDAte() {
		return RequiredDAte;
	}
	public void setRequiredDAte(Date requiredDAte) {
		RequiredDAte = requiredDAte;
	}
	@JsonProperty("SERVICE_CODE")
	public String getServcieCode() {
		return servcieCode;
	}
	public void setServcieCode(String servcieCode) {
		this.servcieCode = servcieCode;
	}
	@JsonProperty("EIRCODE")
	public String getEIRCode() {
		return EIRCode;
	}
	public void setEIRCode(String eIRCode) {
		EIRCode = eIRCode;
	}
	
	
	
	

}
