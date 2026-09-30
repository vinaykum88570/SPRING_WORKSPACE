 	package com.vinay.operations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vinay.entity.Patient;
import com.vinay.repository.PatientRepository;

@Component
public class PatientOperation {

	@Autowired	
	PatientRepository repository;
	
	
	// select * from patient
   public List<Patient> getPatientDetails() {
    List<Patient> allPatient = repository.getAllPatient();
	   return allPatient;
   }
	
   // select * from patient where emailID=?
   public Patient getPatientDetailsBYEmailID(String email) {
	   Patient detailsByEmail = repository.getDetailsByEmail(email);
		   return detailsByEmail;
	   }
	
   // Based On Age And Gender
   public List<Patient> getPatientDetailsBYAgeAndGender(int age ,String gender) {
	   List<Patient> patientDetailsByAgeAndGender = repository.getPatientDetailsByAgeAndGender(age, gender);
		   return patientDetailsByAgeAndGender;
	   }
   
   // Add Patient
   
}
