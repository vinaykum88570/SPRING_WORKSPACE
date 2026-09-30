package com.course;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class BeanConfiguration{
    
	@Bean("Java")
	@Scope("prototype")
	CourseDetails getCourseDetails(){
		
		CourseDetails java = new CourseDetails();
		java.setCourseName("Java");
		java.setNoOfDays(100);
		return java;
		
	}
	
}	
