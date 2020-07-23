package com.btireland.order.prevalidation.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderDetailsDTO {
	
	
	private int orderNumber;
	
	private String Type;
	
	private Date ApplicationDate;
	
	private Date RequiredDAte;
	
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
	@Override
	public String toString() {
		return "OrderDetailsDTO [orderNumber=" + orderNumber + ", Type=" + Type + ", ApplicationDate=" + ApplicationDate
				+ ", RequiredDAte=" + RequiredDAte + "]";
	}
	
}
