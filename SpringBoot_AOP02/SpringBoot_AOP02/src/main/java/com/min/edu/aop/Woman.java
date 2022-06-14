package com.min.edu.aop;

//TODO 003 CC 기능을 구현한 객체
import org.springframework.stereotype.Component;

@Component
public class Woman implements Human{

	@Override
	public void classWork() {
		System.out.println("Woman 클래스의 주 기능을 실행 합니다");
	}

}
