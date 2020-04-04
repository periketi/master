package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.emp.Employee;
import com.emp.Pancard;

public class ClientApp {

	public static void main(String[] args) {

		ApplicationContext ctxt = new ClassPathXmlApplicationContext("Beans.xml");

		Employee emp = ctxt.getBean("employee", Employee.class);
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		Pancard pan = ctxt.getBean("pancard", Pancard.class);
		System.out.println(pan.getEmpname());
		System.out.println(pan.getPannumber());

	}

}
