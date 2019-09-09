package com.dev.sms.dao;

import com.dev.sms.beans.Admin;
import com.dev.sms.beans.Manufacturer;

public interface AdminDAO {
	
	public Manufacturer addManufacturer(int manufactuerId , Manufacturer manufacturer);
	public boolean deleteManufacturer(int manufacturerId);
	public Manufacturer searchManufacturer(int manufacturerId);
	public Manufacturer updateManufacturer(int manufacturerId , Manufacturer manufacturer);
	
}
