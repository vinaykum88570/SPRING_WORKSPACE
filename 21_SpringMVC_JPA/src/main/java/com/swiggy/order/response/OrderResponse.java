package com.swiggy.order.response;

public class OrderResponse {

	private String orderID;
	private String orderstatus;
	private double amount;
	private String emailId;
	private String city;

	public OrderResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderResponse(String orderID, String orderstatus, double amount, String emailId, String city) {
		super();
		this.orderID = orderID;
		this.orderstatus = orderstatus;
		this.amount = amount;
		this.emailId = emailId;
		this.city = city;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public String getOrderstatus() {
		return orderstatus;
	}

	public void setOrderstatus(String orderstatus) {
		this.orderstatus = orderstatus;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
