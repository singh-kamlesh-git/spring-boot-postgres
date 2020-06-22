package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeRestController {

	@Autowired
	EmployeeDao dao;
	@PostMapping("/employees")
	void newEmployee(@RequestBody Employee newEmployee) {
		dao.insertEmployee(newEmployee);
	}
	@GetMapping("/employees")
	List<Employee> getEmployees() {
		return dao.findAll();
	}
}
