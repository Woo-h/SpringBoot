package com.min.edu;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.min.edu.aop02.RightBrain;

//TODO 006 Spring Boot Test 클래스 @Around

@SpringBootTest
class AOP02_Test {

	public Logger logger = LoggerFactory.getLogger(AOP02_Test.class);
	
	@Autowired
	private RightBrain rightBrain;
	
	@Test
	void right() {
		rightBrain.thinking();
		rightBrain.use("right 반환 메소드");
	}

}
