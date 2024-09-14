package com.its.ecommerceApp.AOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	public static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

	@Before("execution (* com.its.ecommerceApp.resource.ProductResource.getProductById(..))")
	public void logMethodCall() {
		LOGGER.info("Method Called ==============================================");
		System.out.println("Before performing task..-------------------------------.");
	}
}
