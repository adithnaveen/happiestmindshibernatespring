package com.hm.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect3 {

	@Around(value = "execution(public * get*())")
	public Object sampleMyAroundAdvise(ProceedingJoinPoint proceedingJoinPoint){
		// this advise should have compulsory argument
		
		Object retVal = null;
		try {
			System.out.println("Before the method is called :::  ");
			retVal = proceedingJoinPoint.proceed();		
			System.out.println("After the method is called :::  ");

		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		System.out.println("After finally");
		return retVal;
	}
}
