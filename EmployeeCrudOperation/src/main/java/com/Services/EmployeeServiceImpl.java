package com.Services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import com.Dao.EmployeeRepository;
import com.Models.Employee;



public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepository employeeRepository ;
	 

	@Override
	public com.Models.Employee getEmployeeByName(String name) {
		// TODO Auto-generated method stub
		return (Employee) employeeRepository.findByName(name);
	}

	@Override
	public String deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		return;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	
}

	

