package com.training.Controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.training.model.Person;

@Controller
public class WebFormController implements WebMvcConfigurer {

	public void addViewControllers(ViewControllerRegistry registry) {
		
		registry.addViewController("/results")
		.setViewName("results");
		
	}
	
	@GetMapping("/")
	public String showForm() {
		
		return "home";
	}
	
	@RequestMapping(value="/",method=RequestMethod.POST)
	public String checkPersonInfo( @Valid Person person, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			return "personForm";
		}else 
			return "redirect:/results";
	  
	}
	
	
	
	
}
