package com.Injecting.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.Spring;

public class Students3 {

	private String stuName; 
	 private int studId; 
	 private double avgOfMarks; 
	 private short passedOutYear; 
	 private boolean isSelected; 
	 private List<String> emails; 
	 private Set<String> mobileNumbers; 
	 private Map<String, String> subMarks; 
	 
	 public List<String> getEmails() { 
	  return emails; 
	 } 
	 public void setEmails(List<String> emails) { 
	  this.emails = emails; 
	 } 
	 public Set<String> getMobileNumbers() { 
	  return mobileNumbers; 
	 } 
	 public void setMobileNumbers(Set<String> mobileNumbers) { 
	  this.mobileNumbers = mobileNumbers; 
	 } 
	 public Map<String, String> getSubMarks() { 
	  return subMarks; 
	 } 
	 public void setSubMarks(Map<String, String> subMarks) { 
	  this.subMarks = subMarks; 
	 } 
	 public String getStuName() { 
	  return stuName; 
	 } 
	
	 public void setStuName(String stuName) { 
	  this.stuName = stuName; 
	 } 
	 public int getStudId() { 
	  return studId; 
	 } 
	 public void setStudId(int studId) { 
	  this.studId = studId; 
	 } 
	 public double getAvgOfMarks() { 
	  return avgOfMarks; 
	 } 
	 public void setAvgOfMarks(double avgOfMarks) { 
	  this.avgOfMarks = avgOfMarks; 
	 } 
	 public short getPassedOutYear() { 
	  return passedOutYear; 
	 } 
	 public void setPassedOutYear(short passedOutYear) { 
	  this.passedOutYear = passedOutYear; 
	 } 
	 public boolean isSelected() { 
	  return isSelected; 
	 } 
	 public void setIsSelected(boolean isSelected) { 
	  this.isSelected = isSelected; 
	 }
	
	
	
}
