package com.training;

public class Account extends User{
	protected int accountNumb;
	protected String customerName;
	protected double balance;
	
	public int getAccountNumb() {
		return accountNumb;
	}
	public void setAccountNumb(int accountNumb) {
		this.accountNumb = accountNumb;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public Account() {
		
	}
	
	public Account(String userId, String userName, String userEmail, int accountNumb, String customerName, double balance) {
		super(userId,userName,userEmail);
		this.accountNumb = accountNumb;
		this.customerName = customerName;
		this.balance = balance;
	}
	
	public void deposite(double amount) {
		double newBalance = getBalance();
		newBalance = newBalance + amount;
		setBalance(newBalance);
		
		System.out.println(amount + " was added to your account new balance is "+ getBalance());
	}
	
	public void withdraw(double amount) {
		double newBalance = getBalance();
		
		if (amount>newBalance) {
			System.out.println("insufficient funds");
		}
		else {
		newBalance = newBalance - amount;
		setBalance(newBalance);
		
		System.out.println(amount + " was withdrawn from your account new balance is "+ getBalance());
		}
		
	}
	
	public void displayBalance() {
		System.out.println("Your balance is: " + getBalance());
		
	}
}
