package com.training.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.rest.model.User;
import com.training.rest.services.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/")
	public String init() {
		
		return "Welcome to User Service";
		
	}
	
	@PostMapping("/users")
	public List<User> addUser(@RequestBody User user){
		
		List<User> users = userService.addUser(user);
		return users;
		
	}
	
	@GetMapping("/users")
	public List<User> showAllUsers(){
		
	List<User> users = userService.findAll();
	return users;	
	}
	
	
	
	
	@GetMapping("/users/{id}")
	public Optional<User> getUserById(@PathVariable Long id) {
		
		Optional<User> user = userService.getUserById(id);
		
		return user;
		
	}

	@GetMapping("/user/{id}")
	public String checkUserById(@PathVariable Long id) {
		
		Optional<User> user = userService.getUserById(id);
		
		if(user != null) {
			return " User Found " + user;
		}else {
			
			return "User Not found with userid " + id; 
		}
		
		
		
	}
	
	@DeleteMapping("/users/{id}")
	public List<User> deleteById(@PathVariable Long id) {
		
		userService.deleteUserById(id);
		List<User> list = userService.findAll();
		
		return list;
		
		
	}
	
	@DeleteMapping("/users")
	public List<User> deleteAll(){
		
		userService.deleteAll();
		List<User> list = userService.findAll();
		
		return list;
	}
	
	
	@PutMapping("/users/{id}")
	public User updateUser(@RequestBody User user, @PathVariable Long id) {
		
		
		return userService.updateUser(user , id);
		
	}
	
	
}
