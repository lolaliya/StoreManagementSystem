package com.dev.sms.repo;

import java.util.HashMap;

import com.dev.sms.beans.Manufacturer;

public class ManufacturerRepository {
	
	public static HashMap<Integer , Manufacturer> db2 = new HashMap<>();
	
	
	public ManufacturerRepository() {
	Manufacturer manufacturer = new Manufacturer();
	
	manufacturer.setId(1);
	manufacturer.setName("NandiBrandCompany");
	manufacturer.setPassword("root");
	manufacturer.setAddress("banglore");
	manufacturer.setPhoneNumber(364533829);
	manufacturer.setEmail("nandicompany@outlook.com");
	db2.put(manufacturer.getId() , manufacturer);
	
	Manufacturer manufacturer2 = new Manufacturer();
	manufacturer2.setId(2);
	manufacturer2.setName("GoldenCompany");
	manufacturer2.setPassword("root");
	manufacturer2.setAddress("basavangudi,banglore");
	manufacturer2.setPhoneNumber(568556289);
	manufacturer2.setEmail("goldencompantt@outlook.com");
	db2.put(manufacturer2.getId() , manufacturer2);
	
	}
}
