package com.btireland.order.appointment.DTO;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseDTO {

	private String appointmentId;
	private Boolean availabilityFlag;
	private int orderNumber;
	private String Type;
	private Date ApplicationDate;
	private Date RequiredDAte;
	private String servcieCode;
	private String EIRCode;
	private Boolean green;
	
	@JsonProperty("GREEN")
	public Boolean getGreen() {
		return green;
	}
	public void setGreen(Boolean green) {
		this.green = green;
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
	@JsonProperty("EIR_CODE")
	public String getEIRCode() {
		return EIRCode;
	}
	public void setEIRCode(String eIRCode) {
		EIRCode = eIRCode;
	}
	@JsonProperty("APPOINTMENT_ID")
	public String getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(String appointmentId) {
		this.appointmentId = appointmentId;
	}
	
	@JsonProperty("AVAILABILITY_FLAG")
	public Boolean getAvailabilityFlag() {
		return availabilityFlag;
	}
	public void setAvailabilityFlag(Boolean availabilityFlag) {
		this.availabilityFlag = availabilityFlag;
	}
	
	
	
	
}
