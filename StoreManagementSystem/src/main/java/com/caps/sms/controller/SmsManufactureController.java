package com.caps.sms.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.caps.sms.beans.Manufacturer;
import com.caps.sms.beans.ManufacturerLogin;
import com.caps.sms.services.SmsServicesImpl;
@CrossOrigin(origins="*",allowedHeaders="*")
@RestController
public class SmsManufactureController {

	@Autowired
	SmsServicesImpl service =  new SmsServicesImpl();

	// Add manufacturer
	@RequestMapping(value = "/savemanufacturer",method = RequestMethod.POST)
	public String addManufacturer(@RequestBody  Manufacturer manufacturer) {
		String state = "{\"msg\":\"failed\"}";
		boolean result = service.addManufacturer(manufacturer) ;
		if(result)
			state = "{\"msg\":\"success\"}";
		return state;
	}

	// Fetch manufacturer data
	@RequestMapping(value = "/get/manufacturer/{id}", method = RequestMethod.GET)
	public Manufacturer getManufacturer(@PathVariable("id")int id)
	{
		return  service.getManufacturer(id);
	}

	// Login manufacturer
	@RequestMapping(value = "/get/loginmanufacturer", method = RequestMethod.POST)
	public Manufacturer manufacturerLogin(@RequestBody  ManufacturerLogin manufacturerLogin)
	{
		Manufacturer state = null;
		Manufacturer manufacturer = service.loginManufacturer(manufacturerLogin.getManufacturerId() ,manufacturerLogin.getManufacturerPassword());
		if(manufacturer != null) {
			state = manufacturer;
		}
		return state;
	}

	// Fetch all manufacturers data
	@RequestMapping(value = "/getAllManufacturers",method = RequestMethod.GET)
	public List<Manufacturer> getAll()
	{
		return service.getManufacturers();
	}

	// Delete manufacturer data
	@RequestMapping(value = "/deletemanufacturer/{id}", method = RequestMethod.DELETE)
	public String delete(@PathVariable("id")int id)
	{
		String state = "{\"msg\":\"failed\"}";
		boolean res = service.deleteManufacturer(id);
		if(res)
			state = "{\"msg\":\"success\"}";
		return 	state;
	}

	//Fetch all manufacturers data 
	@RequestMapping(value=  "/getmanufacturer/update", method = RequestMethod.PUT)
	public boolean upDateManufacturer(@RequestBody  Manufacturer manufacturer)
	{
		return service.updateManufacturer(manufacturer.getManufacturerId() ,  manufacturer.getManufacturerContactNo() , 
				manufacturer.getManufacturerLocation() ,   manufacturer.getManufacturerName() , manufacturer.getManufacturerPassword());
	}

}
