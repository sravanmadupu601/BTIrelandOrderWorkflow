package com.btireland.order.appointment.DTO;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name="APPOINTMENT")
public class Appointment {
	@Id
	@Column(name="ORDER_NUMBER")
	private int orderNumber;
	@Column(name="APPOINTMENT_ID")
	private String appointmentId;
	@Column(name="SLOT_START")
	@JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
	private Date slotStart;
	@Column(name="SLOT_END")
	@JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
	private Date slotEnd;
	public int getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(String appointmentId) {
		this.appointmentId = appointmentId;
	}
	public Date getSlotStart() {
		return slotStart;
	}
	public void setSlotStart(Date slotStart) {
		this.slotStart = slotStart;
	}
	public Date getSlotEnd() {
		return slotEnd;
	}
	public void setSlotEnd(Date slotEnd) {
		this.slotEnd = slotEnd;
	}
	@Override
	public String toString() {
		return "Appointment [orderNumber=" + orderNumber + ", appointmentId=" + appointmentId + ", slotStart="
				+ slotStart + ", slotEnd=" + slotEnd + "]";
	}
	
	
}
