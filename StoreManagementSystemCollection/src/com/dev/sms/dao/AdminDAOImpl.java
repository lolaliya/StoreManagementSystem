package com.dev.sms.dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import com.dev.sms.beans.Manufacturer;
import com.dev.sms.repo.ManufacturerRepository;

public class AdminDAOImpl implements AdminDAO {

	ManufacturerRepository repo = new ManufacturerRepository();
	private HashMap<Integer , Manufacturer> db = repo.db2;

	public Manufacturer addManufacturer(int manufactuerId, Manufacturer manufacturer) {

		db.put(manufacturer.getId(), manufacturer);
		Iterator it = db.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry)it.next();
			System.out.println(pair.getKey() + " = " + pair.getValue());
		}
		return manufacturer;
	}


	public boolean deleteManufacturer(int manufacturerId) {

		Manufacturer manufacturer = null;
		Iterator it = db.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry)it.next();
			if(pair.getKey().equals(manufacturerId)){
				db.remove(manufacturerId);
				return true;
			}
		}
		return false;
	}

	public Manufacturer searchManufacturer(int manufacturerId) {

		Manufacturer manufacturer = new Manufacturer();
		Iterator it = db.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry)it.next();
			if(pair.getKey().equals(manufacturerId)){

				manufacturer = db.get(manufacturerId);
				System.out.println(pair.getKey() + " = " + pair.getValue());

				return manufacturer;
			}
		}
		return manufacturer;
	}

	public Manufacturer updateManufacturer(int manufacturerId, Manufacturer manufacturer) {

		Manufacturer mannufcaturer1 = new Manufacturer();

		Iterator it = db.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry)it.next();
			if(pair.getKey().equals(manufacturerId)) {

				db.put(manufacturerId, manufacturer);

				return (Manufacturer)pair.getValue();
			}
		}
		return null;
	}
}
