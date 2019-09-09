package com.caps.sms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.caps.sms.beans.Dealer;
import com.caps.sms.beans.DealerLogin;
import com.caps.sms.services.SmsServices;
@CrossOrigin(origins="*",allowedHeaders="*")
@RestController
public class SmsDealerController {



	@Autowired
	SmsServices service;

	// Add dealer
		@RequestMapping(value = "/savedealer", method = RequestMethod.POST)
		public String addDealer(@RequestBody  Dealer dealer) {
			String state = "{\"msg\": \"failed\"}";
			boolean result = service.addDealer(dealer) ;
			if(result)
				state =  "{\"msg\": \"success\"}";
			return state;
		}

		// fetch dealer data
		@RequestMapping(value = "/get/dealer/{id}", method = RequestMethod.GET)
		public Dealer getDealer(@PathVariable("id")int id)
		{
			Dealer dealer = service.getDealer(id);
			return dealer;
		}

		// Dealer login
		@RequestMapping(value="/get/dealerlogin", method = RequestMethod.POST)
		public Dealer dealerLogin(@RequestBody  DealerLogin dealerLogin)
		{
			Dealer state = null;
			Dealer dealer = service.loginDealer(dealerLogin.getDealerId(), dealerLogin.getDealerPassword());
			if(dealer != null) 
				state = dealer;
			return state;
		}

		// Fetch all dealer data
		@RequestMapping(value = "/getAllDealers", method = RequestMethod.GET)
		public List<Dealer> getAll()
		{
			return service.getDealers();

		}
		// Delete dealer
		@RequestMapping(value="/deletedealer/{id}",method = RequestMethod.DELETE)
		public String delete(@PathVariable("id")int id)
		{
			String state = "{\"msg\": \"failed\"}";
			boolean result = service.deleteDealer(id);
			if(result)
				state = "{\"msg\": \"success\"}";
			return state;
		}


		// Update dealer data
		@RequestMapping(value = "/getdealer/update", method = RequestMethod.PUT)
		public boolean upDateDealer(@RequestBody  Dealer dealer)
		{
			return service.updateDealer(dealer.getDealerId() ,  dealer.getDealerContactNo() , 
					dealer.getDealerLocation() ,   dealer.getDealerName() ,dealer.getDealerPassword());
		}
}
