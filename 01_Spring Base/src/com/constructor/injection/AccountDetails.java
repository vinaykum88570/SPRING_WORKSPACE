 package com.constructor.injection;

import java.util.Set;

import com.Injecting.collection.Address;

public class AccountDetails {
	private String name; 
	 private double balance; 
	 private Set<String> mobiles; 
	 private AddressDetails customerAddress; 
	 
	 public AccountDetails(String name, double balance, Set<String> mobiles, AddressDetails customerAddress) { 
	  super(); 
	  this.name = name; 
	  this.balance = balance; 
	  this.mobiles = mobiles; 
	  this.customerAddress = customerAddress; 
	 } 
	 public AccountDetails() { 
	   
	 } 
	 public AddressDetails getCustomerAddress() { 
	  return customerAddress; 
	 } 
	
	 public void setCustomerAddress(AddressDetails customerAddress) { 
	  this.customerAddress = customerAddress; 
	 } 
	 public String getName() { 
	  return name; 
	 } 
	 public void setName(String name) { 
	  this.name = name; 
	 } 
	 public double getBalance() { 
	  return balance; 
	 } 
	 public void setBalance(double balance) { 
	  this.balance = balance; 
	 } 
	 public Set<String> getMobiles() { 
	  return mobiles; 
	 } 
	 public void setMobiles(Set<String> mobiles) { 
	  this.mobiles = mobiles; 
	 } 
}
