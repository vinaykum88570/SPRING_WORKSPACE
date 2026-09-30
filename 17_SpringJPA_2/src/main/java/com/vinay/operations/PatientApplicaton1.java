package com.vinay.operations;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vinay.SpringJPAConfiguration;
import com.vinay.entity.Patient;

public class PatientApplicaton1 {

	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringJPAConfiguration.class);
		PatientOperation ops = context.getBean(PatientOperation.class);	
		
		// List Of Patient
		Patient p1 = new Patient();
		p1.setEmailID("sachin@");
		p1.setName("Sachin");
		p1.setContact("33333");
		p1.setAge(34);
		p1.setGender("Female");
		
		Patient p2 = new Patient();
		p2.setEmailID("sakshi@");
		p2.setName("Sakshi");
		p2.setContact("111111");
		p2.setAge(25);
		p2.setGender("Female");
		
		List<Patient> allPatients = new ArrayList<Patient>();
		allPatients.add(p1);
		allPatients.add(p2);
		ops.addMorePatient(allPatients);
		
//
//		// Update patient
//		Patient abc = new Patient();
//		abc.setEmailID("vinay@");
//		abc.setName("ZZZ");
//		abc.setContact("ZZZ");
//		abc.setAge(99);
//		abc.setGender("ZZZ");
//		ops.updatePatientData(abc);
		
	}
}
