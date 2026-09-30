package com.spring.Component;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.Entity.Product;
import com.spring.Entity.Student;

public class SpringComponantDemo {

	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.spring.Entity");
//		context.register(Product.class,Student.class);
		context.refresh();
		
	    Product product = (Product) context.getBean("product1");
	    System.out.println(product);
		
		
	}
}
