package com.dev.sms.services;

import com.dev.sms.beans.Orders;
import com.dev.sms.beans.Product;
import com.dev.sms.dao.DealerDAO;
import com.dev.sms.dao.DealerDAOImpl;

public class DealerServicesImpl implements DealerServices{

	private DealerDAO db = new DealerDAOImpl();

	@Override
	public Orders addOrder(int orderId, Orders order) {
		// TODO Auto-generated method stub
		return db.addOrder(orderId, order);
	}

	@Override
	public boolean removeOrder(int orderId) {
		// TODO Auto-generated method stub
		return db.removeOrder(orderId);
	}

	@Override
	public boolean updateOrderQuantity(int orderId, Integer oldOrderQuantity, Integer newOrderQuantity) {
		// TODO Auto-generated method stub
		return db.updateOrderQuantity(orderId, oldOrderQuantity, newOrderQuantity);
	}

	@Override
	public boolean updateOrderPrice(int orderId, Float oldOrderPrice, Float newOrderPrice) {
		// TODO Auto-generated method stub
		return db.updateOrderPrice(orderId, oldOrderPrice, newOrderPrice);
	}

	@Override
	public Orders searchOrder(int orderId) {
		// TODO Auto-generated method stub
		return db.searchOrder(orderId);
	}

	
	
}
