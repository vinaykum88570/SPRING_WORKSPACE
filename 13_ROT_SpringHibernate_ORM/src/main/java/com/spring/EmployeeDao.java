package com.spring;

import java.util.List;

public interface EmployeeDao {

	public void insertEmployee(Employee emp);
	public void updateEmployee(Employee emp);
	public void deleteEmployeebyID(int empID);
	public void deleteEmployee(Employee emp);
	public Employee getEmployeeById(int empID);
	public List<Employee> getAllEmployeeById();
	
}
