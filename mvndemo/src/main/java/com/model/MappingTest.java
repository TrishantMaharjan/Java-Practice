package com.model;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MappingTest {
	public static void main(String[] args) {
		//oneToOne();
		//manyToOne();
		manyToMany();
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
	
	static void manyToOne() {
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
		
		Phone p1 = new Phone();
		p1.setNumber("123456789");
		p1.setType("Ncell");
		p1.setEmployee(emp);
		
		sess.save(p1);
		
		Phone p2 = new Phone();
		p2.setNumber("987654321");
		p2.setType("NTC");
		p2.setEmployee(emp);
		
		sess.save(p2);
		
		emp.setPhones(Arrays.asList(p1,p2));
		
		sess.save(emp);
		sess.getTransaction().commit();
		sess.close();
	}
	
	static void manyToMany() {
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
		
		Phone p1 = new Phone();
		p1.setNumber("123456789");
		p1.setType("Ncell");
		p1.setEmployee(emp);
		
		sess.save(p1);
		
		Phone p2 = new Phone();
		p2.setNumber("987654321");
		p2.setType("NTC");
		p2.setEmployee(emp);
		
		sess.save(p2);
		
		Department d1 = new Department();
		d1.setName("IT");
		sess.save(d1);
		
		Department d2 = new Department();
		d2.setName("Finance");
		sess.save(d2);
		
		emp.setPhones(Arrays.asList(p1,p2));
		emp.setDeptList(Arrays.asList(d1,d2));
		
		sess.save(emp);
		sess.getTransaction().commit();
		sess.close();
	}
}
