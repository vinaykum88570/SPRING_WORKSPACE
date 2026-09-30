package com.spring;

public class Customer {
    
	private int customerOD;
	private String customerName;
	private Address address;
	
	public int getCustomerOD() {
		return customerOD;
	}
	public void setCustomerOD(int customerOD) {
		this.customerOD = customerOD;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) { // Setters Injection
		this.address = address;
	}
	
	
	
	
}
