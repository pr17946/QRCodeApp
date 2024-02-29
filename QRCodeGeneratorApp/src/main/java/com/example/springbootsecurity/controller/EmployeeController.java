package com.example.springbootsecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootsecurity.model.Employee;
import com.example.springbootsecurity.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	

	    @GetMapping("all")
	    public ResponseEntity<List<Employee>> getAllEmployees() {
	        return ResponseEntity.ok(employeeService.getAllEmployees());
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
	        return ResponseEntity.ok(employeeService.findById(id));
	    }

	    @PostMapping("save")
	    public Employee addEmployee(@RequestBody Employee employee) {
	        return employeeService.addEmployee(employee);
	    }


}
