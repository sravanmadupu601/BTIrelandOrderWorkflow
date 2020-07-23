package com.btireland.order.prevalidation.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerDetailsDTO {
	
	private String Name;
	@JsonProperty("NAME")
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "CustomerDetailsDTO [Name=" + Name + "]";
	}

}
