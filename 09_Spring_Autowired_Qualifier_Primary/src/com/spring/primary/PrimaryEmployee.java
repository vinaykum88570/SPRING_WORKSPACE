package com.spring.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("emp")
public class PrimaryEmployee {

	private String lastName; 
	 private long mobile; 
	 
//	 @Qualifier("banglore")  --> here is @Primary annotation in the configuration level so 
	                             // its by default inject this object no confusion.  
	 @Autowired  
	 private PrimaryAddress add; 
	 
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
	 public PrimaryAddress getAdd() { 
	  return add; 
	 } 
	 public void setAdd(PrimaryAddress add) { 
	  this.add = add; 
	 }
}
