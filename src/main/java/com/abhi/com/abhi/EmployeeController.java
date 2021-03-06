package com.abhi.com.abhi;

import java.util.ArrayList;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/employees")
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}
	
	@RequestMapping("/employees/{id}")
	public Employee getEmployee(@PathVariable String id) {
		return employeeService.getEmployee(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/employees")
	public void addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
	}
	@RequestMapping(method= RequestMethod.DELETE, value="/employees/del/{id}")
	public void delEmployee(@PathVariable String id) {
		employeeService.delEmployee(id);
		
	}
}
