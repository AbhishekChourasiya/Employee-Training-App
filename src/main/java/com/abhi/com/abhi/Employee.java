package com.abhi.com.abhi;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private String name;
	private String id;
	private String department;
	private String role;
	
	public Employee() {
		
	}
	
	public Employee(String name, String id, String department, String role) {
		// TODO Auto-generated constructor stub
		super();
		this.name = name;
		this.id = id;
		this.department = department;
		this.role = role;
	}



	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}
