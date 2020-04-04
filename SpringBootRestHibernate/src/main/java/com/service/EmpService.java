package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.controller.EmpController;
import com.entity.Employee;

@RestController
public class EmpService {

	
	@RequestMapping(method = RequestMethod.GET, value = "/test")
	public String setEmpData() {
 		return "Spring Boot App Working";
	}

	@Autowired
	EmpController empController;

	@RequestMapping(method = RequestMethod.GET, value = "/emp/{id}")
	public Employee getEmpData(@PathVariable("id") String id) {
 		return empController.getEmpData(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/emp")
	public Employee setEmpData(@RequestBody Employee empDetail) {
 		return empController.addEmp(empDetail);
	}
	@RequestMapping(method = RequestMethod.PUT, value = "/emp/{id}")
	public Employee updateEmpData(@RequestBody Employee empDetail) {
 		return empController.updateEmp(empDetail);
	}
	@RequestMapping(method = RequestMethod.GET, value = "/allemp")
	public List<Employee> getEmpData() {
  		return empController.getAllEmpData();
	}
	@RequestMapping(method = RequestMethod.DELETE, value = "/emp/{id}")
	public Employee deleteEmpData(@PathVariable("id") String id) {
 		return empController.deleteEmpData(id);
	}
}
