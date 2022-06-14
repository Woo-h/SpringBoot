package com.min.edu;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.min.edu.aop.Man;
import com.min.edu.aop.Woman;

//TODO 001 Spring Boot Test 클래스
@SpringBootTest
class SpringBootAop02ApplicationTests{

	public Logger logger = LoggerFactory.getLogger(SpringBootAop02ApplicationTests.class);
	
	@Autowired
	private Man man;
	
	@Autowired
	private Woman woman;
	
//	@Test
//	@DisplayName("AOP 테스트")
//	void contextLoads() {
//		man.classWork();
//		woman.classWork();
//	}

}
