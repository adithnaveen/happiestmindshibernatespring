package com.naveen.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.naveen.model.Account;

public class ClientAround {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext
			("aopconfiguration1.xml");
		
		Account account1 = context.getBean("account1", Account.class);
		
		System.out.println("Account Holder Name " + account1.getAccName());
	}
}
