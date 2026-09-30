package com.spring;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	@Transactional
	public void insertEmployee(Employee emp) {
		hibernateTemplate.save(emp);
		
	}

	@Override
	@Transactional
	public void updateEmployee(Employee emp) {
		hibernateTemplate.update(emp);
		
	}

	@Override
	@Transactional
	public void deleteEmployeebyID(int empID) {
		Employee emp = hibernateTemplate.get(Employee.class,empID);
		hibernateTemplate.delete(emp);
		
	}

	@Override
	@Transactional
	public void deleteEmployee(Employee emp) {
		hibernateTemplate.delete(emp);
		
	}

	@Override
	public Employee getEmployeeById(int empID) {
		
	    return hibernateTemplate.get(Employee.class,empID);
	}

	@Override
	public List<Employee> getAllEmployeeById() {
	
		return hibernateTemplate.loadAll(Employee.class);
	}

}
