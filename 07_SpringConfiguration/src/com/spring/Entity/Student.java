package com.spring.Entity;
  
import org.springframework.stereotype.Component;

@Component
public class Student {
	private String studentName;
	private int studentID;
	private double marksPercentage;
	
	public Student() {
		System.out.println(" Student Object Created: ");
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public double getMarksPercentage() {
		return marksPercentage;
	}
	public void setMarksPercentage(double marksPercentage) {
		this.marksPercentage = marksPercentage;
	}
	
	
}
