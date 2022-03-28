package com.training.model;

import java.util.Objects;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class Person {
	
	@NotNull
	private String personName;
	
	@NotNull
	@Min(value = 18)
	private int personAge;

	public Person(@NotNull String personName, @NotNull @Size(min = 1, max = 100) int personAge) {
		super();
		this.personName = personName;
		this.personAge = personAge;
	}

	public Person() {
		super();
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public int getGetPersonAge() {
		return personAge;
	}

	public void setGetPersonAge(int personAge) {
		this.personAge = personAge;
	}

	@Override
	public String toString() {
		return "Person ==> PersonName=" + personName + ", getPersonAge=" + personAge;
	}

	@Override
	public int hashCode() {
		return Objects.hash(personAge, personName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(personAge, other.personAge) && Objects.equals(personName, other.personName);
	}
	
	
	
	
	
	
	
}
