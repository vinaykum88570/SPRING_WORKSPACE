package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
        ApplicationContext context	= new FileSystemXmlApplicationContext("C:\\Users\\admin\\SPRING_FW_WORKSPACE\\ROT_DI\\src\\main\\resources\\customer.xml");
        Customer customer = (Customer) context.getBean("customer");
        
        System.out.println("CustomerOD->"+customer.getCustomerOD());
        System.out.println("CustomerName->"+customer.getCustomerName());
        System.out.println("Address->"+customer.getAddress());
             
	}

}
