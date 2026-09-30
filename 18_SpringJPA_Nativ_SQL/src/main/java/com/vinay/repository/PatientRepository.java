package com.vinay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import com.vinay.entity.Patient;

@Component
public interface PatientRepository  extends JpaRepository<Patient, String>{

	@Query(value="select * from patient",nativeQuery = true)
    public List<Patient> getAllPatient();
	
	// Indexed Based
	@Query(value="select * from patient where emailID=?1",nativeQuery = true)
    public Patient getDetailsByEmail(String emailID);
	
	// By Age and Gender
	@Query(value="select * from patient where age=?1 and gender=?2",nativeQuery = true)
	 public List<Patient> getPatientDetailsByAgeAndGender(int age , String gender);
	
	// Adding patient Details:
	@Query(value="Insert Into patient values(:emailID,:age,:contact,:gender,:name",nativeQuery = true)
	public void addPatient(
			@Param("emailID") String emailID,
			@Param("age")int age,
			@Param("contact") String contact, 
			@Param("gender") String gender, 
			@Param("name") String name  );
			             
	
}
