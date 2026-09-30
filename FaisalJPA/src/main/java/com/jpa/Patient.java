package com.jpa;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Patient {

	@Id
	private String emailID;
	private String name; 
	private int age; 
	private String gender;
	private String contact;
	
	
	public Patient() {
		
	}
	
	public Patient(String name, int age, String gender, String contact, String emailID) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.contact = contact;
		this.emailID = emailID;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	@Override
	public String toString() {
		return "Patient [name=" + name + ", age=" + age + ", gender=" + gender + ", contact=" + contact + ", emailID="
				+ emailID + "]";
	}
	
	
	
	
}
