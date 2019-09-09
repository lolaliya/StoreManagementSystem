package com.dev.sms.services;

import com.dev.sms.beans.Admin;
import com.dev.sms.dao.LoginDAO;
import com.dev.sms.dao.LoginDAOImpl;

public class LoginServicesImpl implements LoginServices {
	private LoginDAO db = new LoginDAOImpl();
	
	@Override
	public boolean login(int loginId, String password) {
		return db.login(loginId, password);
	}

}
