package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetingsTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(GreetingConfig.class);
		Greetings greeting = context.getBean(Greetings.class);
		greeting.setMeassage("Good Morning");
		System.out.println(greeting.getMeassage());
	}

}
