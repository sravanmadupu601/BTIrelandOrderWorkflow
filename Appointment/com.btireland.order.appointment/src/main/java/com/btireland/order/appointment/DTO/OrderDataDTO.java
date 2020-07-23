package com.btireland.order.appointment.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;


public class OrderDataDTO {
	
	private CustomerDetailsDTO customerDetailsDTO;
	
	private OrderDetailsDTO orderDetailsDTO;
	private ServiceDetailsDTO serviceDetailsDTO;
	
	@JsonProperty("CUSTOMER_DETAILS")
	public CustomerDetailsDTO getCustomerDetailsDTO() {
		return customerDetailsDTO;
	}
	public void setCustomerDetailsDTO(CustomerDetailsDTO customerDetailsDTO) {
		this.customerDetailsDTO = customerDetailsDTO;
	}
	
	@JsonProperty("ORDER_DETAILS")
	public OrderDetailsDTO getOrderDetailsDTO() {
		return orderDetailsDTO;
	}
	public void setOrderDetailsDTO(OrderDetailsDTO orderDetailsDTO) {
		this.orderDetailsDTO = orderDetailsDTO;
	}
	@JsonProperty("SERVICE_DETAILS")
	public ServiceDetailsDTO getServiceDetailsDTO() {
		return serviceDetailsDTO;
	}
	public void setServiceDetailsDTO(ServiceDetailsDTO serviceDetailsDTO) {
		this.serviceDetailsDTO = serviceDetailsDTO;
	}
	@Override
	public String toString() {
		return "OrderDataDTO [customerDetailsDTO=" + customerDetailsDTO + ", orderDetailsDTO=" + orderDetailsDTO
				+ ", serviceDetailsDTO=" + serviceDetailsDTO + "]";
	}
	
}
