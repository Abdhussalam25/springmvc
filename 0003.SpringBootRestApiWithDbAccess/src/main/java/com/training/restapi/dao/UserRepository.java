package com.training.restapi.dao;

import org.springframework.data.repository.CrudRepository;

import com.training.restapi.model.User;

public interface UserRepository extends CrudRepository<User,Integer>{

}
