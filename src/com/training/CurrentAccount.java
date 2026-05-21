package com.training;

public class CurrentAccount extends Account{
	protected double overdraftLimit;
	
	public CurrentAccount(String userId, String userName, String userEmail, int accountNumb, String customerName, double balance, double overdraftLimit) {
		super(userId, userName, userEmail, accountNumb, customerName, balance);
		this.overdraftLimit = overdraftLimit;
		
	}
	public double getOverdraftLimit() {
		return overdraftLimit;
	}
	public void setOverdraftLimit(int overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
	@Override
	public void withdraw(double amount) {
		if (balance + overdraftLimit >= amount) {
			balance = balance - amount;
			System.out.println(amount +" has been withdrawn from your account new balance is "+ balance);
		}
		else {
			System.out.println("Exceeds Overdraft");
		}
	}
}
