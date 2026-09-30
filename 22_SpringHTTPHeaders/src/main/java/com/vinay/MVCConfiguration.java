package com.vinay;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport; 
 
@Configuration 
@ComponentScan("com.*") 
public class MVCConfiguration extends WebMvcConfigurationSupport{ 
  
} 
