package com.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.dao.LoginRepository;
import com.training.model.User;

@Service
public class LoginService {

	@Autowired
	LoginRepository loginrepo;
	
	
		User user1 = new User(111l,"salambasha", "password1");

		User user2 = new User(222l,"kapilkumar", "password2");

		User user3 = new User(333l,"vasudha", "password3");

		User user4 = new User(444l,"jitendhar", "password4");

		User user5 = new User(555l,"sivakumar", "password5");
		
		
		

	public User loginCheck(String username,String password) {
		
//		loginrepo.save(user1);
//		loginrepo.save(user2);
//		loginrepo.save(user3);
//		loginrepo.save(user4);
//		loginrepo.save(user5);
//		
		User user = loginrepo.loginCheck(username, password);
		
		return user;
	}
		
		
		
	
	
}
