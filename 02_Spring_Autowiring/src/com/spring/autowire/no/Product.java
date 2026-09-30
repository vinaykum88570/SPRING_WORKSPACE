package com.spring.autowire.no;

public class Product {
	
	private String productId; 
	 private String productName; 
	 
	 public Product() { 
	     System.out.println("Product Object Created by IOC"); 
	 } 
	 
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
