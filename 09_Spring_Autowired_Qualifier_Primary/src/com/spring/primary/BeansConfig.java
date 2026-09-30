package com.spring.primary;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration 
@ComponentScan("com.spring.primary") 
public class BeansConfig { 
	
   @Bean("hyd") 
  public PrimaryAddress createAddress() { 
	   PrimaryAddress a = new PrimaryAddress(); 
      a.setPincode(500067); 
      a.setStreetName("Gachibowli"); 
     return a; 
   } 
   
   @Bean("banglore") 
   @Primary
    public PrimaryAddress bangloreAddress() { 
	   PrimaryAddress a = new PrimaryAddress(); 
     a.setPincode(560043); 
     a.setStreetName("Banglore"); 
    return a; 
   } 
} 
