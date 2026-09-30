package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.addr.Address;
import com.emp.Employee;

public class MainApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(Address.class,Employee.class);
		context.refresh();
		
		Employee emp = context.getBean(Employee.class);
		System.out.println("Employee :"+ emp);
		System.out.println("Address :"+ emp.getAddress());
		
		

	}

}
