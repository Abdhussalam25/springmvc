package com.training.rest.bean;

import org.springframework.stereotype.Component;

@Component
public class MoneyExchanger {

	private double rupee;
	private double doller;
	private double euro;
	public MoneyExchanger() {
		this.doller = 0;
		this.rupee = 0;
	}
	public MoneyExchanger(double rupee, double doller, double euro) {
		super();
		this.rupee = rupee;
		this.doller = doller;
		this.euro = euro;
	}
	public double getRupee() {
		return rupee;
	}
	public void setRupee(double rupee) {
		this.rupee = rupee;
	}
	public double getDoller() {
		return doller;
	}
	public void setDoller(double doller) {
		this.doller = doller;
	}
	
	
	public double getEuro() {
		return euro;
	}
	public void setEuro(double euro) {
		this.euro = euro;
	}
	@Override
	public String toString() {
		return "MoneyExchanger [rupee=" + rupee + ", doller=" + doller + ", euro=" + euro + "]";
	}
	
	
	
	
	
}
