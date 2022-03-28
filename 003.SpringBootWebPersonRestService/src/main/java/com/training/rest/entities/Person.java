package com.training.rest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	
	@Id
	private Long personId;
	private String personFirstName;
	private String personLastName;
	private int personAge;
	public Person() {
		super();
	}
	public Person(Long personId, String personFirstName, String personLastName, int personAge) {
		super();
		this.personId = personId;
		this.personFirstName = personFirstName;
		this.personLastName = personLastName;
		this.personAge = personAge;
	}
	public Long getPersonId() {
		return personId;
	}
	public void setPersonId(Long personId) {
		this.personId = personId;
	}
	public String getPersonFirstName() {
		return personFirstName;
	}
	public void setPersonFirstName(String personFirstName) {
		this.personFirstName = personFirstName;
	}
	public String getPersonLastName() {
		return personLastName;
	}
	public void setPersonLastName(String personLastName) {
		this.personLastName = personLastName;
	}
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personFirstName=" + personFirstName + ", personLastName="
				+ personLastName + ", personAge=" + personAge + "]";
	}
	
	
	
	
	
}
