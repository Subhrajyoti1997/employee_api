package com.practice.repository;

//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	//Optional<Employee> findByEmail(String email);

}
