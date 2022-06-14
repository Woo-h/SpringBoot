package com.min.edu.aop02;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
public class RightBrain implements Person/* , ETC */ {  // ETC는  Spring AOP의 작동원리 인 Runtime Proxy 때문에 작성해 줌

	@Override
	public void thinking() {
		System.out.println("오른쪽 뇌 생각하고 있는 중 입니다");
	}
	
	/*
	 * aop는 상위 부모에서 가지고 있는 메소드만를 VMI 실행시킨다
	 * 따라서 inserface에 구성이 되어 있지 않다면 작동의 대상이 되지 않음 
	 */
	public String use(String action) {
		return action+"한다";
	}

}
