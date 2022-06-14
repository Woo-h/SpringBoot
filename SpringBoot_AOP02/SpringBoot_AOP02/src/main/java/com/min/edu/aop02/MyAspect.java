package com.min.edu.aop02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

	// PointCut 설정
	@Pointcut("execution(public * com.min.edu.aop02..*(..))")
	public void userPointCutBrain() {}


	@Before("userPointCutBrain()")
	public void before() {
		System.out.println("우뇌가 생각을 시작 합니다 (before)");
	}
	@After("userPointCutBrain()")
	public void afterRight() {
		System.out.println("우뇌사 생각을 종료 합니다 (after)");

	}
	@AfterReturning("execution(public * com.min.edu.aop02..*(..))") // Advice에 직업 작성하는 execution
	public void afterReturing(JoinPoint join) {
		System.out.println("$$$$"+join.getSignature().getName()+"$$$$\"");
		
		// AfterReturung Advice에서 처리되는 CC를 받아서 출력 해줌
//		System.out.println("리턴되는 값의 AOP AfterReturning : " + returnVal);
		
		Object[] args = join.getArgs();
		for (Object o : args) {
			System.out.println("반환이 있는 경우에 실행되는 메소드 : "+ (String)o);
		}
	}

// TODO 005 @Around 적용 : 실패와 상관 없이 CC의 전후에 실행되는 도록 하는 Advice
// @Around 설정
	@Around("userPointCutBrain()")
	public Object before(ProceedingJoinPoint joinpoint) {
		System.out.println("메소드 시작전 공통으로 시작됨");
		String methodName =   joinpoint.getSignature().toShortString();
		try {
			System.out.println(methodName + " 실행");
			Object result = joinpoint.proceed();
			return result;
		} catch (Throwable e) {
			System.out.println("익셉션 입니다.");
			e.printStackTrace();
			return null;
		}
	}


}
