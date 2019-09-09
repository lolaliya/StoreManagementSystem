package com.dev.sms.dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.dev.sms.beans.Admin;
import com.dev.sms.repo.AdminRepository;

public class LoginDAOImpl implements LoginDAO{

	AdminRepository repo1 = new AdminRepository();
	private HashMap<Integer , Admin> db= repo1.db;
	@Override
	public boolean login(int loginId, String password) 
	{
		for (Map.Entry<Integer,Admin> entry : db.entrySet())  {
			if(entry.getKey().equals(loginId) && (entry.getValue().getPassword().equals(password))) {
				return true;
			}
		}
	
	return false;

}
}