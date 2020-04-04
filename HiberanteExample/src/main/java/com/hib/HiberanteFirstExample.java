package com.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.entity.Employee;

public class HiberanteFirstExample {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().addPackage("com.entity")
				.addAnnotatedClass(Employee.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		Transaction trans = session.beginTransaction();
		Employee emp = new Employee();
		emp.setEmpId(103);
		emp.setEmpName("RAVIuuu");
		session.save(emp);
		trans.commit();
	}

}
