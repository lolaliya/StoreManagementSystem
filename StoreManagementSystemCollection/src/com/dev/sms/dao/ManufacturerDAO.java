package com.dev.sms.dao;

import com.dev.sms.beans.Dealer;
import com.dev.sms.beans.Manufacturer;
import com.dev.sms.beans.Product;

public interface ManufacturerDAO {
	
	public Dealer addDealer(int dealerId, Dealer dealer);
	public boolean deleteDealer(int dealerId);
	public Dealer updateDealer(int dealerId , Dealer dealer);
	public boolean searchDealer(int dealerId);
	
	public Product addProduct(int productId , Product product);
	public boolean deleteProduct(int productId);
	public Product updateProduct(int productId , Product product );
	public boolean searchProduct(int productId);
	
	
	public Manufacturer updateManufacturer(Integer ManufacturerId , Manufacturer Password);
	public boolean deleteManufacturer(Integer manufacturerId);
}
