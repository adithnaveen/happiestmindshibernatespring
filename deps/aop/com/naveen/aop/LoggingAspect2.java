package com.naveen.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

// this class is for around such that it can be called before and 
// after, this will act like the intercept for both(before, after)

@Aspect
public class LoggingAspect2 {
	
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
