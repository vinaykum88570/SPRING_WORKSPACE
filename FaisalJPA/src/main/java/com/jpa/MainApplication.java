package com.jpa;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringJPAConfiguration.class);
		
		PatientOperation ops = context.getBean(PatientOperation.class);
		 
		 
		 
       //  Fetch by Email Id 
//		Patient emailID = ops.fetchByemailID("sachin@");
//		System.out.println(emailID.getAge());
//		System.out.println(emailID.getContact());
//		System.out.println(emailID.getEmailID());
//		System.out.println(emailID.getName());
//		System.out.println(emailID.getGender());
		 
		 
     	
	//Fetch by List Of Similar Age 
//	List<Patient> fetchByage = ops.fetchByage(21);
//	for (Patient patient : fetchByage) {
//		System.out.println(patient);
//	}
   
		 
		 
		 //	Fetch By All Gender  == > male
		 List<Patient> byGender = ops.findByGender("female");
		 for (Patient patient : byGender) {
				System.out.println(patient);
			}
		

	// Fetch By Age and Gender


	// List Of Patient
	 
	//  Delete By ID
	

		 
	}
	
}