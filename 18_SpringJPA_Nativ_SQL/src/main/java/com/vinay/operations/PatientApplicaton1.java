package com.vinay.operations;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vinay.SpringJPAConfiguration;
import com.vinay.entity.Patient;

public class PatientApplicaton1 {

	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringJPAConfiguration.class);
	    PatientOperation ops = context.getBean(PatientOperation.class);
		
	    // Get List Of patient
//	    List<Patient> listOfPatientDetails = ops.getPatientDetails();
//	    listOfPatientDetails.stream().forEach(all->System.out.println(all));
	    
	    // By EmailID
//	    Patient patientDetailsBYEmailID = ops.getPatientDetailsBYEmailID("rohit@");
//	    System.out.println(patientDetailsBYEmailID);
	    
	    // By Age and gender 
	    List<Patient> patientDetailsBYAgeAndGender = ops.getPatientDetailsBYAgeAndGender(25, "female");
	    patientDetailsBYAgeAndGender.stream().forEach(all->System.out.println(all));
	}
}
