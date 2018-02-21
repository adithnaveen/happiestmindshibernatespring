package com.hm.annotations.inheritence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hm.hibernate.util.HibernateUtil;

public class InheClient {
	static SessionFactory sessionFactory; 
	public static void main(String[] args) {
		sessionFactory  = HibernateUtil.getFactoryAnnotation
			(Project.class, Task.class, Module.class);
		
		Project p = new Project(); 
		p.setProId(101);
		p.setProName("Java");
		
		Task t = new Task();
		t.setProId(103);
		t.setProName("Finance");
		t.setTaskName("Income Tax");
		
		Module m = new Module(); 
		m.setProId(102);
		m.setProName("Oracle");
		m.setTaskName("SQL");
		m.setModName("Analytics");
		
		Session session = sessionFactory.openSession(); 
		session.beginTransaction(); 
		
		
		session.save(p);
		session.save(t);
		session.save(m);
		
		session.getTransaction().commit(); 
		
		System.out.println("Saved... ");
		
		
		
		
		
		
		
		
		
	}
}
