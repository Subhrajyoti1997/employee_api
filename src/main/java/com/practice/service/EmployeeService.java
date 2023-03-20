package com.practice.service;

import java.util.List;

import com.practice.entity.Employee;

public interface EmployeeService {
    public Employee upsert(Employee employee);
    
    public List<Employee> getAll();
    
    public Employee getById(Integer id);
    
	public void deleteEmployee(Integer id);

    public void delete();
    
    

    

}
