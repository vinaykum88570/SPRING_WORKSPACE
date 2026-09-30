package com.course;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringBeansApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(CourseDetails.class,BeanConfiguration.class);
		context.refresh();
		
		// 1St time python
		CourseDetails coures1 = (CourseDetails) context.getBean("python");
		System.out.println("python :"+coures1);
		
		CourseDetails coures2 = (CourseDetails) context.getBean("python");
		System.out.println("python :"+coures2);

		// 2St time python
		CourseDetails coures3 = (CourseDetails) context.getBean("Java");
		System.out.println("Java :"+coures3); 
				
		CourseDetails coures4 = (CourseDetails) context.getBean("Java");
		System.out.println("Java :"+coures4);
		
	}
}
