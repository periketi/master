package com;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import repo.EmployeeRepositery;

@RestController
public class EmpResource {

	@Autowired
	EmployeeRepositery empRepo;

	@GetMapping("/test")
	public String test() {
		return "it works!";
	}

	@GetMapping("/emp/all")
	public List<Employee> getAllEmp() {
		return empRepo.findAll();
	}

	@GetMapping("/emp/{empId}")
	public Optional<Employee> getEmp(@PathVariable("empId") Integer empId) {
		return empRepo.findById(empId);
	}

	@GetMapping("/emp/{empId}/{empName}")
	public Employee updateEmp(@PathVariable("empId") Integer empId, @PathVariable("empName") String empName) {
		
		Employee emp = empRepo.getOne(empId);
		emp.setEmpName(empName);
		
		return emp;
	}
}
