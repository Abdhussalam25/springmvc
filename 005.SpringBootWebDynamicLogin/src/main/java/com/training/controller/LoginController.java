package com.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.training.model.LoginBean;
import com.training.model.User;
import com.training.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	LoginService loginservice;

	@RequestMapping(value="/login", method = RequestMethod.GET)
    public String init(Model model) {
		model.addAttribute("msg","Please Enter your login details..");
		return "login";
	}	

	
	@RequestMapping(value = "/validateUser", method=RequestMethod.POST)
	public String validateUser(Model model, @ModelAttribute("LoginBean") LoginBean loginBean) {
	String result = "";
	String username = loginBean.getUserName();
	String password = loginBean.getPassword();
	
	if(username != null && password != null) {
		
		User user = loginservice.loginCheck(username, password);
		if (user!=null) {
			model.addAttribute("msg", "Hi " + user.getUserName()+ " you are welcome..");
			return "success";
			
		}else {
			
			model.addAttribute("error", "username or password or both are invalid");
			return "login";
		}
		
		
	}else {
		
		model.addAttribute("error", "please enter username and password");
		return "login";
	}
	
	
	}	
		
	
	
}
