package com.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.entity.Employee;
import com.practice.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	@PostMapping("/employee")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		Employee createEmployee = employeeService.upsert(employee);
		return new ResponseEntity<Employee>(createEmployee,HttpStatus.CREATED);
	}
	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getAllEmployee(){
		List<Employee> allEmployees = employeeService.getAll();
		return new ResponseEntity<>(allEmployees,HttpStatus.OK);
	}
	@GetMapping("/employee/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer id){
		Employee oneEmployee = employeeService.getById( id);
		return new ResponseEntity<>(oneEmployee,HttpStatus.OK);
	}
	@PutMapping("/employee")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
		Employee updatedEmployee = employeeService.upsert(employee);
		return new ResponseEntity<>(updatedEmployee,HttpStatus.OK);
	}
	@DeleteMapping("/employee/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable Integer id){
		employeeService.deleteEmployee(id);
		return new ResponseEntity<>("employee deleted successfully",HttpStatus.OK);
	}
	//oooooooooo
	//hjjhgjhghjghjfgh
	//hjghjgjhghj
}
