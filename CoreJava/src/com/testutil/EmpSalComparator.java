package com.testutil;

import java.util.Comparator;

public class EmpSalComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return Double.compare(o1.getEmpAge(), o2.getEmpAge());
	}

}
