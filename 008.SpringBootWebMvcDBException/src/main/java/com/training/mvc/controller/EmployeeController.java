package com.training.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.mvc.entity.Employee;
import com.training.mvc.exception.EmployeeException;

@Controller
public class EmployeeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String init() {
		return "index";
	}
	
	
	@RequestMapping(value="/employee", method = RequestMethod.GET)
	public ModelAndView employee() {
		ModelAndView mv = new ModelAndView("employeeForm","employee", new Employee());
		return mv;
	}

	@RequestMapping(value = "/addEmployee" , method = RequestMethod.POST)
	public String addEmployee( @ModelAttribute Employee employee , ModelMap model) {
		if(employee.getEmpFirstName().length()<3) {
			
			throw new EmployeeException("Employee first name should have atleast 3 charectors");
			
		}else {
			model.addAttribute("empFirstName", employee.getEmpFirstName());
		}
		
		if(employee.getEmpLastName().length()<5) {
					
					throw new EmployeeException("Employee last name should have atleast 3 charectors");
				}else {
					model.addAttribute("empLastName", employee.getEmpLastName());
				}
		
		if(employee.getEmpSalary()<1000) {
			
			throw new EmployeeException("Employee should be should be atleast 10000");
		}else {
			model.addAttribute("empSalary", employee.getEmpSalary());
		}

		model.addAttribute("empId",employee.getEmpId());
		
		return "employeeDetails";		
	}
	
	
	
}
