package com.annotataion.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.setterInjection.Employee;

public class DIMainApplication {

	
	public static void main(String[] args) {
//		AnnotationConfigApplicationContext context  = new AnnotationConfigApplicationContext();
//		context.register(Address.class, Employe.class);
//		context.refresh();
//		
//		Employe emp = context.getBean(Employe.class);
//		System.out.println(emp);
//		System.out.println(emp.getAddress());
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(Address.class,Employee.class);
		context.refresh();
		
		Employee employe = context.getBean(Employee.class);
		System.out.println(employe);
		System.out.println(employe.getStudent());
		
	}
}
