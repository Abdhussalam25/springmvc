package com.training.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.rest.bean.MoneyExchanger;

@Service
public class MoneyExchangerService {

	@Autowired
	MoneyExchanger moneyExchange;
	
	
	public String rupeeToDoller(double rupee) {
		moneyExchange.setRupee(rupee);
		moneyExchange.setDoller(rupee / 76.22);
		
		return String.format("%s", moneyExchange.getDoller());
		
	}
	
	public String DollerToRupee(double doller) {
		
		moneyExchange.setDoller(doller);
		
		moneyExchange.setRupee(doller*76.22);
		
		return String.format("%s", moneyExchange.getRupee());
		
	}
	
	public String rupeeToEuro(double rupee) {
		
		moneyExchange.setRupee(rupee);
		moneyExchange.setEuro(rupee/84.16);
		
		
		
		return String.format("%s", moneyExchange.getEuro());
		
	}
	

	public String EuroToRupee(double euro) {
		
		moneyExchange.setEuro(euro);
		
		moneyExchange.setRupee(euro*84.16);
		
		return String.format("%s", moneyExchange.getRupee());
		
	}
	
	
}
