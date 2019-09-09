package com.dev.sms.services;

import com.dev.sms.beans.Admin;
import com.dev.sms.beans.Manufacturer;
import com.dev.sms.dao.AdminDAO;
import com.dev.sms.dao.AdminDAOImpl;

public class AdminServicesImpl implements AdminServices{
	
	private AdminDAO db = new AdminDAOImpl();

	public Manufacturer addManufacturer(int manufactuerId, Manufacturer manufacturer) {
		// TODO Auto-generated method stub
		return db.addManufacturer(manufactuerId, manufacturer);
	}

	public boolean deleteManufacturer(int manufacturerId) {
		// TODO Auto-generated method stub
		return db.deleteManufacturer(manufacturerId);
	}

	public Manufacturer searchManufacturer(int manufacturerId) {
		// TODO Auto-generated method stub
		return db.searchManufacturer(manufacturerId);
	}

	public Manufacturer updateManufacturer(int manufacturerId, Manufacturer manufacturer) {
		// TODO Auto-generated method stub
		return db.updateManufacturer(manufacturerId, manufacturer);
	}

	
}
