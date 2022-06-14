package com.min.edu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SpringBootJsp03Application {

	private static final Logger logger = LoggerFactory.getLogger(SpringBootJsp03Application.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJsp03Application.class, args);
	}

}
