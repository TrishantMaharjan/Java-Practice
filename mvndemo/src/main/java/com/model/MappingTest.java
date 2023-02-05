package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MappingTest {
	public static void main(String[] args) {
		oneToOne();
	}
	
	static void oneToOne() {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session sess = sf.openSession();
		sess.beginTransaction();
		
		Address adr = new Address();
		adr.setCountry("Nepal");
		adr.setState("Bagmati");
		adr.setCity("Kathmandu");
		sess.save(adr);
		
		Employee emp = new Employee();
		emp.setFname("DummyFname");
		emp.setLname("DummyLname");
		emp.setSalary(10000);
		emp.setAddress(adr);
		
		sess.save(emp);
		sess.getTransaction().commit();
		sess.close();
	}
}
