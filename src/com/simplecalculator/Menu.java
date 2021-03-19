package com.simplecalculator;

import java.util.Scanner;

public class Menu {
	String operation;
	
	public String selectOperation(Scanner scanner)	
	{

		String option = scanner.next();			
			while(!(option.equalsIgnoreCase("A") || option.equalsIgnoreCase("S") ||option.equalsIgnoreCase("M") || option.equalsIgnoreCase("D") )) 
		{
				 System.out.println("Please enter valid option"); 
				 option = scanner.next(); 
				 
		}			
			
			return option;
		}
		

				



}
