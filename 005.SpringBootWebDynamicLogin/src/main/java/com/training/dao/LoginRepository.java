package com.training.dao;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.model.User;

@Repository
public interface LoginRepository extends CrudRepository<User, Long>{

	@Query(nativeQuery = true, value="SELECT * FROM user WHERE user_name=?1 and password=?2")
	User loginCheck(String username, String password);
	
	
}
