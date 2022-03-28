package com.training.rest.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.rest.dao.PersonRepository;
import com.training.rest.entities.Person;

@Service
public class PersonService {

	@Autowired
	PersonRepository personRepo;
	

	Person person1 = new Person(111l,"salambasha", "Allabahas",28 );

	Person person2 = new Person(222l,"sanjay", "kumar", 60);

	Person person3 = new Person(333l,"jitendahr", "pandey", 55);

	Person person4 = new Person(444l,"kapil", "kumar", 28);

	
	public List<Person> findAll(){
//		personRepo.save(person1);
//		personRepo.save(person2);
//		personRepo.save(person3);
//		personRepo.save(person4);
//		
		List<Person> list = personRepo.findAll();
		return list;
		
		
	}


	public Optional<Person> getPersonById(Long id) {
		
		Optional<Person> person = personRepo.findById(id);
		
		return person;
	}


	public void addPerson(Person person) {
		
		personRepo.save(person);
		
		
	}


	public Person updatePerson(Person person, Long id) {
		
		String fName = person.getPersonFirstName();
		String lName = person.getPersonLastName();
		int age = person.getPersonAge();
		personRepo.updatePerson(fName,lName,age, id);
		
		Optional<Person> person2 = personRepo.findById(id);
		
		Person person3 = person2.get();
		
		return person3;
		
		
	}


	public void deletePersonById(Long id) {
		
		personRepo.deleteById(id);
	}


	public void deleteAll() {
		
		personRepo.deleteAll();
		
	}
	
	
	
	
	
}
