package com.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Order {

	@Autowired
	private Item item;

	public Item getItem() {
		return item;
	}

//	public void setItem(Item item) { // setter injection
//		this.item = item;
//	}
	
	  
}
