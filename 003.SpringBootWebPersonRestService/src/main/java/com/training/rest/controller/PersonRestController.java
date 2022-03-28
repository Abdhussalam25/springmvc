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
import org.springframework.web.bind.annotation.RestController;

import com.training.rest.entities.Person;
import com.training.rest.services.PersonService;

@RestController
public class PersonRestController {
	
	@Autowired
	PersonService personService;
	
	@GetMapping("/person")
	public String init() {
		
		return "Wecome to person rest api services";
	}
	
	@GetMapping("/persons")
	public List<Person> getPersons(){
		
		List<Person> list = personService.findAll();
		return list;
		
	}
	
	@GetMapping("/persons/{id}")
	public Optional<Person> getPersonById(@PathVariable Long id) {
		
		Optional<Person> person = personService.getPersonById(id);
		return person;
	}
	
	
	@PostMapping("/persons")
	public List<Person> addPerson(@RequestBody Person person){
		
		personService.addPerson(person);
		
		List<Person> list = personService.findAll();
		
		return list;
		
	}
	
	
	@PutMapping("/persons/{id}")
	public Person updatePerson(@RequestBody Person person, @PathVariable Long id) {
		
		Person person2 = personService.updatePerson(person , id);
		return person2;
	}
	
	@DeleteMapping("/person/{id}")
	public List<Person> deletePerson(@PathVariable Long id){
		
		personService.deletePersonById(id);
		
		List<Person> personList = personService.findAll();
		
		return personList;
		
	}
	
	@DeleteMapping("/persons")
	public List<Person> deleteAll(){
		
		personService.deleteAll();
		
		List<Person> personList = personService.findAll();
		
		return personList;
		
	}
	

}
