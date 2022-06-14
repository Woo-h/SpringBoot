package com.min.edu.aop;


import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MapperAOP {

	private static final Logger log = LoggerFactory.getLogger(MapperAOP.class);
	
	@Pointcut("execution(public * com.min.edu.model.mapper.*Mapper.*(..))")
	public void point() {};
	
	@Before(value = "point()")
	public void before(JoinPoint j) {
		log.info("\n\n");
		log.info("AOP(⊙_⊙;) 메소드 시작 전");
		log.info("AOP(⊙_⊙;) 사용되는 메소드 : {}", j.getSignature().getName());
		Object[] obj = j.getArgs();
		if(obj != null) {
			log.info("아규먼츠 : {}", Arrays.toString(obj));
		}
		log.info("\n\n");
	}
	
	@AfterThrowing(value = "point()", throwing = "exception")
	public void afterThrowing(JoinPoint j , Exception exception) {
		log.info("\n\n");
		log.info("AOP(⊙_⊙;) 사용되는 메소드 : {}", j.getSignature().getName());
		log.info("AOP(⊙_⊙;) 오류 메시지 : {}", exception.getMessage());
		log.info("\n\n");
	}
}
