package com.hm.association;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hm.hibernate.util.HibernateUtil;

public class OneToManyImpl {
	static SessionFactory sessionFactory; 
	public static void main(String[] args) {
		OneToManyImpl otm = new OneToManyImpl(); 
		
		sessionFactory = HibernateUtil.getFactory();
		List<College> colleges = new ArrayList<College>();
		colleges.add(new College("ABC", "Bengaluru"));
		colleges.add(new College("IIMB", "Mysuru"));
		colleges.add(new College("XYZ", "Mangaluru"));
		
		University university = new University("Delhi", "Delhi", colleges);
		
//		Integer universityId = otm.insert(university); 
//		System.out.println("University Created is " + universityId);
		
		
		otm.listAllCr();
		
	}
	
	
	public Integer insert(University university){
		Session session = sessionFactory.openSession(); 
		Integer universityId = null;
		
		session.beginTransaction(); 
		
		universityId = (Integer) session.save(university);
		session.getTransaction().commit(); 
		return universityId; 
	}
	
	public void listAll(){
		Session session = sessionFactory.openSession(); 
		session.beginTransaction(); 
		
		List<University> universityList = session.createQuery("from University").list(); 
		
		for(University univ : universityList){
			System.out.println("University Name " + univ.getName()+", State " + univ.getState());;
			
//			for(College col : univ.getColleges()){
//				System.out.println("\tCollege Name " + col.getCollegeName() +", City " + col.getCollegeCity());
//			}
			univ.getColleges().forEach(System.out:: println);
		}
	}
	
	public void listAllCr(){
		Session session = sessionFactory.openSession(); 
		session.beginTransaction(); 
		
		Criteria cr = session.createCriteria(University.class);
		List<University> universityList = cr.list(); 
		
		for(University univ : universityList){
			System.out.println("University Name " + univ.getName()+", State " + univ.getState());;
			
			for(College col : univ.getColleges()){
				System.out.println("\tCollege Name " + col.getCollegeName() +", City " + col.getCollegeCity());
			}
		}
	}
	
	
	
}