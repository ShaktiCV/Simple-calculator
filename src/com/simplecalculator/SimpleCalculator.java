package com.simplecalculator;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		
		String answer;	
		Calculator calc = new Calculator();
		Menu selectmenu = new Menu();
		Scanner scanner = new Scanner(System.in);
		do {		
		
		System.out.println("Select one of the Menu options \r\n "
				+"Addition: A , Subtraction: S, Multiplication: M, Division:D" );
		
		calc.operation=selectmenu.selectOperation(scanner);
		
		System.out.println("Select the first number");
		calc.firstnumber = calc.selectNumber(scanner);
		
		System.out.println("Select the second number");		
		calc.secondnumber = calc.selectNumber(scanner);
		
		while((calc.secondnumber==0 && calc.operation.equalsIgnoreCase("d")) ){
			System.out.println("0 in divisor will give infinity. Enter another number");		
			calc.secondnumber = calc.selectNumber(scanner);
		}
		
		calc.calculate();
		System.out.println("Select 'Y' to continue or 'N' to exit");
		answer = scanner.next();		
		} while(!answer.equalsIgnoreCase("n"));
		scanner.close();
		System.out.println("Thank you!");
		
	}

}
