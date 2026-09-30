package com.autowired;

import org.springframework.stereotype.Component;

@Component("office")
public class Address {
	private String streetName;
	private int pincode ;
	private String city;
	
	public Address() {
	System.out.println("Address Object Created");
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
}
