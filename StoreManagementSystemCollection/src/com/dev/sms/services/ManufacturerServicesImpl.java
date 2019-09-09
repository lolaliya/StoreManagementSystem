package com.dev.sms.services;

import com.dev.sms.beans.Dealer;
import com.dev.sms.beans.Product;
import com.dev.sms.dao.ManufacturerDAO;
import com.dev.sms.dao.ManufacturerDAOImpl;

public class ManufacturerServicesImpl implements ManufacturerServices {
	
		
		private ManufacturerDAO db = new ManufacturerDAOImpl();

		@Override
		public Dealer addDealer(int dealerId, Dealer dealer) {
			// TODO Auto-generated method stub
			return db.addDealer(dealerId, dealer);
		}

		@Override
		public boolean deleteDealer(int dealerId) {
			// TODO Auto-generated method stub
			return db.deleteDealer(dealerId);
		}

		@Override
		public Dealer updateDealer(int dealerId, Dealer dealer) {
			// TODO Auto-generated method stub
			return db.updateDealer(dealerId, dealer);
		}

		@Override
		public boolean searchDealer(int dealerId) {
			// TODO Auto-generated method stub
			return db.searchDealer(dealerId);
		}

		@Override
		public Product addProduct(int productId, Product product) {
			// TODO Auto-generated method stub
			return db.addProduct(productId, product);
		}

		@Override
		public boolean deleteProduct(int productId) {
			// TODO Auto-generated method stub
			return db.deleteProduct(productId);
		}

		@Override
		public Product updateProduct(int productId, Product product) {
			// TODO Auto-generated method stub
			return db.updateProduct(productId, product);
		}

		@Override
		public boolean searchProduct(int productId) {
			// TODO Auto-generated method stub
			return db.searchProduct(productId);
		}

}
