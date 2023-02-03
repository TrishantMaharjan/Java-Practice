package com.model;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class Test {
	public static void main(String[] args) {
		// add();
		// getAll();
		// update();
		delete();
	}
	
	// Add Student
	static void add() {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session sess = sf.openSession();
		sess.beginTransaction();
		
		Student st = new Student();
		st.setFname("DummyFname2");
		st.setLname("DummyLname2");
		st.setAge(23);
		st.setCity("DummyCity2");
		st.setCollege("DummyCollege2");
		
		sess.save(st); // Insert SQL write
		sess.getTransaction().commit(); // Execute SQL
		sess.close(); // DB close
	}
	
	// Select data from table Student
	static void getAll() {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session sess = sf.openSession();
		
		Criteria crt = sess.createCriteria(Student.class);
		// crt.add(Restrictions.eq("college", "DummyCollege"));
		// crt.add(Restrictions.le("age", 40)); // ge = greater than equal to, le = lessthan equal to, eq = equal, gt = greater than, lt = less than
		crt.setProjection(Projections.property("fname")); //Displays fname column only
		List<Student> slist = crt.list(); // Select SQL
		System.out.println(slist);
	}
	
	// Update Student
	static void update() {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session sess = sf.openSession();
		sess.beginTransaction();
		
		Student s = (Student) sess.get(Student.class, 2); // id = 2
		s.setAge(34);
		s.setCollege("TestCollege");
		sess.update(s); // Update SQL
		sess.getTransaction().commit();
		sess.close();
	}
	
	// Delete data
	static void delete() {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session sess = sf.openSession();
		sess.beginTransaction();
		
		Student s = (Student) sess.get(Student.class, 2); // id = 2
		sess.delete(s);
		sess.getTransaction().commit();
		sess.close();
	}
	
	// Delete data using SQL Native
	static void delSql() {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session sess = sf.openSession();
		sess.beginTransaction();
		
		/*
		// SQL code
		SQLQuery sql = sess.createSQLQuery("delete from Student where id = 3");
		sql.executeUpdate();
		*/
		
		// Hibernate Query language (HQL) code
		// Query hql = sess.createQuery("DELETE FROM Student where id = 4");
		Query hql = sess.createQuery("DELETE FROM Student where id = :id");
		hql.setParameter("id", 5);
		hql.executeUpdate();
		sess.getTransaction().commit();
		sess.close();
	}
}
