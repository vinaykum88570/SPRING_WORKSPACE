package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.Entity.Student;

@Configuration
public class BeanConfiguration {
// Student Bean class Configuration
	
	// Bean Creation Methods 
	@Bean(name="student")
	public Student getStudent() {
		 return new Student();
	}
	
	// 2nd Configuration for student
	@Bean(name="student2")
	public Student getStudentVinay() {
		 return new Student();
	}
	
}
