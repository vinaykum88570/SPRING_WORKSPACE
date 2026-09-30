package com.spring.Entity;

import org.springframework.stereotype.Component;

@Component("product1")
public class Product {
	private int productID;
	private String productName;
	private double price;
	
	public Product() {
		System.out.println(" Product Object Created ");
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
