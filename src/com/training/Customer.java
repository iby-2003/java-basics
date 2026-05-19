package com.training;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("Enter Customer First Name:");
		String customerFirstName = sc.nextLine();
		System.out.println("Enter Customer Last Name:");
		String customerLastName = sc.nextLine();
		System.out.println("Enter Customer Age:");
		int customerAge = sc.nextInt();
		
		// Print variables and values
		System.out.println("Customer Class");
		System.out.println("Customer Name: "+ customerFirstName + " " + customerLastName + " - Customer Age: " + customerAge );
		*/
		
		System.out.println("Enter Customer Age:");
		int customerAge = sc.nextInt();
		
		if (customerAge>18) {
			System.out.println("Eligibal to open an account");
		}
		else {
			System.out.println("Not yet eligibal to open an account");
		}
		
		
	}

 
}
