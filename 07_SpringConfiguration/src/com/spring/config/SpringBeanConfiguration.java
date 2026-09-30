package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.Entity.Product;

@Configuration
public class SpringBeanConfiguration {

	@Bean("mouse")
	public Product getProductInstance() {
		Product product = new Product();
		product.setProductID(111);
		product.setPrice(123);
		product.setProductName("Mouse");
		
		return product ;	
	}
	
	
	
}
