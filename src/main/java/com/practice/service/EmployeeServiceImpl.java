package com.practice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.entity.Employee;
import com.practice.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepository empolyeeRepo;

	@Override
	public Employee upsert(Employee employee) {
		Employee saved = empolyeeRepo.save(employee);
		return saved;
	}

	@Override
	public List<Employee> getAll() {
		List<Employee> findAll = empolyeeRepo.findAll();
		return findAll;
	}

	@Override
	public Employee getById(Integer id) {
		Optional<Employee> findById = empolyeeRepo.findById(id);
		Employee employee = findById.get();
		return employee;
	}

	@Override
	public void deleteEmployee(Integer id) {
		empolyeeRepo.deleteById(id);
	}

	

}
