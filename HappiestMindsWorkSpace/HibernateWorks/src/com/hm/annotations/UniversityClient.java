package com.hm.annotations;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hm.hibernate.util.HibernateUtil;

public class UniversityClient {
	static SessionFactory sessionFactory; 
	public static void main(String[] args) {
		UniversityClient otm = new UniversityClient(); 
		
		sessionFactory = HibernateUtil.getFactoryAnnotation( University.class, College.class );
		
		
		List<College> colleges = new ArrayList<College>();
		College college1 = new College("ABC", "Bengaluru"); 
		colleges.add(college1);
		College college2 = new College("IIMB", "Mysuru");
		colleges.add(college2);

		
		University university = new University("Delhi", "Delhi", colleges);
		
		college1.setUniversity(university);;
		college2.setUniversity(university);
		
		Integer universityId = otm.insert(university); 
		System.out.println("University Created is " + universityId);
		
	}
	
	
	public Integer insert(University university){
		Session session = sessionFactory.openSession(); 
		Integer universityId = null;
		
		session.beginTransaction(); 
		
		universityId = (Integer) session.save(university);
		session.getTransaction().commit(); 
		return universityId; 
	}
	
}
