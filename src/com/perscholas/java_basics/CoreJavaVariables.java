package com.perscholas.java_basics;

import java.security.PublicKey;
import java.sql.ResultSet;

public class CoreJavaVariables {
	private final String author;
	
	

	public CoreJavaVariables(String author) {
		super();
		this.author = author;
	}
	
	/**
	 * Gets the sum of two integers and prints results
	 * @param a
	 * @param b
	 */
	public void getSumInt(int a, int b) {
		int x = a;
		int y = b;
		int sum = x + y;
	
		System.out.println(sum);
	}
	/**
	 * Get the sum of two doubles and prints results
	 * @param a
	 * @param b
	 */
	public void getSumDouble(double a, double b) {
		double x = a;
		double y = b;
		double sum = x + y;
		System.out.println(sum);

	}
	/**
	 * Gets the sum of an integers  and a double.
	 * Uses type casting to temporarily change the type of integers x so we can add x and y together
	 * print the results to console
	 * @param a
	 * @param b
	 */
	public void getSumIntDouble(int a, double b) {
		int x = a;
		double y = b; 
		
		double sum = (double)x + y;
		System.out.println(sum);
		
	}
	/**
	 * Takes two integers  as input
	 * divides the larger number by the smaller, assign results to sum 
	 * prints results to screen
	 * @param a
	 * @param b
	 */
	public void method4(int a, int b) {
		
		int x = a;
		int y = b;
		
		int i;
		int j;
		double sum;
		
		if(a > b) {
			i = a;
			j = b;
		}else if (b > a) {
			i=b;
			j=a;
		}else {
			i = a;
			j = b;
		}
		
		try {
			sum = i / j;
			System.out.println(sum);
			
		}catch(ArithmeticException e) {
			System.out.println("Error, Can't divide by zero " + e);
			
		}
	}
	
	/**
	 * takes two double arguments
	 * assigns each to x and y respectively
	 * divide the larger number by the smaller number, prints results
	 * cast the results to a integer and prints the results 
	 * @param a
	 * @param b
	 */
	public void method5(double a, double b) {
		double x = a;
		double y = b;
		
		double i;
		double j;
		double sum;
		
		if(a > b) {
			i = a;
			j = b;
		}else if (b > a) {
			i=b;
			j=a;
		}else {
			i = a;
			j = b;
		}
		
		try {
			sum = i / j;
			if(Double.isNaN(sum)) {
				System.out.println("Result is not a Number");
				
			}else {
				System.out.println("method 5 results: "+sum);
				int recastInt = (int)sum;
				System.out.println("Method 5 recast results: " + recastInt);
				
			}
			
			
		}catch(ArithmeticException e) {
			System.out.println("Error, Can't divide by zero " + e);
			
		}
		
		
	}
	
	/**
	 * take year of birthYear as a argument 
	 * takes birthYear from currentYear 
	 * prints age to console
	 * @param birthYear 
	 */
	public void calculateAge(int birthYear) {
		
		int currentYear = 2022;
		final int YEAR_OF_BIRTH = birthYear;
		int currentAge = currentYear - YEAR_OF_BIRTH;
		
		System.out.printf("You are %d years old", currentAge);
		System.out.println();
		
	}
	/**
	 * Declares two integers x,y
	 * divide y by x and assigns it to q
	 * prints out q
	 * cast y to a (double) and reassigns q
	 * finally prints q
	 */
	public void method6() {

		int x = 5;
		int y = 6;
		double q = y/x;
		System.out.println("method 6a: " +  q);
		q = (double) y;
		System.out.println("method 6b: " + q);
	}

	/**
	 * Get calculates the total sales including sales tax 
	 */
	public void getSalesNumbers() {
		
		final double SALES_TAX = 6.25;
		
		int milkShake = 6;
		int soda = 3;
		int beer = 5;
		
		double subTotal;
		double totalSale;
		
		int order1 = milkShake * 3;
		int order2 = soda * 4;
		int order3 = beer * 2;
		
		subTotal = order1 + order2 + order3;
		totalSale = ((subTotal / 100) * SALES_TAX) + subTotal;
		System.out.printf("Get sales numbers Total: $%.2f", totalSale);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoreJavaVariables computer = new CoreJavaVariables("Alex");
		
		computer.getSumInt(20, 10);
		computer.getSumDouble(20.00, 44.44);
		computer.getSumIntDouble(5, 11.5);
		computer.method4(44, 96);
		computer.method5(5, 6);
		computer.method6();
		computer.calculateAge(1993);
		computer.getSalesNumbers();
	}

}
