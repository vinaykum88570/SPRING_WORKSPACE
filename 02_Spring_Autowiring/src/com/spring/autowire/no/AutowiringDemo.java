package com.spring.autowire.no;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AutowiringDemo {

	public static void main(String[] args) { 
		   
        // IOC Container 
		
		ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\admin\\SPRING_FW_WORKSPACE\\02_Spring_Autowiring\\Product.xml"); 
			   
			                          Order order = (Order) context.getBean("order");
			                          Product product = (Product) context.getBean("product");
			                          
			                          // Product Object: Getting product Id 
			  System.out.println(order.getProduct().getProductId()); 
			  System.out.println(product);
			 }
	
//	 Product and Order Object created by Spring but not injected product bean object 
//	 automatically in side Order Object by IOC Container with setter injection internally.  
}
