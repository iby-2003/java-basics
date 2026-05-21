package com.training;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		try {
			y= 8/x;
		}
		catch(NumberFormatException e) {
			System.out.println("NumberFormatException caught");
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmaticException caught");
		}
		
		
		finally {
			System.out.println("fin");
		}
		
		System.out.println("Value of y is: "+ y);
			
	}
}
