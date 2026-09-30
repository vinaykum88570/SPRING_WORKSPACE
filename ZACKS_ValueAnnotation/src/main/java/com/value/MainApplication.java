package com.value;

import org.glassfish.jaxb.runtime.v2.runtime.output.XMLStreamWriterOutput;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
        Student std = context.getBean("std1",Student.class);
        System.out.println(std);	
        
        
	}
}
