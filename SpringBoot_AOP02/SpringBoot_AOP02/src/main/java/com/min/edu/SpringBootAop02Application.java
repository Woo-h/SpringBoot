package com.min.edu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.min.edu.aop.Man;
import com.min.edu.aop.Woman;

@SpringBootApplication
public class SpringBootAop02Application implements CommandLineRunner {
	
	@Autowired
	private Man man;
	
	@Autowired
	private Woman woman;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootAop02Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		man.classWork();
//		woman.classWork();
	}

}
