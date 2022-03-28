package com.training.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	@RequestMapping("/greetings")
	public String greetings(HttpServletRequest request) {
		
		System.out.println("welcome");
		String str = request.getParameter("name");
		if(str==null)
			str = "Guest User";
		
		HttpSession session = request.getSession();
		session.setAttribute("name", str);
		System.out.println("welcome again");
		
		return "welcome";
	}

}
