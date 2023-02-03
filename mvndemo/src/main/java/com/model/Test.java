package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		add();
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
		sess.getTransaction().commit();
		sess.close();
	}
}
