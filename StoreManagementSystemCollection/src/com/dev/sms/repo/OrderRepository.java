package com.dev.sms.repo;

import java.util.HashMap;
import com.dev.sms.beans.Orders;

public class OrderRepository {
	
	public static HashMap<Integer , Orders > db = new HashMap<>();
	
	public OrderRepository() {
		
		Orders order1 = new Orders();
		
		order1.setOrderId(1);
		order1.setOrderPrice((float) 45.5);
		order1.setOrderQuantiy(435);
		db.put(1, order1);	
		}

}
