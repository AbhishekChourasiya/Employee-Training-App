  package com.abhi.com.abhi;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeInterface  extends CrudRepository<Employee, Serializable>{

	
}
