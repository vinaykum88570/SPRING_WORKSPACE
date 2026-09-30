package com.spring.qualifier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class QualifireTestMainApp {

	public static void main(String[] ar) { 
		 
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class); 
        
        Employee empployee = (Employee) context.getBean("employee"); 
        Address empAdd = empployee.getAdd(); 
        System.out.println(empAdd.getPincode()); 
        System.out.println(empAdd.getStreetName()); 
        
        /*
        ---> There may be a situation when you create more than one bean of the 
        same type and want to wire only one of them with a property. In such cases, you can 
        use the @Qualifier annotation along with @Autowired to remove the confusion by 
        specifying which exact bean will be wired.  */
       }

}
