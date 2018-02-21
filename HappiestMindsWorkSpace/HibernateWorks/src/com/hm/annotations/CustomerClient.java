package com.hm.annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hm.hibernate.util.HibernateUtil;

public class CustomerClient {
	static SessionFactory sessionFactory; 
	public static void main(String[] args) {
		sessionFactory = HibernateUtil.getFactoryAnnotation(Customer.class); 
		
		Session session = sessionFactory.openSession(); 
		session.beginTransaction(); 
		
		{
			Customer customer = new Customer("Kushalee", 121212, "kushalee@gmail.com", "Yes", true);
			session.save(customer);
		}
		{
			Customer customer = new Customer("Jemima", 223322, "jamima@gmail.com", "No", true);
			session.save(customer);
		}
		{
			Customer customer = new Customer("Harry", 332211, "harry@gmail.com", "Yes", false);
			session.save(customer);
		}

		session.getTransaction().commit(); 
		
		System.out.println("Data Saved... ");
		
	}
}