package com.stuff.mgmt.rest.config.aop;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.web.servlet.DispatcherServlet;

@Aspect
public class ControllerAOP {

	static final Logger log = LogManager.getLogger("controller");
	private long timeRecorded;

	@Before("execution(@org.springframework.web.bind.annotation.RequestMapping * com.stuff.mgmt.rest.controller.*.*(..))")
	public void logBeforeMethod(JoinPoint joinPoint) {
		timeRecorded = System.currentTimeMillis();

	}

	@After("execution(@org.springframework.web.bind.annotation.RequestMapping * com.stuff.mgmt.rest.controller.*.*(..))")
	public void logAfterMethod(JoinPoint joinPoint) {
		log.info("###AOP ### " + joinPoint.getTarget().getClass()
				+ " #called :" + joinPoint.getSignature().getName() + " took :"
				+ (System.currentTimeMillis() - timeRecorded) + " ms");
	}

	@AfterThrowing(pointcut= "execution(@org.springframework.web.bind.annotation.RequestMapping * com.stuff.mgmt.rest.controller.*.*(..))", throwing = "ex")
	public void logAfterExceptionIsThrown(JoinPoint joinPoint,
			IllegalAccessException ex) {
		log.info("##AOP## endpoint " + joinPoint.getSignature().getName()
				+ " failed.");
		log.error(ex.fillInStackTrace());
	}

}
