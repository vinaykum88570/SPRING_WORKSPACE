package com.jpa;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PatientOperation {

	@Autowired
	PatientRepository repository;
	
//  Fetch by Email Id --> aaa@gmail.com --->  patient
	// Pk --> findById()
	
	public Patient fetchByemailID(String email) {
		return repository.findById(email).get();
	}
	
	//  Fetch by Age
	// non Pk --> findById() not used
	// non Pk ==> age --> findByAge
	
	public List<Patient> fetchByage(int age) {
		return repository.findByAge(age);
	}
	
	public List<Patient>findByGender(String gender){
		return repository.findByGender(gender);
	}
	
}
