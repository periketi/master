package com.testutil;

import java.util.HashSet;
import java.util.Set;

public class HashCodeANDEquals {
	
	public static void main(String args[]){
	Employee emp1 = new Employee();
	Employee emp2 = new Employee();
	emp1.setEmpName("Ravi");
	emp2.setEmpName("Ravi");
	System.out.println("emp1 is equal to emp2====>"+emp1.equals(emp2));
	Set<Employee> employees = new HashSet<Employee>();
	employees.add(emp1);
	employees.add(emp2);
	System.out.println(employees+"   size---"+employees.size());
	}
}
