package com.training;

public class SavingAccount extends Account{
	protected float intrestRate = 4.5f;
	
	public SavingAccount(String userId, String userName, String userEmail, int accountNumb, String customerName, double balance, int intrestRate) {
		super(userId, userName, userEmail, accountNumb, customerName, balance);
		this.intrestRate = intrestRate;
		
	}
	
	public float getIntrestRate() {
		return intrestRate;
	}
	public void setIntrestRate(int intrestRate) {
		this.intrestRate = intrestRate;
	}
	
	public void addIntrest () {
		float intrest = intrestRate /100;
		double amount = balance * intrest;
		balance =+amount;
		
		System.out.println(amount + " intrest amount added to your balance new balance is "+ balance);
	}
}
