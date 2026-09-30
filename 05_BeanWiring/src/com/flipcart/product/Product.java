package com.flipcart.product;

public class Product {
	private String productID;
	private String productName;
	
	
	public Product() {
		super();
	}

	public Product(String productID, String productName) {
		super();
		this.productID = productID;
		this.productName = productName;
	}
	
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	
}
