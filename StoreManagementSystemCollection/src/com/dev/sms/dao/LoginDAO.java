package com.dev.sms.dao;

import com.dev.sms.beans.Admin;

public interface LoginDAO {
	public boolean login(int loginId, String password);
}
