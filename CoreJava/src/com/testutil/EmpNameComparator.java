package com.testutil;

import java.util.Comparator;

public class EmpNameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o,Employee o1) {
 		return o.getEmpName().compareTo(o1.getEmpName());
	}

}
