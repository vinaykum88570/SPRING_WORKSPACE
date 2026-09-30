package com.scope.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class PrototypeScopesDemo {

	public static void main(String[] args) {  
		 
		ApplicationContext context = new FileSystemXmlApplicationContext( 
		              "C:\\Users\\admin\\SPRING_FW_WORKSPACE\\08_Spring_Bean_Scope\\Product1.xml"); 
		 
		  // 1. Requesting/Calling IOC Container for Product Object 
		  Product1 p1 = (Product1) context.getBean("product1"); 
		  System.out.println(p1.getProductId()); 
		  System.out.println(p1); 
		 
		  // 2. Requesting/Calling IOC Container for Product Object 
		  Product1 p2 = (Product1) context.getBean("product1"); 
		  System.out.println(p2.getProductId()); 
		  System.out.println(p2); 
		 
		  // 3. Requesting/Calling IOC Container for Product Object 
		  Product1 p3 = (Product1) context.getBean("product1"); 
		  System.out.println(p3.getProductId()); 
		  System.out.println(p3); 
		 }
}
