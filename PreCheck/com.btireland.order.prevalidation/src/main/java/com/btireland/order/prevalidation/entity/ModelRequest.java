package com.btireland.order.prevalidation.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ModelRequest {
	private String ORDER_DATA;
	private String  ORDER_DETAILS;
	private String CUSTOMER_DETAILS;
	private String CONTACT_DETAILS;
	
	@JsonProperty("ORDER_DATA")
	public String getORDER_DATA() {
		return ORDER_DATA;
	}
	public void setORDER_DATA(String oRDER_DATA) {
		ORDER_DATA = oRDER_DATA;
	}
	
	@JsonProperty("ORDER_DETAILS")
	public String getORDER_DETAILS() {
		return ORDER_DETAILS;
	}
	public void setORDER_DETAILS(String oRDER_DETAILS) {
		ORDER_DETAILS = oRDER_DETAILS;
	}
	@JsonProperty("CUSTOMER_DETAILS")
	public String getCUSTOMER_DETAILS() {
		return CUSTOMER_DETAILS;
	}
	public void setCUSTOMER_DETAILS(String cUSTOMER_DETAILS) {
		CUSTOMER_DETAILS = cUSTOMER_DETAILS;
	}
	@JsonProperty("CONTACT_DETAILS")
	public String getCONTACT_DETAILS() {
		return CONTACT_DETAILS;
	}
	public void setCONTACT_DETAILS(String cONTACT_DETAILS) {
		CONTACT_DETAILS = cONTACT_DETAILS;
	}
	@Override
	public String toString() {
		return "ModelRequest [ORDER_DATA=" + ORDER_DATA + ", ORDER_DETAILS=" + ORDER_DETAILS + ", CUSTOMER_DETAILS="
				+ CUSTOMER_DETAILS + ", CONTACT_DETAILS=" + CONTACT_DETAILS + "]";
	}
	
	

}
