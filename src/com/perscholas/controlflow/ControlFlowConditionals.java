package com.perscholas.controlflow;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

import javax.security.auth.x500.X500Principal;

import org.w3c.dom.ls.LSException;

public class ControlFlowConditionals {
	
	/**
	 * one way control flow 
	 */
	public static void method1() {
		int x = 7; 
		if(x < 10) {
			System.out.println("Less than 10");
			x = 15;
		}
	}
	
	/**
	 * Two conditional statement
	 */
	public static void method2() {
		int x =7;
		if(x < 10) {
			System.out.println("Less than 10");
		}else {
			System.out.println("Greater than 10");
			
		}
	}
	/**
	 * 3 way conditional 
	 */
	public static void method3() {
		int x = 15;
		if(x < 10) {
			System.out.println("Less than 10");
		}else if (x>10 && x < 20) {
			System.out.println("Between 10 and 20");
			
		}else if (x >=20) {
			System.out.println("Greater than or equal to 20");
		}
			
		
		
		
	}
	
	public static void method4() {
		int x = 15;
		if (x < 10 || x > 20) {
			System.out.println("Out of range");
			
		}else if (x >=10 && x <=20) {
			System.out.println("In range");
		}
	}
	
	/**
	 * Grades calculator 
	 */
	public static void getGrades() {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Please enter your grade");
		int x = inputScanner.nextInt();
		
		if (x >= 90 && x <=100) {
			System.out.println("A");
			
		}else if (x>=80 && x<=89) {
			System.out.println("B");
			
		}else if (x >=70 && x <=79) {
			System.out.println("C");
			
		}else if (x>=60 && x<=69) {
			System.out.println("D");
			
		}else if (x<60) {
			System.out.println("F");
			
		}else {
			System.out.println("Score out of range");
		}
	}
	
	/**
	 * Get user input and return the day of week
	 */
	public static void getDaysOfWeek() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an integer between 1 or 7");
		int x = input.nextInt();
		
		switch (x) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thrusday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Out of range");
			break;
		}
		
		
	}
	/**
	 * Get users income and filing status 
	 * Calculate the tax rate based on income and status 
	 */
	public static void calculateTax() {
		System.out.println("Welcome to the tax calcuator !! ");
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your income");
		double income = input.nextDouble();
		
		System.out.println("PLease enter your filing status\n 1.Single, 2.Married filling Jointly, 3.Married Filling seperatly, 4. Head of Household");
		int statusString = input.nextInt();
		
		double taxRate = 0;
		
		switch (statusString) {
		case 1:
			System.out.println("Single");
			if(income >= 0 && income <= 8350) {
				taxRate = 10;
			}else if (income >= 8351 && income <= 33950) {
				taxRate = 15;
			}else if (income >= 33951 && income <= 82250) {
				taxRate = 25;
			}else if (income >= 82251 && income <= 171550) {
				taxRate = 28;
			}else if (income >= 171551 && income <= 372950) {
				taxRate = 33;
			}else if (income >= 372951) {
				taxRate= 35;
			}
//			System.out.println(taxRate);
			break;
		case 2:
			System.out.println("Married filling Jointly");
			//determine tax rate
			if(income >= 0 && income <= 16700) {
				taxRate = 10;
			}else if (income >= 16701 && income <= 67900) {
				taxRate = 15;
			}else if (income >= 67901 && income <= 137050) {
				taxRate = 25;
			}else if (income >= 137051 && income <= 208850) {
				taxRate = 28;
			}else if (income >= 208851 && income <= 372950) {
				taxRate = 33;
			}else if (income >= 372951) {
				taxRate= 35;
			}
//			System.out.println(taxRate);
			break;
		case 3:
			System.out.println("Married filling Separately");
			if(income >= 0 && income <= 8350) {
				taxRate = 10;
			}else if (income >= 8351 && income <= 33950) {
				taxRate = 15;
			}else if (income >= 33951 && income <= 68525) {
				taxRate = 25;
			}else if (income >= 68526 && income <= 104425) {
				taxRate = 28;
			}else if (income >= 104426 && income <= 186475) {
				taxRate = 33;
			}else if (income >= 186476) {
				taxRate= 35;
			}
//			System.out.println(taxRate);
			break;
		case 4:
			System.out.println("Head of Household");
			if(income >= 0 && income <= 11950) {
				taxRate = 10;
			}else if (income >= 11951 && income <= 45500) {
				taxRate = 15;
			}else if (income >= 45501 && income <= 117450) {
				taxRate = 25;
			}else if (income >= 117451 && income <= 190200) {
				taxRate = 28;
			}else if (income >= 190201 && income <= 372950) {
				taxRate = 33;
			}else if (income >= 372951) {
				taxRate= 35;
			}
//			System.out.println(taxRate);
			break;

		default:
			break;
		}
		//Calculate and return the Tax amount 
		double taxAmount = income / 100; 
		taxAmount =  taxAmount * taxRate;
		
		String us = DecimalFormat.getCurrencyInstance(Locale.US).format(taxAmount);
		System.out.printf("Your tax rate %.0f percent \n", taxRate);
		System.out.println("You owe: " + us);
	}
	
	public static void main(String[] args) {
		
//		method1();
//		method2();
//		method3();
//		method4();
//		getGrades();
//		getDaysOfWeek();
		calculateTax();
	}

}
