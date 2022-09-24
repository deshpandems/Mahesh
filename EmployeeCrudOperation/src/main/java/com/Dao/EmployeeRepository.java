package com.Dao;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.jpa.repository.JpaRepository;



public interface EmployeeRepository<Employee> extends JpaRepository<Employee, Integer> {

	Employee findByName(String name);

	
}
