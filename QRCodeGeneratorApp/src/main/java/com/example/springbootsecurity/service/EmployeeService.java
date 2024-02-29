package com.example.springbootsecurity.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.springbootsecurity.model.Employee;
import com.example.springbootsecurity.repo.EmployeeRepository;

@Service
public class EmployeeService {
	
   @Autowired
   private EmployeeRepository empRepo;
   
    public List<Employee> getAllEmployees(){
    	return empRepo.findAll();	
    }

    public Employee addEmployee( Employee employee) {
    	return empRepo.save(employee);
    }
    
    public Employee findById(Long id) {
		return empRepo.findById(id)
				.orElseThrow(()->new RuntimeException("Invalid Employee id"));
    	
    }
	
}
