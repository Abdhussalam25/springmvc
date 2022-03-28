package com.training.rest.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.rest.service.MoneyExchangerService;

@RestController
public class MoneyExchangerController {

	@Autowired
	MoneyExchangerService moneyExService;
	
	@GetMapping("/moneyExchanger")
	public String init() {
		
		return "welcome to money Exchanger";
		
	}
	
	@GetMapping(value="/moneyExchanger/{money}")
	public String convertRupToDol( @PathVariable double money) {
		
		return moneyExService.rupeeToDoller(money);
		
	}
	
	
	@PostMapping(value="/moneyExchanger/{doller}")
	public String convertDolToRup( @PathVariable double doller) {
		
		return moneyExService.DollerToRupee(doller);
		
	}
	
	@PostMapping(value="/moneyExchanger/eurotorup/{euro}")
	public String convertEuroToRup( @PathVariable double euro) {
		
		return moneyExService.EuroToRupee(euro);
		
	}
	
	@PatchMapping(value="/moneyExchanger/{rupee}")
	public String convertRupToEuro( @PathVariable double rupee) {
		
		return moneyExService.rupeeToEuro(rupee);
		
	}
	
	
}
