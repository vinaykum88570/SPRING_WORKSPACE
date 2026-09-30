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
	
	public void addPatient(Patient p) {
		repository.save(p);
	}
	
	public void addMorePatient(List<Patient> patients) {
        repository.saveAll(patients);
	}
	
	public void updatePatientData(Patient p) {
		repository.save(p);
	}
	
	//Based On Email Id : Primary key
	public Patient fetchByEmailID(String emilID) {
		Patient p = repository.findById(emilID).get();
		return p;
	}
	
	//Based On Non-Primary key column :
	public List<Patient> fetchByAge(int age) {
		List<Patient> patientOfSameAge = repository.findByAge(age);
		return patientOfSameAge;
	}
	
	// get Based on Gender
	public List<Patient> getByGender(String gender) {
		List<Patient> patientOfSameGender = repository.findByGender(gender);
		return patientOfSameGender;
	}
	
	// Based On Age and Gender
	public List<Patient> getPatientWithAgeAndGender(int age , String Gender){
		List<Patient> byAgeAndGender = repository.findByAgeAndGender(age, Gender);
		return byAgeAndGender;
	}
	
	// get All Patient
	public List<Patient> getAllPatients(){
		List<Patient> listOfPatient = repository.findAll();
		return listOfPatient;
	}
	
	// Delete Based On Email Id:
	
	public void deletePatientsWithEmailID(String email){
		 repository.deleteById(email);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
