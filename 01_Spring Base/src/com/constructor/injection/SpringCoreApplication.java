package com.constructor.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringCoreApplication {

	public static void main(String[] args) { 
		// Address.xml 
		 ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\admin\\SPRING_FW_WORKSPACE\\01_Spring Base\\Address.xml"); 
		 
		 AccountDetails details = (AccountDetails) context.getBean("accountDeatils"); 

	System.out.println(details.getName()); 
	System.out.println(details.getBalance()); 
	System.out.println(details.getMobiles()); 
	System.out.println(details.getCustomerAddress().getFlatNo());
	System.out.println(details.getCustomerAddress().getHouseName());

}
}