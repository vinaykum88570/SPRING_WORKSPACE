package com.spring.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.Entity.Product;
import com.spring.Entity.Student;
import com.spring.config.BeanConfiguration;
import com.spring.config.SpringBeanConfiguration;

public class BeansTesting {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.scan("com.spring.*");
		context.refresh();

		Product product = (Product) context.getBean("mouse");
		System.out.println(product);
		System.out.println(product.getPrice());
	
        Student stu1 = (Student) context.getBean("student");
        System.out.println(stu1.getMarksPercentage());
        
	}

}
