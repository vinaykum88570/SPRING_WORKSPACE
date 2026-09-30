package com.autowired;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringBeanAutoWiredApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(Address.class,Employee.class);
		context.refresh();
		
		Address home = (Address) context.getBean("home");
		System.out.println(home);
		
		Address office = (Address) context.getBean("office");
		System.out.println(office);
		
		Employee employee = context.getBean(Employee.class);
		System.out.println(employee);
		System.out.println(employee.getAddress());
		
		
	}
}
