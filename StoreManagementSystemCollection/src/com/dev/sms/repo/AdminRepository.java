package com.dev.sms.repo;

import java.util.HashMap;

import com.dev.sms.beans.Admin;

public class AdminRepository {

	public static HashMap<Integer , Admin> db = new HashMap<>();

	public AdminRepository() {
		Admin admin1 = new Admin();

		admin1.setLoginId(1);
		admin1.setPassword("Login@1234");

		db.put(admin1.getLoginId(), admin1);
	}
}
