package com.dev.sms.beans;

public class Admin {
	
	private int loginId;
	private String password;
	
	public int getLoginId() {
		return loginId;
	}
	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Admin [loginId=" + loginId + ", password=" + password + "]";
	}
	
}
