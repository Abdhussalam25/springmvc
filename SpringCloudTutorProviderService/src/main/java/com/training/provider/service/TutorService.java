package com.training.provider.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.training.provider.model.Tutor;


public interface TutorService {

	//1.Get Tutor details by id
	
	Tutor getTutorById(Integer id);
	
	
	//2.Get All tutor details
	List<Tutor> getAllTutors();
	
	//3.Create New Tutor Details
	Tutor addNewTutor(Tutor tutor);
	
	//4.Update existing tutor experience by id
	Tutor updateTutor(Integer id,Tutor tutor);
	
	//5.Delete tutor's details by id
    List<Tutor> deleteTutorById(Integer id);
    
    //6.Delete all tutors infor
    List<Tutor> deleteAllTutors();
    
	
	
}
