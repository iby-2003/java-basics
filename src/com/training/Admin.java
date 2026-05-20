package com.training;

public class Admin extends User{
	
	private boolean isSuperAdmin;
	public Admin(String userId, String userName, String userEmail, boolean isSuperAdmin) {
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.isSuperAdmin = isSuperAdmin;
	}
	public boolean isSuperAdmin() {
		return isSuperAdmin;
	}
	public void setSuperAdmin(boolean isSuperAdmin) {
		this.isSuperAdmin = isSuperAdmin;
	}
	@Override
	public String toString() {
		return "Admin [userId=" + userId + ", userName=" + userName + ", userEmail="
				+ userEmail + ", isSuperAdmin=" + isSuperAdmin +  "]";
	}
	
	
}
