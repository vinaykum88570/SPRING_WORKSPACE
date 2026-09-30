package com.setterInjection;

public class Employee {
	private int id;  
	private String name;  
	private String city;  
	private Student student;
	
	public int getId() {  
	    return id;  
	}  
	public void setId(int id) {  
	    this.id = id;  
	}  
	public String getName() {  
	    return name;  
	}  
	public void setName(String name) {  
	    this.name = name;  
	}  
	  
	public String getCity() {  
	    return city;  
	}  
	public void setCity(String city) {  
	    this.city = city;  
	}  
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	void display(){  
	    System.out.println(id+" "+name+" "+city);  
	}  
}
