package com.hm.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect2 {
	
	@After("execution(* get*())")
	public void log(){
		System.out.println("After aspect called... ");
	}
	
	@AfterReturning("execution(* get*())")
	public void log1(){
		System.out.println("Successfully executed...");
	}
	
	@AfterThrowing("execution(* get*())")
	public void log2(){
		System.out.println("after exception is thrown... ");
	}
	
}
