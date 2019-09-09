package com.dev.sms.dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import com.dev.sms.beans.Orders;		
import com.dev.sms.repo.OrderRepository;

public class DealerDAOImpl implements DealerDAO {

	OrderRepository repo = new OrderRepository();
	private HashMap<Integer , Orders> db = repo.db;
	Orders order = null;


	@Override
	public Orders addOrder(int orderId, Orders order) {
		db.put(orderId, order);
		Iterator iterator = db.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry pair = (Map.Entry)iterator.next();
			System.out.println(pair.getKey() + " = " + pair.getValue());
		}
		return order;
	}

	@Override
	public boolean removeOrder(int orderId) {
		Orders order = null;
		Iterator it = db.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry)it.next();
			if(pair.getKey().equals(orderId)){
				db.remove(orderId);
				return true;
			}
		}
		return false;
	}

	@Override
	public Orders searchOrder(int orderId) {
		Iterator it = db.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry)it.next();
			if(pair.getKey().equals(orderId)){
				return (Orders)pair.getValue();
			}
		}
		return order;
	}

	@Override
	public boolean updateOrderQuantity(int orderId, Integer oldOrderQuantity, Integer newOrderQuantity) {
		Orders order = searchOrder(orderId);
		if(order != null) {
			if(order.getOrderQuantiy() == (oldOrderQuantity)) {
				order.setOrderQuantiy(newOrderQuantity);
				db.put(order.getOrderId(), order);
				return true;
			}
		}
		return false;
	}


	@Override
	public boolean updateOrderPrice(int orderId, Float oldOrderPrice, Float newOrderPrice) {
		Orders order = searchOrder(orderId);
		if(order != null) {
			if(order.getOrderPrice() == (oldOrderPrice)) {
				order.setOrderPrice(newOrderPrice);
				db.put(order.getOrderId(), order);
				return true;
			}
		}else {
			return false;
		}
		return false;
	}
}
