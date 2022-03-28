package com.training.rest.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.training.rest.model.User;

public interface UserRepository extends CrudRepository<User,Long> {

	List<User> findAll();
	
	@Transactional
	@Modifying
	@Query(nativeQuery = true, value="UPDATE `user_table` SET `user_fname` = ?,  `user_lname` = ?,`user_email` = ?, `user_contact` = ? WHERE `user_id` = ?;")
	void updatePerson(String fName, String lName, String email,String contact, Long id);
	
}
