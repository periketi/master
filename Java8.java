package com;

import java.util.*;
public class Java8 {

	public static void main(String[] args) {
 		Hello h1 = () ->System.out.println("Hello");
		h1.sayHello();
		
		List <Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(1,"q","q"));
		emp.add(new Employee(2,"f","f"));
		emp.add(new Employee(3,"u","u"));
		emp.add(new Employee(4,"a","a"));
		emp.add(new Employee(5,"l","l"));
		
		emp.forEach(emps->System.out.println(emps));
		
		HashMap <Integer,Employee> hm = new HashMap<Integer,Employee>();
		hm.put(1, emp.get(0));
		hm.put(2, emp.get(1));
		hm.put(3, emp.get(2));
		hm.put(4, emp.get(3));
		hm.put(5, emp.get(4));
		
		hm.forEach((key,value)->System.out.println("::KEY::"+key+"::Value::"+value.getEmpId()));
	}

}

interface Hello {
	void sayHello();
}
