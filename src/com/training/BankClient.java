package com.training;

public class BankClient {

	public static void main(String[] args) {
		SavingAccount savingAccount = new SavingAccount("1234", "li", "abc@gmail.com", 1234, "li",500,4);
		

		savingAccount.displayBalance();
		savingAccount.deposite(300);
		savingAccount.displayBalance();
		savingAccount.withdraw(200);
		savingAccount.displayBalance();
		
		CurrentAccount currentAccount = new CurrentAccount("4321", "lo", "abc@gmail.com", 4321, "li",400,100);
		
		currentAccount.deposite(500);
		currentAccount.withdraw(150);
		currentAccount.displayBalance();
	}

}
