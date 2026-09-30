package com.zacksoft.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zacksoft.AppConfig;
import com.zacksoft.sbeans.Car;
import com.zacksoft.sbeans.Engine;
import com.zacksoft.sbeans.PetrolEngine;

public class TestApplication {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		System.out.println("line 1");
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);
		Car car = container.getBean("car",Car.class);
		car.drive();
		
		container.close();
		System.out.println("line 2");
	}
}
