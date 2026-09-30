package com.vinay.operations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vinay.SpringJPAConfiguration;
import com.vinay.entity.Patient;

public class PatientApplication2 {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringJPAConfiguration.class);
		 PatientOperation ops = context.getBean(PatientOperation.class);
		 
		 // Fetch by Email Id
//		Patient patient = ops.fetchByEmailID("vinay@");
//		System.out.println(patient);
	
		 // Fetch by List Of Similar Age
//		List<Patient> fetchByAge = ops.fetchByAge(21);
//		fetchByAge.stream().forEach(all->System.out.println(all));
		
		 // Fetch By All Gender
//		List<Patient> listOfMale = ops.getByGender("Male");
//		listOfMale.stream().forEach(all->System.out.println(all));

		// Fetch By Age and Gender
//		List<Patient> patientWithAgeAndGender = ops.getPatientWithAgeAndGender(21, "male");
//		patientWithAgeAndGender.stream().forEach(all->System.out.println(all));

		// List Of Patient
//		List<Patient> listOfPatient = ops.getAllPatients();
//		listOfPatient.stream().forEach(all->System.out.println(all));
		 
		 //Delete By ID
		 ops.deletePatientsWithEmailID("sachin@");
		 
		 
		 
		 
		 
		 
		 
		 
	}
}
