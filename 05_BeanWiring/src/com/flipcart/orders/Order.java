package com.flipcart.orders;

import com.flipcart.product.Product;

public class Order {
	private String orderID;
	private String orderValue;
	
	private Product product;

	
	
	public Order() {
		super();
		
	}

	public Order(String orderID, String orderValue, Product product) {
		super();
		this.orderID = orderID;
		this.orderValue = orderValue;
		this.product = product;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public String getOrderValue() {
		return orderValue;
	}

	public void setOrderValue(String orderValue) {
		this.orderValue = orderValue;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	
}
