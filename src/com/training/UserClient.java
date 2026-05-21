package com.training;

import java.util.Scanner;

import java.util.List;
import java.util.ArrayList;

public class UserClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		User user1 = new User();
		user1.setUserId("A101");
		user1.setUsreName("lilo");
		user1.setUserEmail("abc@gmail.com");
		
		*/
		/*
		Scanner sc = new Scanner(System.in); 
		User.organizationName = "OAB";
		System.out.println("How many users do wish to create: ");
		int num = Integer.valueOf(sc.nextLine());
		*/
		/*
		 * // set and get users method 1
		List<User> userList = new ArrayList<>();
		
		for (int i=1; i<= num; i++) {
			System.out.println("Enter User details:");
			System.out.println("userID: ");
			String userID = sc.nextLine();
			System.out.println("userName: ");
			String userName = sc.nextLine();
			System.out.println("userEmail: " );
			String userEmail = sc.nextLine();
			
			userList.add(new User (userID, userName, userEmail));
			
			System.out.println("User Added");
		}
		*/
		// set and get users method 2
		/*User[] user = new User[num];
		for (int i=0; i< num; i++) {
			System.out.println("Enter User details:");
			System.out.println("userID: ");
			String userID = sc.nextLine();
			System.out.println("userName: ");
			String userName = sc.nextLine();
			System.out.println("userEmail: " );
			String userEmail = sc.nextLine();
			
			user[i]= new User (userID, userName, userEmail);
			
			System.out.println("User Added");
		}
		
		
		// User user3 = userList.get(0); // set and get users method 1
		User user1 = user[0]; // set and get users method 2
		System.out.println("User3 Details: "+ user1);
		*/
		
		//Admin admin1 =  new Admin("Adm101", "an","angmail", true);
		//System.out.println(admin1);
		
	}

}


