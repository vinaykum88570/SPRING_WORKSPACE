package com.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, String> {

	public List<Patient> findByAge(int age); //  21 
	
	public List<Patient> findByGender(String gender);
	
}
