package com.training.provider.service;

import java.util.HashMap;
import java.util.List;


import com.training.provider.model.Tutor;

public class TutorServiceImplement implements TutorService {

	private HashMap<Integer, Tutor> tutorMap;
	
	public TutorServiceImplement() {
		Tutor tutor = new Tutor(501,"Sanjay Kumar","Advanced JAVA","Microservices","15" , 555.00, "Online");
		tutorMap.put(1, tutor);
		 tutor =  new Tutor(502,"Salam Basha","Spring Framework","SpringMVC","3" , 200.00, "Online");
		tutorMap.put(2, tutor);
		 tutor = new Tutor(503,"RangaRajan","Advanced JAVA","microservices with spring cloud","8" , 400.00, "Online");
		tutorMap.put(3, tutor);
		 tutor = new Tutor(504,"RangaRajan","Advanced JAVA","microservices with spring cloud","8" , 400.00, "Online");
		tutorMap.put(4, tutor);
		 tutor = new Tutor(501,"Ranjan Pandey","JAVA-8","InterfaceEnhancement","5" , 333.00, "Online");
		tutorMap.put(5, tutor);
		
	}
	
	@Override
	public Tutor getTutorById(Integer id) {
		
		return null;
	}

	@Override
	public List<Tutor> getAllTutors() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tutor addNewTutor(Tutor tutor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tutor updateTutor(Integer id, Tutor tutor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Tutor> deleteTutorById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Tutor> deleteAllTutors() {
		// TODO Auto-generated method stub
		return null;
	}

}
