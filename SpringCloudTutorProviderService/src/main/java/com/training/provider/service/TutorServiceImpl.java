package com.training.provider.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.training.provider.model.Tutor;

@Service
public class TutorServiceImpl implements TutorService {
	 List<Tutor> tutors;
	public TutorServiceImpl() {
 tutors = List.of(new Tutor(501,"Sanjay Kumar","Advanced JAVA","Microservices","15" , 555.00, "Online"),
			new Tutor(502,"Salam Basha","Spring Framework","SpringMVC","3" , 200.00, "Online"),
			new Tutor(501,"Imtiyaz Ahmed","Full Stack Java","MYSQL","10" , 444.00, "Online"),
			new Tutor(501,"RangaRajan","Advanced JAVA","microservices with spring cloud","8" , 400.00, "Online"),
			new Tutor(501,"Ranjan Pandey","JAVA-8","InterfaceEnhancement","5" , 333.00, "Online"));
	}
	@Override
	public Tutor getTutorById(Integer id) {
		Tutor tutor = null;
		for(Tutor tutor2: tutors) {
			if(tutor.getTutorId() == id)
			{
				tutor = tutor2;
				break;
			}
			
		}
		
		return tutor;
		
	}

	@Override
	public List<Tutor> getAllTutors() {


		return tutors;
	}

	@Override
	public Tutor addNewTutor(Tutor tutor) {
			
		tutors.add(tutor);

		return null;
	}

	@Override
	public Tutor updateTutor(Integer id, Tutor tutor) {
     
		//Tutor tutor2 = getTutorById(id);
		 

		return null;
	}

	@Override
	public List<Tutor> deleteTutorById(Integer id) {

		Tutor tutor2 = getTutorById(id);
		tutors.remove(tutor2);
		

		return tutors;
	}

	@Override
	public List<Tutor> deleteAllTutors() {

		tutors.replaceAll(null);
		
		return tutors;
		
	}

}
