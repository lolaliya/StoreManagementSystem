package com.dev.sms.dao;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import com.dev.sms.beans.Dealer;
import com.dev.sms.beans.Manufacturer;
import com.dev.sms.beans.Orders;
import com.dev.sms.beans.Product;
import com.dev.sms.repo.DealerRepository;
import com.dev.sms.repo.ManufacturerRepository;
import com.dev.sms.repo.ProductRepository;

public class ManufacturerDAOImpl implements ManufacturerDAO {

	DealerRepository repo1 = new DealerRepository();
	private HashMap<Integer, Dealer> db1 = repo1.db1 ;

	ProductRepository repo = new ProductRepository();
	private HashMap<Integer , Product> db = repo.db;

	ManufacturerRepository repo2 = new ManufacturerRepository();
	private HashMap<Integer , Manufacturer> db2 = repo2.db2;


	public Dealer addDealer(int dealerId, Dealer dealer) {

		db1.put(dealerId, dealer);

		Iterator it = db1.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry)it.next();
			if(pair.getKey().equals(dealer.getDealerId())){
				System.out.println(pair.getKey() + " = " + pair.getValue());
			}
		}
		return dealer;
	}

	public boolean deleteDealer(int dealerId) {

		Iterator it = db1.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry)it.next();
			if(pair.getKey().equals(dealerId)){
				db.remove(dealerId);
				return true;
			}
		}
		return false;
	}

	public Dealer updateDealer(int dealerId, Dealer dealer) {

		Iterator it = db1.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry)it.next();
			if(pair.getKey().equals(dealerId)) {

				db1.put(dealerId, dealer);

				return (Dealer)pair.getValue();
			}
		}
		return null;
	}

	public boolean searchDealer(int dealerId) {
		Iterator it = db1.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry)it.next();
			if(pair.getKey().equals(dealerId)){
				return true;
			}
		}
		return false;
	}

	public boolean deleteProduct(int productId) {

		Product product = null;
		Iterator it = db.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry)it.next();
			if(pair.getKey().equals(productId)){
				db.remove(productId);
				return true;
			}
		}
		return false;
	}

	public Product updateProduct(int productId, Product product) {

		Iterator it = db.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry)it.next();
			if(pair.getKey().equals(productId)) {
				db.put(productId, product);
				return (Product)pair.getValue();
			}
		}
		return null;
	}

	public boolean searchProduct(int productId) {


		Iterator it = db.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry)it.next();
			if(pair.getKey().equals(productId)){
				return true;
			}
		}
		return false;
	}

	@Override
	public Product addProduct(int productId, Product product) {
		db.put(productId, product);

		Iterator it = db.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry)it.next();
			if(pair.getKey().equals(product)){
				System.out.println(pair.getKey() + " = " + pair.getValue());
			}
		}
		return product;
	}

	@Override
	public boolean deleteManufacturer(Integer manufacturerId) {
		Iterator it = db1.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry)it.next();
			if(pair.getKey().equals(manufacturerId)){
				db.remove(manufacturerId);
				return true;
			}
		}
		return false;
	}

	@Override
	public Manufacturer updateManufacturer(Integer ManufacturerId, Manufacturer Password) {
		Iterator it = db2.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry)it.next();
			if(pair.getKey().equals(ManufacturerId)) {

				db2.put(ManufacturerId,Password);
				return (Manufacturer)pair.getValue();
			}
		}
		return null;
	}


}
