package com.spring;

public class Item {

	private String itemName;
	private int itemPrice;
	
	public Item(String itemName, int itemPrice) {  // Constructor Injection 
		super();
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}
	
	public Item() {
		
	}
	
}
