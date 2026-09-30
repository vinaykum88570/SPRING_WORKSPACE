package com.spring.qualifier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration 
@ComponentScan("com.spring.qualifier") 
public class BeansConfig { 
	
   @Bean("hyd") 
  public Address createAddress() { 
      Address a = new Address(); 
      a.setPincode(500067); 
      a.setStreetName("Gachibowli"); 
     return a; 
   } 
   
   @Bean("banglore") 
  public Address bangloreAddress() { 
     Address a = new Address(); 
     a.setPincode(560043); 
     a.setStreetName("Banglore"); 
    return a; 
   } 
} 
