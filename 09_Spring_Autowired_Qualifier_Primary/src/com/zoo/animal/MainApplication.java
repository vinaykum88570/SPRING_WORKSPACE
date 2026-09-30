package com.zoo.animal;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {

	public static void main(String[] args) {
		
//		Animal animal = new Tiger();
		
//		Animal animal = new Lion();
//		animal.nameOfAnimal();
	
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.zoo");
		context.refresh();
		
		Zoo zoo = context.getBean(Zoo.class);
	
		
		
	}
 
}
