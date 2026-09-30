package com.swiggy.model;

import java.time.LocalDate;

public class PaymentData {

	private String paymentID;
	private String payamentStaus;
	private String paymentDate;

	public String getPaymentID() {
		return paymentID;
	}

	public void setPaymentID(String paymentID) {
		this.paymentID = paymentID;
	}

	public String getPayamentStaus() {
		return payamentStaus;
	}

	public void setPayamentStaus(String payamentStaus) {
		this.payamentStaus = payamentStaus;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

}