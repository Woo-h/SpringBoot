package com.min.edu.ctrl;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

@Controller
public class ErrorController implements org.springframework.boot.web.servlet.error.ErrorController {
	private static final String ERROR_PATH = "/error";
	@RequestMapping(value = "/error")
	public String handleError(HttpServletRequest request, Model model) {
		Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
		HttpStatus httpStatus = HttpStatus.valueOf(Integer.valueOf(status.toString()));
		System.out.println("statusCode -----------------" +status);

		//		if (status != null) {
//			int statusCode = Integer.valueOf(status.toString());
//			System.out.println("statusCode -----------------" +Integer.valueOf(status.toString()));
//			if (statusCode == HttpStatus.NOT_FOUND.value()) {
//				return "Error";
//			}
//			if (statusCode == HttpStatus.FORBIDDEN.value()) {
//				return "Error";
//			}
//		}
		
		return "Error";
	}
	
	public String getErrorPath() {
        return ERROR_PATH;
    }
}
