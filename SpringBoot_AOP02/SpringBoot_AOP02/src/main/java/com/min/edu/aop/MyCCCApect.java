package com.min.edu.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//TODO 004 Spring Aspect 객체 생성
@SpringBootApplication
@Aspect
public class MyCCCApect {
	
	//인터페이스 방법 pointcut을 선언 하는 방법
	//같은 joinpoint 가 아닌 여러개의 joinpoint를 선언하여 변수와 같은 방법을 사용 할 수 있음
	
	// *의 문법은 사용하기 어렵고 위치를 찾기가 불가능함 따라서 구체적은 위치를 찾고 ..을 사용하여 Class의 위치와 Method의 위치를 정의해 줘야 한다
//	@Pointcut("execution(public * *(..))")
	@Pointcut("execution(public * com.min.edu.aop..*(..))")
	public void myClass() {}
	
	@Before("myClass()")
	public void befereMethod() {
		System.out.println("메소드가 실행될 겁니다");
	}
	@After("myClass()")
	public void afterMethod() {
		System.out.println("메소드가 종료 되었습니다");
	}
	
	
	
	

	
	
}






