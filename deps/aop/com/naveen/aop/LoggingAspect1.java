package com.naveen.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

// this class is to show working of @After aspect 

//@Aspect
public class LoggingAspect1 {
	

	@Before("execution(* get*())")
	public void beforeGetter(){
		System.out.println("Before Getter Called... ");
	}
	
	@After("execution(* get*())")
	public void afterGetter(){
		System.out.println("After Getter Called... ");
	}
	
	/*@AfterReturning("execution(* get*())")
	public void afterSuccessfulGetter(){
		System.out.println("After successful getter... ");
	}
	*/
	@AfterReturning(pointcut="args(val)", returning="returnString")
	public void afterReturnStringSetters(String val, String returnString){
		System.out.println("Called with " + val +" & return " + returnString);
	}
	
	
	@AfterThrowing("execution(* get*())")
	public void afterExceptionThrown(){
		System.out.println("Called when exception is thrown... ");
	}
	
	
	
}
