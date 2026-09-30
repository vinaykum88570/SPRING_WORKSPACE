package com.scope.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SingletonScopesDemo {

	public static void main(String[] args) {  
		 
		ApplicationContext context = new FileSystemXmlApplicationContext( 
		              "C:\\Users\\admin\\SPRING_FW_WORKSPACE\\08_Spring_Bean_Scope\\Product.xml"); 
		 
		  // 1. Requesting/Calling IOC Container for Product Object 
		  Product p1 = (Product) context.getBean("product"); 
		  System.out.println(p1.getProductId()); 
		  System.out.println(p1); 
		 
		  // 2. Requesting/Calling IOC Container for Product Object 
		  Product p2 = (Product) context.getBean("product"); 
		  System.out.println(p2.getProductId()); 
		  System.out.println(p2); 
		 
		  // 3. Requesting/Calling IOC Container for Product Object 
		  Product p3 = (Product) context.getBean("product"); 
		  System.out.println(p3.getProductId()); 
		  System.out.println(p3); 
		 }
}
