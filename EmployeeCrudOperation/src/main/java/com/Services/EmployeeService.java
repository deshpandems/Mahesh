package com.Services;

import java.util.List;
import com.Models.Employee;

public interface EmployeeService {

	Employee getEmployeeByName(String name);

	String deleteEmployee(int id);

	Employee getEmployeeById(int id);

	List<Employee> getEmployee();

	void save(Employee employee);

	Employee updateEmployee(Employee employee);

}
