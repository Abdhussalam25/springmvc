package com.training.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.bean.Country;

@Service
public class CountryService {
	
	private HashMap<Integer, Country> countryMap;
	
	@Autowired
	Country country;

	public CountryService() {
		
		countryMap = new HashMap<Integer, Country>();
		country = new Country(111, "India","Delhi",140,"Hindi");
		countryMap.put(1, country);
		country = new Country(222, "Nepal","Khatmandu",50,"Hindi");
		countryMap.put(2, country);
		country = new Country(333, "Pakistan","Islamabad",70,"Urdu");
		countryMap.put(3, country);
		country = new Country(444, "Bangladesh","Delhi",60,"Urdu");
		countryMap.put(4, country);
		country = new Country(555, "China","Shangai",160,"Chinese");
		countryMap.put(5, country);	
		
	}
	
	public List<Country> getAllCountries(){
		List<Country> countries = new ArrayList<Country>(countryMap.values());		
		return countries;
	}
	
	public Country getCountryById(int id) {
		country = countryMap.get(id);
		return country;
	}
	
	public Country addCountry(Country country){
		
		countryMap.put(getMaxId(), country);
		
		return country;
	}
	
	public Country updateCountry(Country country) {
		
		if(country.getcId()<=0) {
			return null;
		}else {
			countryMap.put(country.getcId(), country);
			return country;
		}
		
	}

	public void deleteCountryById(int id) {
		countryMap.remove(id);
	}
	
	public void deleteAllCountries() {
		
		countryMap.clear();
		System.out.println("Hash map is empty now");
	}

	public int getMaxId() {
		int max = countryMap.size() + 1;
		
		return max;
		
	}
	
	
}
