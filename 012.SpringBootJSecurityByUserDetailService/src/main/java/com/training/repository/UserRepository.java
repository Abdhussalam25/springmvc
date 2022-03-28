package com.training.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.training.model.User;

public interface UserRepository extends JpaRepository<User,Integer> {

	Optional<User> findUserByEmail(String email);
	

	
}
