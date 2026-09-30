package com.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("std")
@PropertySource("com/value/App.properties")
public class Student {
	
//	@Value("${os.name}")
//	@Value("${java.version}")
//	@Value("${user.name}")
//	@Value("${Path}")
	
//	@Value("${std.name}")
//	private String name;
//	
//	@Value("${std.age}")
//	private int age;
	

//	public void setName(@Value("${std.name}") String name) {
//		this.name = name;
//	}
//
//	public void setAge(@Value("${std.age}") int age) {
//		this.age = age;
//	}
	
//	public Student(@Value("${std.name}")String name ,@Value("${std.age}") int age) {
//		super();
//		this.name = name;
//		this.age = age;
//	}
	
	private String name;
	private int age;

	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
}
