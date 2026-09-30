package com.scope.prototype;

public class Product1 {

	private String productId; 
	 private String productName; 
	 
	 public Product1() { 
	  System.out.println("Product Object Created by IOC"); 
	 }

	 //setters and getters methods 
	 
	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	} 
	  
	
	 
	 
}
