package com.Injecting.collection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class StudentApplication {

	public static void main(String[] args) { 
		 ApplicationContext context =  
				 //  StuBeans3
		       new FileSystemXmlApplicationContext("C:\\\\Users\\\\admin\\\\SPRING_FW_WORKSPACE\\\\01_Spring Base\\\\StuBeans3.xml"); 
		  // get student instance from container 
		                          Students3 s1 = (Students3) context.getBean("studentOne");   
		  System.out.println(s1.getStudId()); 
		  System.out.println(s1.getStuName()); 
		  System.out.println(s1.getPassedOutYear()); 
		  System.out.println(s1.getAvgOfMarks()); 
		  System.out.println(s1.isSelected()); 
		  System.out.println(s1.getEmails());   // List Values 
		  System.out.println(s1.getMobileNumbers());  // Set Values 
		  System.out.println(s1.getSubMarks()); //Map values 
		 }
	 
}
