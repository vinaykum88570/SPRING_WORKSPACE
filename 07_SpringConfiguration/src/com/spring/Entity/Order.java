package com.spring.Entity;


public class Order {
	
	private String orderID;

	public Order() {
		// TODO Auto-generated constructor stub
		System.out.println(" Order object Created");
	}
	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	
	
}
