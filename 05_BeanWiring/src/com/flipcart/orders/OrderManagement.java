package com.flipcart.orders;

public class OrderManagement {

	private int noOfOrders;
	private double totalAmmount;
	
	private Order order;

	public OrderManagement() {
		
	}
	
	public OrderManagement(int noOfOrders, double totalAmmount, Order order) {
		super();
		this.noOfOrders = noOfOrders;
		this.totalAmmount = totalAmmount;
		this.order = order;
	}

	
	public int getNoOfOrders() {
		return noOfOrders;
	}

	public void setNoOfOrders(int noOfOrders) {
		this.noOfOrders = noOfOrders;
	}

	public double getTotalAmmount() {
		return totalAmmount;
	}

	public void setTotalAmmount(double totalAmmount) {
		this.totalAmmount = totalAmmount;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	} 
	
	
}
