package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHibernate {

	public static void main(String[] args) {
	   ApplicationContext context = new ClassPathXmlApplicationContext("hibernatexml.xml"); 
	   EmployeeDao dao = (EmployeeDao) context.getBean("emp");
	   Employee emp = new Employee();
	   emp.setEmpId(101);
	   emp.setEmpName("AAA");
	   emp.setEmpSalary(3000);
	   
	   dao.insertEmployee(emp);
	   
	   
	   
	}

}
