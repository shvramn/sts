package com.twg.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twg.springboot.entity.Employee;
import com.twg.springboot.service.EmployeeService;

@RestController
public class HomeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/")
	public String insertEmployee()
	{
		Employee employee= new Employee();
		employee.setId(3);
		employee.setName("ramarao");
		employee.setDesignation("students");
		employee.setDepartment("ece");
		employee.setExp(1);
		
		Employee emp=employeeService.saveEmployee(employee);
		
		return "Employee "+emp.getName()+"with id "+emp.getId()+"is saved successfully";
		
		
    
	
		
	}

}
