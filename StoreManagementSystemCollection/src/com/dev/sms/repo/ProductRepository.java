package com.dev.sms.repo;

import java.util.HashMap;
import com.dev.sms.beans.Product;

public class ProductRepository {
	
	public static HashMap<Integer , Product> db = new HashMap<>();
	
	public ProductRepository() {
		
		Product product1 = new Product();
		
		product1.setProductId(1);
		product1.setProductName("chain");
		product1.setProductDescription("something blah blah..");
		
		db.put(product1.getProductId(), product1);
	}

}
