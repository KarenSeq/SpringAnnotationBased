package com.learn.spring.annotation.log;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logging {

	@Pointcut("execution(public void com.learn.spring.annotation.log.model.Log.getMessage())")
	public void pointCutMethod() {

	}

	@Before("pointCutMethod()")
	public void beforePointCut() {
		System.out.println("In before point cut..");
	}

	@After("pointCutMethod()")
	public void afterPointCut() {
		System.out.println("In after point cut..");
	}
//
//	@AfterReturning(pointcut = "pointCutMethod()", returning = "message")
//	public void afterReturing(Object valueReturned) {
//		System.out.println("In after returning with value " + valueReturned.toString());
//	}

	@AfterThrowing(pointcut = "pointCutMethod()", throwing = "someException")
	public void afterException() {

	}

}
