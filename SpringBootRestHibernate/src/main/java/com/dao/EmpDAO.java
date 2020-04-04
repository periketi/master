package com.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.entity.Employee;

@Repository
public class EmpDAO {

	public static Map<String, Employee> empMap = new TreeMap<String, Employee>();
 
	SessionFactory factory = new Configuration().configure().addPackage("com.entity")
			.addAnnotatedClass(Employee.class).buildSessionFactory();
	Session session = null;
	public Employee getEmployeeData(int empId) {
		
	    session = factory.getCurrentSession();
		Transaction trans = session.beginTransaction();
 
		Employee emp = (Employee)session.get(Employee.class, new Integer(empId));
		trans.commit();
		if(emp!=null){
 			return emp;
		} else return null;
	}

	public Employee setEmployeeData(Employee emp) {
		session = factory.getCurrentSession();
 		Transaction trans = session.beginTransaction();
		emp.getEmpId();
		emp.getEmpName();
		session.save(emp);
		trans.commit();
		return emp;
	}

	public List<Employee> getAllEmployeeData() {
		List<Employee> list = new ArrayList<Employee>();
		session = factory.getCurrentSession();
 		Transaction trans = session.beginTransaction();
 		list  = session.createCriteria(Employee.class).list();
		trans.commit();
		return list;
	}

	public Employee deleteEmpData(int parseInt) {
		session = factory.getCurrentSession();
 		Transaction trans = session.beginTransaction();
 		Employee emp = new  Employee();
 		emp.setEmpId(parseInt);
 		session.delete(emp);
 		trans.commit();
 		return null;
	}

	public Employee updateEmpData(Employee empDetail) {
		session = factory.getCurrentSession();
 		Transaction trans = session.beginTransaction();
 		session.update(empDetail);
 		trans.commit();
 		return empDetail;
 		
	}

}
