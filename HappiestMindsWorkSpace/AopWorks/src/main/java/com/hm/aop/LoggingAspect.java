package com.hm.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	/*
	 @Before("execution(public double getBalance())")
	 public void logginBeforeAspect1() {
			System.out.println("Logging Aspect before Called get Balance >>>>>");
		}
	
	
	@Before(value="execution(public * get*())")
	public void logginBeforeAspect() {
		System.out.println("Logging Aspect before Called for get * >>>>>");
	}*/
	
	
	@Pointcut("within(com.hm.bl..*)")
	public void allSBAccount(){}
	
	
	@Pointcut(value="execution(public * get*())")
	public void allGetters(){}
	
	@Before("allGetters() || allSBAccount()")
	public void customGettersCall(){
		System.out.println("Security check for Custom Getters ");
	}
	
	
	
	
	
	
	
	
	
}