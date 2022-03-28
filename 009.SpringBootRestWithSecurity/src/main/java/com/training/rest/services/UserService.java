package com.training.rest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.rest.dao.UserRepository;
import com.training.rest.model.User;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;

	public List<User> addUser(User user) {
		
		
		
		userRepo.save(user);
		
		List<User> userlist = userRepo.findAll();
		
		return userlist;
		
	}

	public List<User> findAll() {
		
		return userRepo.findAll();
	}

	public Optional<User> getUserById(Long id) {
		// TODO Auto-generated method stub
		return userRepo.findById(id);
	}

	public void deleteUserById(Long id) {
	
		userRepo.deleteById(id);
		
	}

	public void deleteAll() {
		
		userRepo.deleteAll();
		
	}

	

	public User updateUser(User user, Long id) {
		
		String fname = user.getUserFName();
		String lname = user.getUserLName();
		String email = user.getUserEmail();
		String contact = user.getUserContact();
				
		userRepo.updatePerson(fname, lname, email, contact, id);
		
		Optional<User> user2 = userRepo.findById(id);
		
		return user2.get();
		
		
		
	}
	
	
}
