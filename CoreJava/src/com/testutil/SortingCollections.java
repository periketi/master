package com.testutil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingCollections {

	public static void main(String[] args) {
 
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("RAVI",33,500));
		list.add(new Employee("JANNU",54,900));
		list.add(new Employee("ISHU",3,300));
		list.add(new Employee("TAMMU",1,600));
		System.out.println("before---------->"+list);
		Collections.sort(list);
		System.out.println("after----with ID------>"+list);
		Collections.sort(list,new EmpNameComparator());
		System.out.println("after----with Name------>"+list);
		Collections.sort(list,new EmpSalComparator());
		System.out.println("after----with age------>"+list);

}
}