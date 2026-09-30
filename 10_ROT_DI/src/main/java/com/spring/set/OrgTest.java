package com.spring.set;

import java.util.List;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrgTest {

	
	public static void main(String[] args) {
		ApplicationContext context = new  ClassPathXmlApplicationContext("Org.xml");
		Orgnaization org = (Orgnaization) context.getBean("org");
		List<String> empNames = org.getEmpNames();
		for (String name : empNames) {
			System.out.println("EmpNames "+name);
		}
		
		Set<Integer> empIDs = org.getEmpIDs();
		for (Integer i : empIDs) {
			System.out.println("EmpID "+i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
