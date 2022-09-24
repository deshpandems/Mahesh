package com.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Models.Employee;
import com.Services.EmployeeService;


public class EmployeeController {

	@RestController
	@RequestMapping("/user")
	public class EmployeeCotroller {

		@Autowired
		EmployeeService employeeService;
		

		@PostMapping("/addemp")
		public String addEmployee(@RequestBody Employee employee) {
			
			employeeService.save(employee);

			return "hi";
		}

		
		
		@GetMapping("/findallemp")
		public List<Employee> findAllEmployee() {

			return employeeService.getEmployee();
		}
		
		
		
		@GetMapping("/employeebyid/{id}")
		public Employee findEmployeeById(@PathVariable int id) {

			return employeeService.getEmployeeById(id);
		}
		
		
		
		@GetMapping("/employeebyname/{name}")
		public Employee findEmployeeByName(@PathVariable String name) {

			return employeeService.getEmployeeByName(name);
		}
		
		@DeleteMapping ("/deleteempbyid/{id}")
		public String deleteEmployee(@PathVariable int id) {

			return employeeService.deleteEmployee(id);
		}
		
		@PutMapping ("/updateemployee")
		public Employee updateEmployee(@RequestBody Employee employee) {
			return employeeService.updateEmployee(employee);
		}
		
		
	} 

}
