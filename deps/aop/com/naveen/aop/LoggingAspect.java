package com.naveen.aop;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

// @Aspect
public class LoggingAspect {
	// this before will call all the methods either from SB Account or CA Account
//	@Before("execution(public double getBalance())")
	
	// if you want specific, specifying the package information, in this case When user calls showBalance on CA Account 
	// only then the aspect is called. 
//	@Before("execution(public double com.naveen.bl.CAAccount.showBalance())")
	
	// we can go with wild card charecters 
	// for example we want an advice to all getters of any method
	// no matter what that method returns 
//	@Before(value="execution(public * get*())")
	
	// the below will return with any access specifier either public or default or protected or private 
//	@Before(value="execution(* get*())")
	
	// for example if you have a getter which takes an argument ,minimum 1 arg 
//	@Before(value="execution(* get*(*))")
	
	// if you want to apply for the aspect either may take an argument or not use .. 
	// 0 or more 
//	@Before(value="execution(* get*(..))")	
	
	// you can be more specific for a package or class then specify the wild card char 
//	@Before("execution(* com.naveen.model.Account.getBalance())")
	
	// or you can specify partial match
//	@Before("execution(* com.naveen.model.*.getBalance())")

	/*@Before("allGetter()")
	public void loggingAdviceBefore(){
		System.out.println("Advise before run. The get Method is called... ");
	}
	
	// may be if we want more advise to have
	@Before("allGetter()")
	public void secondAdvise(){
		System.out.println("Second Advise called... ");
	}
	*/
	
	// if you have too many advises then this will be really difficult 
	// for this we can have the point cut defined separately 
	
	// All getters is a dummy method or its called as place holder 
	// you can give any name 
	@Pointcut("execution(* get*())")
	public void allGetter(){
		// even if you try writing any thing in the method the call is not made 
//		System.out.println("----------- in point cut-----------");
		
	}
	
	/*
	///////////////////////////////////////////////////////////////////////////////////
	
	/**
	 * if you want to write the aspet @class level then we can use pointcut call with within 
	 * the advantage is more readable, and you can have the pointcut at class level
	 * and all the wild card chars which we used remains same 
	 */

	@Before("allSBAccount()")
	public void sbAccountAdvise(){
		System.out.println("Aspect applied for all SB Account Class>>>>>>>> ");
	}

	
	
//	@Pointcut("within(com.naveen.bl.SBAccount)")
	// if you want for any class in the package
//	@Pointcut("within(com.naveen.bl.*)")
	
	// if you have sub packages and if you want to apply for all the classes and classes in the sub packages then 
	@Pointcut("within(com.naveen.bl..*)")
	public void allSBAccount(){}
	
	// you can also combine pointcuts with logical operations 
	// for example
	@Before("allSBAccount() || allGetter()")
	public void beforeCompound(){
		System.out.println("Before Compound ::::::::::");
	}
}


