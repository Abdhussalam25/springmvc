package com.training.bean;

import org.springframework.stereotype.Component;

@Component
public class Country {
	
	private int cId;
	private String cName;
	private String cCapital;
	private long cPopulation;
	private String cMotherTongue;
	public Country() {
		super();
	}
	public Country(int cId, String cName,String cCapital ,long cPopulation, String cMotherTongue) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cCapital = cCapital;
		this.cPopulation = cPopulation;
		this.cMotherTongue = cMotherTongue;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public long getcPopulation() {
		return cPopulation;
	}
	public void setcPopulation(long cPopulation) {
		this.cPopulation = cPopulation;
	}
	public String getcMotherTongue() {
		return cMotherTongue;
	}
	public void setcMotherTongue(String cMotherTongue) {
		this.cMotherTongue = cMotherTongue;
	}
	
	public String getcCapital() {
		return cCapital;
	}
	public void setcCapital(String cCapital) {
		this.cCapital = cCapital;
	}
	@Override
	public String toString() {
		return "Country [cId=" + cId + ", cName=" + cName + ", cPopulation=" + cPopulation + ", cMotherTongue="
				+ cMotherTongue + "]";
	}

	
	
	
}
