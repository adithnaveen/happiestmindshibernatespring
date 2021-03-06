package com.hm.annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hm.hibernate.util.HibernateUtil;

public class EmployeeImpl {
	static SessionFactory sessionFactory; 
	public static void main(String[] args) {
		sessionFactory = HibernateUtil.getFactoryAnnotation(Employee.class);
		
		Employee emp = new Employee(); 
		emp.setEmpName("Saawan");
		emp.setEmpSal(40000);
		
		Session session = sessionFactory.openSession(); 
		
		session.beginTransaction(); 
		
		session.save(emp);
		session.getTransaction().commit(); 
		System.out.println("Employee Saved... ");
		
	}
}
