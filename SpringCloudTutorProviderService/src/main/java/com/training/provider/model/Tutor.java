package com.training.provider.model;

public class Tutor {
	
	private Integer tutorId;
	private String tutorName;
	private String tutorTech;
	private String tutorSubject;	
	private String tutorExp;
	private Double tutorComm;
	private String tutoringMode;
	
	public Tutor() {
		super();
	}

	public Tutor(Integer tutorId, String tutorName, String tutorTech, String tutorSubject, String tutorExp,
			Double tutorComm, String tutoringMode) {
		super();
		this.tutorId = tutorId;
		this.tutorName = tutorName;
		this.tutorTech = tutorTech;
		this.tutorSubject = tutorSubject;
		this.tutorExp = tutorExp;
		this.tutorComm = tutorComm;
		this.tutoringMode = tutoringMode;
	}

	public Integer getTutorId() {
		return tutorId;
	}

	public void setTutorId(Integer tutorId) {
		this.tutorId = tutorId;
	}

	public String getTutorName() {
		return tutorName;
	}

	public void setTutorName(String tutorName) {
		this.tutorName = tutorName;
	}

	public String getTutorTech() {
		return tutorTech;
	}

	public void setTutorTech(String tutorTech) {
		this.tutorTech = tutorTech;
	}

	public String getTutorSubject() {
		return tutorSubject;
	}

	public void setTutorSubject(String tutorSubject) {
		this.tutorSubject = tutorSubject;
	}

	public String getTutorExp() {
		return tutorExp;
	}

	public void setTutorExp(String tutorExp) {
		this.tutorExp = tutorExp;
	}

	public Double getTutorComm() {
		return tutorComm;
	}

	public void setTutorComm(Double tutorComm) {
		this.tutorComm = tutorComm;
	}

	public String getTutoringMode() {
		return tutoringMode;
	}

	public void setTutoringMode(String tutoringMode) {
		this.tutoringMode = tutoringMode;
	}

	@Override
	public String toString() {
		return "Tutor ==>tutorId=" + tutorId + ", tutorName=" + tutorName + ", tutorTech=" + tutorTech + ", tutorSubject="
				+ tutorSubject + ", tutorExp=" + tutorExp + ", tutorComm=" + tutorComm + ", tutoringMode="
				+ tutoringMode;
	}

	
	
	

}
