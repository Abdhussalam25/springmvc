package com.training.mvc.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.training.mvc.exception.EmployeeException;

@ControllerAdvice
public class EmployeeExceptionAdvice {

	@ResponseBody
	@ExceptionHandler(EmployeeException.class)
	public String employeeHandler(EmployeeException e) {
		return e.getMessage();
		
	}
}
