package com.practice.springaop.SpringAOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

//Aspect oriented Programming
//Cross cutting concerns ->@Aspect


@Component
@Aspect
@EnableAspectJAutoProxy
public class Helper {

	// Before annotation is used to run a method before the mentioned method
	// name in the brackets)
	@Before("execution(public void show())")
	public void log() {
		System.out.println("maintaining log files...");
	}

	// Before annotation is used to run a method before the mentioned method
	// name in the brackets)
	@After("execution (public void show())")
	public void Closure() {
		System.out.println("Closing the resources successfully...");
	}

}


