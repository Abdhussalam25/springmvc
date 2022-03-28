package com.training.provider.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.provider.model.Tutor;
import com.training.provider.service.TutorService;

@RestController
@RequestMapping("/tutor")
public class TutorRestController {

	@Autowired
	Environment environment;
	
	@Autowired
	TutorService tutorService;
	
	@GetMapping("/data")
    public String getBookData() {
       return "data of TUTOR-SERVICE, Running on port: "
         +environment.getProperty("local.server.port");
    }
	
	@GetMapping("/{id}")
	public Tutor getTutorById(@PathVariable Integer id) {
		
		return tutorService.getTutorById(id);
	}

	@GetMapping("/all")
	public List<Tutor> getAll(){
		
		return tutorService.getAllTutors();
	}
	
	@PostMapping("/add")
	public Tutor addTutor(@RequestBody Tutor tutor){		
		
		return tutorService.addNewTutor(tutor);
	}
	
	
	
	
}
