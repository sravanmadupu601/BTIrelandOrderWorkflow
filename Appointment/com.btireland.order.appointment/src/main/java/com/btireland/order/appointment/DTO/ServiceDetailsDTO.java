package com.btireland.order.appointment.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ServiceDetailsDTO {
	private String servcieCode;
	private String EIRCode;
	
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
	@Override
	public String toString() {
		return "ServiceDetailsDTO [servcieCode=" + servcieCode + ", EIRCode=" + EIRCode + "]";
	}
	

}
