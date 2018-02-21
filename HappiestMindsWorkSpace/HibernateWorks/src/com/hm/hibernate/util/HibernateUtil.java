package com.hm.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.hm.beans.Employee;

public class HibernateUtil {

	static SessionFactory sessionFactory = null;

	// since we have not passed any param to configure method 
//	by default hibernate will look for hibernate.cfg.xml 
	public static SessionFactory getFactory() {
		Configuration config = new Configuration().configure();

		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(config.getProperties());

		sessionFactory = config.buildSessionFactory(builder.build());
		return sessionFactory; 
	}

	public static SessionFactory getFactory(String configFileName) {
		Configuration config = new Configuration().configure(configFileName);

		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(config.getProperties());

		sessionFactory = config.buildSessionFactory(builder.build());
		return sessionFactory; 
	}
	
	
	
	public static SessionFactory getFactoryAnnotation(Class ... classNames ) {
		Configuration config = new Configuration().configure();

		for(Class temp : classNames){
			config.addAnnotatedClass(temp);
		}
		
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(config.getProperties());
		sessionFactory = config.buildSessionFactory(builder.build());
		return sessionFactory; 
	}
	
	
	
	
	
	
	
	
	
	
	
	
}