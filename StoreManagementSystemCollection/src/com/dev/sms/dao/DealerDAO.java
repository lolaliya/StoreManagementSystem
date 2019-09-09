package com.dev.sms.dao;

import com.dev.sms.beans.Orders;

public interface DealerDAO {
	
	public Orders addOrder(int orderId , Orders order);
	public boolean removeOrder(int orderId);
	public boolean updateOrderQuantity(int orderId , Integer oldOrderQuantity, Integer newOrderQuantity);
	public boolean updateOrderPrice(int orderId, Float oldOrderPrice, Float newOrderPrice);
	public Orders searchOrder(int orderId);


}
