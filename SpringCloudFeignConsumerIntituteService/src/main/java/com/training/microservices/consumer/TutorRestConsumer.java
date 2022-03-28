package com.training.microservices.consumer;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.training.microservices.model.Tutor;


@FeignClient(name="TUTOR-SERVICE")
public interface TutorRestConsumer {

	@GetMapping("/tutors/data")
	public String getTutorData();
	
	//1.Get Tutor details by id
	@GetMapping("/tutors/{id}")
		Tutor getTutorById(Integer id);
		
		
		//2.Get All tutor details
	    @GetMapping("/tutors")
		List<Tutor> getAllTutors();
		
		//3.Create New Tutor Details
	    @PostMapping("/tutors")
		Tutor addNewTutor(Tutor tutor);
		
		//4.Update existing tutor experience by id
	    @PutMapping("/tutors/{id}")
		Tutor updateTutor(@PathVariable Integer id, @RequestBody Tutor tutor);
		
		//5.Delete tutor's details by id
	    @DeleteMapping("/tutors/{id}")
	    List<Tutor> deleteTutorById(@PathVariable Integer id);
	    
	    //6.Delete all tutors infor
	    @DeleteMapping("/tutors")
	    List<Tutor> deleteAllTutors();
	
}
