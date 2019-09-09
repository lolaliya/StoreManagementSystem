package com.dev.sms.services;

import com.dev.sms.beans.Manufacturer;

public interface AdminServices {
	
	public Manufacturer addManufacturer(int manufactuerId , Manufacturer manufacturer);
	public boolean deleteManufacturer(int manufacturerId);
	public Manufacturer searchManufacturer(int manufacturerId);
	public Manufacturer updateManufacturer(int manufacturerId , Manufacturer manufacturer);

}
