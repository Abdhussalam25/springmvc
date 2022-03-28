package com.training.rest.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.training.rest.entities.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long>{
	
	@Override
	List<Person> findAll();

		

	@Transactional
	@Modifying
	@Query(nativeQuery = true, value="UPDATE `person` SET `person_first_name` = ?,  `person_last_name` = ?,`person_age` = ? WHERE `person_id` = ?;")
	void updatePerson(String fName, String lName, int age, Long id);
	
//	@Query(nativeQuery = true, value="SELECT * FROM person WHERE person_id=?1")
//	Person findById(long id);
	//Person getPersonById(int personId);
//	List<Person> addPerson(Person person); // it can be according to the need either single object or list has to be returned
//	 Person modPerson(Person person);
//	 Person delPersonById(int personId);
//	 void delPersons();
	
	
	
} 