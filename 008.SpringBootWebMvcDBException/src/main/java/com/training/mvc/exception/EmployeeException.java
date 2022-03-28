package com.training.mvc.exception;

public class EmployeeException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	private String message;
	
	public EmployeeException() {
		super();
	}
	
	public EmployeeException(String message) {
		super();
		this.message = message;
		
	}

	
	
	

}
