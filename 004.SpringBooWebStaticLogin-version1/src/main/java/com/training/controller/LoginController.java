package com.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.training.model.LoginBean;

@Controller
public class LoginController {

	@RequestMapping(value="/login", method = RequestMethod.GET)
    public String init(Model model) {
		model.addAttribute("msg","Please Enter your login details..");
		return "login";
	}	

	
	@RequestMapping(value = "/validateUser", method=RequestMethod.POST)
	public String validateUser(Model model, @ModelAttribute("LoginBean") LoginBean loginBean) {
		if(loginBean.validateUser(loginBean).contains("welcome")) {
		
		model.addAttribute("msg", "Hi" + loginBean.getUserName() + "you are welcome..");
		return "success";
		}else if(loginBean.validateUser(loginBean).contains("enter")){
			model.addAttribute("error", "please enter username and password");
			return "login";
		}else {		
		
		model.addAttribute("error", "username or password or both are invalid");
		return "login";
		}
		
	}	
		
	
	
}
