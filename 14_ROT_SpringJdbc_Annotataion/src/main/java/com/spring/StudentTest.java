package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentTest {

	public static void main(String[] args) {
	   ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
	   StudentDao dao = context.getBean(StudentDao.class);
	   
	   Student stud = new Student();
	   stud.setStudentNum(111);
	   stud.setStudentName("aaa");
	   stud.setStudentMarks(500);	
	   dao.insertStudent(stud);
	}
	
}
