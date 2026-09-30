package com.setter.Injection;


import java.util.Map;

import java.util.Set;

public class Student1 { 
	 
	 private String studentName; 
	 private String studentId; 
	 private String clgName; 
	 public String getClgName() { 
	  return clgName; 
	 } 
	 public void setClgName(String clgName) { 
	  this.clgName = clgName; 
	 } 
	 public String getStudentName() { 
	  return studentName; 
	 } 
	 public void setStudentName(String studentName) { 
	  this.studentName = studentName; 
	 } 
	 public String getStudentId() { 
	  return studentId; 
	 } 
	 public void setStudentId(String studentId) { 
	  this.studentId = studentId; 
	 } 
	 public void printStudentDeatils() { 
	  System.out.println("This is Student class"); 
	 } 
	 public double getAvgOfMArks() { 
	  return 456 / 6; 
	 } 
	} 