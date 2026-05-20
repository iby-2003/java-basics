package com.training;

public class User {

	 // 1. attribute
	protected String userId;
	protected String userName;
	protected String userEmail;
	
	
	//constructors
	public User () {
	}
	
	public User(String userId, String userName, String userEmail) {
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
	}
	
	//static variable
	static String organizationName;
	
	// 2. behavior 
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUsreName() {
		return userName;
	}
	public void setUsreName(String usreName) {
		this.userName = usreName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + "]";
	}
	
	 

}
