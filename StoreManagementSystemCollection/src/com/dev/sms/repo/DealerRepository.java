package com.dev.sms.repo;

import java.util.HashMap;
import com.dev.sms.beans.Dealer;

public class DealerRepository {
	public static HashMap<Integer , Dealer> db1 = new HashMap<>();

	public DealerRepository() {

		Dealer dealer1 = new Dealer();

		dealer1.setDealerId(1);
		dealer1.setDealerName("ramoji rao");
		dealer1.setPassword("dealer1674");
		dealer1.setAddress("rajainagar, banglore");
		dealer1.setPhoneNumber(468263934);
		dealer1.setEmail("dealer1@gamil.com");

		db1.put(dealer1.getDealerId(), dealer1);

	}
	

}
