
package com.annotataion.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employe {

    private String empName;
    private double salary;
    private Address address;
    
    public Employe() {
	System.out.println("Employee Object Created");
	}

    
    public Employe(String empName, double salary, @Autowired Address address) {
		super();
		this.empName = empName;
		this.salary = salary;
		this.address = address;
	}

	public String getEmpName() {
		return empName;
	}
    
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	@Autowired
	public void setAddress(Address address) {
		System.out.println("setter methods of Address in Employee class ");
		this.address = address;
	}
    
    
}
