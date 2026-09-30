package com.setter.Injection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;



public class SpringApplication {

	public static void main(String[] args) { 
		 
		BeanFactory factory =  
				// StuBeans1.xml
		         new   FileSystemXmlApplicationContext("C:\\\\Users\\\\admin\\\\SPRING_FW_WORKSPACE\\\\01_Spring Base\\\\StuBeans1.xml"); 
		   
		// Requesting Spring Container for Student Object 
		  Student1 s1 = (Student1) factory.getBean("s1");  
		  System.out.println(s1.getStudentId()); 
		  System.out.println(s1.getStudentName()); 
		  System.out.println(s1.getClgName()); 
		  s1.printStudentDeatils(); 
		  System.out.println(s1.getAvgOfMArks()); 
		 }
}
