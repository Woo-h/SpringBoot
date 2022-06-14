package com.min.edu.ctrl;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.min.edu.dto.UserDto;



@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping("/")
	public String index() throws UnsupportedEncodingException {
		String encodedParam = URLEncoder.encode("이름", "UTF-8");
		return "redirect:/home.do?name="+encodedParam;
	}
	
	@RequestMapping(value = "/home.do" , method = RequestMethod.GET)
	public String home(UserDto uDto , Model model) {
		
		logger.info("Spring Boot JSP 연동 하기");
		logger.info("home 전달 값 : " + uDto.getName());
		logger.info("home 전달 값 : " + uDto.getAge());
		
		model.addAttribute("val", "HomeController>home 전달 값");
		
		return "home";
	}
	
}



