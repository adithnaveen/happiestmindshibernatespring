package com.naveen.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.naveen.model.Account;
import com.naveen.service.BankingService;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("aopconfiguration1.xml");

		BankingService banking = context.getBean("banking", BankingService.class);
		System.out.println("SB Account Balance is " + 
				banking.getSbAccount().showBalance());
	}
}
