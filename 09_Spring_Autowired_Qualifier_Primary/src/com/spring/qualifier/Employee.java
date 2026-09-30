package com.spring.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("employee")
public class Employee {

	private String lastName; 
	 private long mobile; 
	 
	 @Qualifier("hyd") 
	 @Autowired 
	 private Address add; 
	 
	 public String getLastName() { 
	  return lastName; 
	 } 
	 public void setLastName(String lastName) { 
	  this.lastName = lastName; 
	 } 
	 public long getMobile() { 
	  return mobile; 
	 } 
	 public void setMobile(long mobile) { 
	  this.mobile = mobile; 
	 } 
	 public Address getAdd() { 
	  return add; 
	 } 
	 public void setAdd(Address add) { 
	  this.add = add; 
	 }
}
