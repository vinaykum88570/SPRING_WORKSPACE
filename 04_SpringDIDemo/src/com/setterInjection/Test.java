package com.setterInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Test {

	public static void main(String[] args) {
            BeanFactory beans = new FileSystemXmlApplicationContext("ApplicationContext.xml");
			
			Employee a  = (Employee) beans.getBean("employee");
	        
	        System.out.println(a.getStudent().getAge());

	}

}
