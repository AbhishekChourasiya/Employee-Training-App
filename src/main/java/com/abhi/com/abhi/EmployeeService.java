package com.abhi.com.abhi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class EmployeeService {
	@Autowired
	EmployeeInterface employeeInterface;
	
	
	public List<Employee> getAllEmployees() {
		List<Employee> employeeList = new ArrayList<>();
		employeeInterface.findAll().forEach(employeeList::add);
		return employeeList;
	}
	
	public Employee getEmployee(String id) {
		return employeeInterface.findOne(id);
	}
	
	public void addEmployee(Employee employee) {
		employeeInterface.save(employee);
	}
	
	public void delEmployee(String id) {
		employeeInterface.delete(id);
		
	}
}
