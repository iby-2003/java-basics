package com.training;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		for(int j=0; j<3; j++) {
			System.out.println("number pf iterations: " + j);
		}
		
		
		int k = 0 ;
		do{
			System.out.println("Inside do while loop");
			k++;
		}while(k<3);

		
		
		/*
		int i=0;
		while (i<3) {
			
			System.out.println("Enter x to exit:");
			String choice = sc.nextLine();
			if(choice.equalsIgnoreCase("X")){
				break;
			}
			
			System.out.println("Enter first name for customer " + (i+1) + ":");
			sc.nextLine();
			
			System.out.println("Enter Last name for customer " + (i+1) + ":");
			sc.nextLine();
			
			System.out.println("Enter age for customer " + (i+1) + ":");
			Integer.valueOf(sc.nextLine());

			i++;
			
		}
		System.out.println("Total number of customers saved:"+ i);
		*/
		
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
		
		
		/*
		System.out.println("Enter Customer Age:");
		int customerAge = sc.nextInt();
		
		if (customerAge>18) {
			System.out.println("Eligibal to open an account");
		}
		else {
			System.out.println("Not yet eligibal to open an account");
			
			
		}
		*/
		
	}

 
}
