package com.groot.bean;

public class UserLogin {

	private String userName;
	private String password;
	private String email;
	private String userID;

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}

	@Override
	public String toString() {
		return "UserLogin [getUserName()=" + getUserName() + ", getPassword()="
				+ getPassword() + ", getEmail()=" + getEmail()
				+ ", getUserID()=" + getUserID() + "]";
	}
}
