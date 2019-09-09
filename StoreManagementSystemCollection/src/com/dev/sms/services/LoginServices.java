package com.dev.sms.services;

import com.dev.sms.beans.Admin;

public interface LoginServices {
	public boolean login(int loginId, String password);
}
