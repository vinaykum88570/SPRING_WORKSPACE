package com.vinay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.vinay.entity.Patient;

@Component
public interface PatientRepository  extends JpaRepository<Patient, String>{

    
	List <Patient> findByAge(int age);
	
	List <Patient> findByGender(String gender);
	
	List <Patient> findByAgeAndGender(int age,String gender);
	
}
