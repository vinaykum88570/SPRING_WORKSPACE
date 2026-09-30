package com.spring.basic;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringCoreApp {

	public static void main(String[] args) { 
		// BeanFactory Object is called as IOC Container. 
		BeanFactory factory = new    
				// StuBeans.xml
		FileSystemXmlApplicationContext("C:\\\\Users\\\\admin\\\\SPRING_FW_WORKSPACE\\\\01_Spring Base\\\\StuBeans.xml"); 
		Student s = (Student) factory.getBean("stu"); 
		System.out.println(s.getStudnetName()); 
		} 

}
