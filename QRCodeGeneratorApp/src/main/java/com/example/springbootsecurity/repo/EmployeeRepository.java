package com.example.springbootsecurity.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootsecurity.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	

}
