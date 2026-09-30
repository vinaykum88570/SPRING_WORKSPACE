package com.amazon;

import java.util.List;

public class Product {
	int productId;
    String  productName;
    double price;
    boolean isExpired;
    List<String> products;
    
	public Product(int productId, String productName, double price, boolean isExpired, List<String> products) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.isExpired = isExpired;
		this.products = products;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
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

	public boolean isExpired() {
		return isExpired;
	}

	public void setExpired(boolean isExpired) {
		this.isExpired = isExpired;
	}

	public List<String> getProducts() {
		return products;
	}

	public void setProducts(List<String> products) {
		this.products = products;
	}
	
	
    
    
	
    
}
