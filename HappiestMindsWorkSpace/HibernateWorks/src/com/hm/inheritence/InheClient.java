package com.hm.inheritence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hm.hibernate.util.HibernateUtil;

public class InheClient {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getFactory();

		Session session = sessionFactory.openSession();

		Mobile mobile = new Mobile(101, "Samsung Mobile", "S7 edge", 49999,
				"Smart", "Android", "GSM");

		Television tv = new Television(102, "sony", "Sony with round cornors", 
				34000, 36, "LED", "1024x846");
		
		session.beginTransaction(); 
		
		session.save(mobile); 
		session.save(tv); 
		
		session.getTransaction().commit();
		
		System.out.println("Saved... ");
		
		
	}
}