package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
@Component
@Entity
public class Employee {
	
	@Id
	private int empId;
	private String empName;
	//private String designation;
	//private float salary;
	
	public Employee(){
		
	}
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
		//this.designation = designation;
		//this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	/*public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}*/
	
	
}
