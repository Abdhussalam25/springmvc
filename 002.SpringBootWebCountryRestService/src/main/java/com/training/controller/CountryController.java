package com.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.training.bean.Country;
import com.training.service.CountryService;

@RestController
public class CountryController {

	@Autowired
	CountryService countryService;
	
//	@GetMapping("/countries")
//	public String init() {
//		
//		return "welcome to money Exchanger";
//		
//	}
	
	@GetMapping("/countries")
	public List<Country> getCounties(){
		List<Country> list = countryService.getAllCountries();
		return list;
	}
	
	@GetMapping("/countries/{id}")
	public Country getCountryById(@PathVariable int id) {
		
		Country country = countryService.getCountryById(id);
		return country;
	}
	
	@PostMapping(value = "/countries")
	public List<Country> addCountry(@RequestBody Country country){
		
		
		countryService.addCountry(country);
		List<Country> list = countryService.getAllCountries();
		
		return list;	
		
	}
	
	@PutMapping("countries/{id}")
	public Country updateCountry(@RequestBody Country country) {
		
		Country country2 =  countryService.updateCountry(country);
		return country2;
		
	}
	
	@RequestMapping(value="/countries/{id}", method=RequestMethod.DELETE)
	public void deleteCountryById(@PathVariable int id){
		countryService.deleteCountryById(id);
		List<Country> countries = countryService.getAllCountries();
		
	}
	
	@RequestMapping(value="/countries",method=RequestMethod.DELETE)
	public List<Country> deleteCountries(){
		countryService.deleteAllCountries();
		List<Country> countries = countryService.getAllCountries();
		
		return countries;
	}
	
	
	
}
