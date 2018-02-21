package com.hm.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppClient {
	public static void main(String[] args) {
		// this holds the reference to the spring container 
		ApplicationContext context = new 
			ClassPathXmlApplicationContext("ApplicationContext01.xml");
		
		/*IHelloService helloSerivice = (IHelloService) context.getBean("hello");

		String retVal = helloSerivice.sayHello();
		System.out.println(retVal);*/
		
		Employee emp = context.getBean("emp", Employee.class);
		
		System.out.println(emp.getEmpId() +", " + emp.getEmpName() +  ", " + emp.getEmpSal());
		
		
		
		((AbstractApplicationContext) context).registerShutdownHook();
	}
}