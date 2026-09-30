package com.spring.qualifier;

import org.springframework.stereotype.Component;

@Component("home") 
public class Address { 

   private String streetName; 
   private int pincode; 

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

    public void printAddressDetails() { 
          System.out.println("Street Name is : " + this.streetName); 
          System.out.println("Pincode is : " + this.pincode); 
     } 
}