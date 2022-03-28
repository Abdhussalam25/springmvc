package com.training.restapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.training.restapi.dao.UserRepository;
import com.training.restapi.model.User;
@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	private UserRepository userRepo;
	
		//adding new user
	@RequestMapping(value="/users", method=RequestMethod.POST)
	public User addUser(@RequestBody User user){
		return userRepo.save(user);
	}
	
	//to remove user
	@RequestMapping(value="/user/{userId}", method=RequestMethod.DELETE)
	public String delUser(@PathVariable Integer userId){
		userRepo.deleteById(userId);
		return "Record with user id:"+userId+" has been deleted.."; 
	}
		
	//to check user by userId
	@RequestMapping(value="/users/{userId}", method=RequestMethod.GET)
	public String checkUser(@PathVariable Integer userId){
		if(userRepo.existsById(userId)) {
			return "Record with user id:"+userId+" is existing.."; 
		}else {
		return "Record with user id:"+userId+" is not existing.."; 
		}
	}

	@RequestMapping(value="/users/count", method=RequestMethod.GET)
	public String countUser(){
		long count=userRepo.count();
		if(count>0) {
			return "Number of Records found:"+count; 
		}else {
		return "No record found.."; 
		}
	}
		
		//to get user details by user id
	@RequestMapping(value="/user/{userId}", method=RequestMethod.GET)
	public Optional <User> getUser(@PathVariable Integer userId){
		Optional<User> user=userRepo.findById(userId);
		return user;
	}
	
		//get all user details
	@RequestMapping(value="/users",method=RequestMethod.GET)
	public List<User> getAllUsers(){
		List<User> list=(List<User>) userRepo.findAll();
		return list;
	}
}
