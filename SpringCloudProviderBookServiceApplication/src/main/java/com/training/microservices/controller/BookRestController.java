package com.training.microservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.microservices.model.Book;

@RestController
@RequestMapping("/book")
public class BookRestController {
	
	@Autowired
	Environment environment;
	
	@GetMapping("/data")
    public String getBookData() {
       return "data of BOOK-SERVICE, Running on port: "
         +environment.getProperty("local.server.port");
    }
	
	@GetMapping("/{id}")
	public Book getBookById(@PathVariable Integer id) {
		
		return new Book(501,"Head First Java" , "Programming", 500.75);
	}
	
	@GetMapping("/all")
	public List<Book> getAll(){
		
		return List.of(new Book(501,"Head First Java" , "Programming", 500.75),
				new Book(501,"Spring in Action" , "Framework", 340.75),
				new Book(501,"Hibernate in Action" , "Framework", 355.75),
				new Book(501,"Microcontroller in Action" , "microservices", 500.75),
				new Book(501,"Spring in Action" , "Programming", 490.75));
	}
	
	@GetMapping("/entity")
    public ResponseEntity<String> getEntityData() {
       return new ResponseEntity<String>(
         "Hello from BookRestController", 
          HttpStatus.OK);
    }

}
