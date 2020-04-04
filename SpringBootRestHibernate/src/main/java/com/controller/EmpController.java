package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.dao.EmpDAO;
import com.entity.Employee;

@Controller
public class EmpController {
	
	@Autowired
	EmpDAO empdao ;
	
	public Employee getEmpData(String id){
		return empdao.getEmployeeData(Integer.parseInt(id));
	}

	public Employee addEmp(Employee emp) {
		return empdao.setEmployeeData(emp);
	}

	public List<Employee> getAllEmpData() {
		return empdao.getAllEmployeeData();
	}

	public Employee deleteEmpData(String id) {
		return empdao.deleteEmpData(Integer.parseInt(id));
	}

	public Employee updateEmp(Employee empDetail) {
		return empdao.updateEmpData(empDetail);
	}
}
