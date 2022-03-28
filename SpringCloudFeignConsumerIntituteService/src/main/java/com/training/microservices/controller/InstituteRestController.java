package com.training.microservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.microservices.consumer.TutorRestConsumer;
import com.training.microservices.model.Tutor;

@RestController
@RequestMapping("/institute")
public class InstituteRestController {

	@Autowired
	private TutorRestConsumer consumer;
	
	@GetMapping("/data")
    public String getTutorInfo() {
       System.out.println(consumer.getClass().getName());  //prints as a proxy class
       return "Accessing from TUTOR-SERVICE ==> " +consumer.getTutorData();
    }
	
	@GetMapping("/tutors")
    public String getTutorssInfo() {
       return "Accessing from TUTOR-SERVICE ==> " + consumer.getAllTutors();
    }
	
	@GetMapping("/tutors/{id}")
	public Tutor getTutorById(Integer id) {
		
		return consumer.getTutorById(id);
	}
	
	 @PostMapping("/tutors")
		public Tutor addNewTutor(Tutor tutor) {
		 
		 return consumer.addNewTutor(tutor);
	 }
	 
	//4.Update existing tutor experience by id
	    @PutMapping("/tutors/{id}")
		public Tutor updateTutor(@PathVariable Integer id, @RequestBody Tutor tutor) {
	    	
	    	return consumer.getTutorById(id);
	    }
	
	    @DeleteMapping("/tutors/{id}")
	   public List<Tutor> deleteTutorById(@PathVariable Integer id){
	    	
	    	return consumer.deleteTutorById(id);
	    }
	    
	    //6.Delete all tutors infor
	    @DeleteMapping("/tutors")
	    List<Tutor> deleteAllTutors(){
	    	
	    	return consumer.deleteAllTutors();
	    }
}
