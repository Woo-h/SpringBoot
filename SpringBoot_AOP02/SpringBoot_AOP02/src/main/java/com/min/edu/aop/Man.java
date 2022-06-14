package com.min.edu.aop;

import org.springframework.stereotype.Component;

//TODO 003 CC 기능을 구현한 객체
@Component
public class Man implements Human{

	@Override
	public void classWork() {
		System.out.println("Man 클래스의 주 기능을 실행 합니다");
	}

}
