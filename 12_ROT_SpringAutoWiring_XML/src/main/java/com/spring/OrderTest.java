package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrderTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("order.xml");
		Order order = (Order) context.getBean("order");
		System.out.println(order.getItem());
		 
		
	}
}
