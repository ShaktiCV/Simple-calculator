package com.simplecalculator;

import java.util.Scanner;

public class Calculator {
	
	String operation;
	double firstnumber;
	double secondnumber;	
	

	
	public double selectNumber(Scanner scanner) {
		String number = scanner.next();
		while(numberOrNot(number))
		{
			System.out.println("Please enter valid number");
			number = scanner.next();
		}
		
		return Double.parseDouble(number);			
		
			
	}
	
	private boolean numberOrNot(String input) {
		
		try {
			Double.parseDouble(input);
			
		} catch (java.lang.NumberFormatException e) {
			
			return true;
		}
		return false;
	}
		
		
	
	public void  calculate() {

		double result = 0;

		switch (operation.toUpperCase()) {

			case "A":
				result = firstnumber + secondnumber;
				break;

			case "S":
				result = firstnumber - secondnumber;
				break;

			case "M":
				result = firstnumber * secondnumber;
				break;

			case "D":
							
				result = firstnumber / secondnumber;
				break;

			}
						
			System.out.println("Result of calculation is " + result);
			
			
			

		}

	


}
	