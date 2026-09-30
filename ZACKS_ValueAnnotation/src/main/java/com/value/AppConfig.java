package com.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com/value")
public class AppConfig {

	
	@Bean("std1")
	public Student getstudent(@Value("${std.name}")String name ,@Value("${std.age}")int age ) {
		Student std = new Student();
		std.setName(name);
		std.setAge(age);
		return std;
	}
}
