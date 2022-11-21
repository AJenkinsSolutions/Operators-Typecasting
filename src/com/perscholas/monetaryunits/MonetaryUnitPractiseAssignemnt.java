package com.perscholas.monetaryunits;

import java.security.PublicKey;
import java.sql.ResultSet;
import java.util.Scanner;

public class MonetaryUnitPractiseAssignemnt {
	
	/**
	 * Converts userInput of type double and converts it to cents
	 * @param userInput
	 * @return
	 */
	static int convertToCents(double userInput) {
		int centsAmounts = (int)(userInput*100);
		return centsAmounts;
	}
	/**
	 * To find the how many dollars go into our remaining amount
	 * divide the amount left by 100
	 * @param amountLeft
	 * @return amoutn of dollars
	 */
	static int getDollarAmount(int amountLeft) {
		int dollars = amountLeft /100;
		
		return dollars;
	}
	/**
	 * helper methods
	 * get reaming amount by getting remainder after modulus 
	 * @param amountLeft
	 * @param divisor
	 * @return
	 */
	static int getRemainingAmount(int amountLeft, int divisor) {
		int result = amountLeft % divisor;
		return result;
	}
	
	static int getQuarterAmount(int amountLeft) {
		int result = amountLeft / 25;
		return result;
	}
	
	static int getDimeAmount(int amountLeft) {
		int results = amountLeft /10;	
		
		return results;
	}
	static int getNickelAmount(int amountLeft) {
		int result = amountLeft / 5;
		return result;
	}
	static int getCentAmount(int amountLeft) {
		int result = amountLeft / 1;
		return result;
	}
	static void convertMoney() {
		
		int dollars = 0, quarters = 0, dime = 0 , nickles = 0, pennies = 0;
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("please enter amount");
		double d = inputScanner.nextDouble();
		
		
		int  amountLeftInCents = convertToCents(d);
		System.out.println("Intial amount in pennies"+amountLeftInCents);
		
		//find dollars 
		dollars = getDollarAmount(amountLeftInCents);
		
		//get the remainder of amount modulus 100
		amountLeftInCents = getRemainingAmount(amountLeftInCents, 100);
		
		//quarters
		quarters = getQuarterAmount(amountLeftInCents);	
		amountLeftInCents = getRemainingAmount(amountLeftInCents, 25);
	
		//dime
		dime = getDimeAmount(amountLeftInCents);
		amountLeftInCents = getRemainingAmount(amountLeftInCents, 10);
		
		//Nickels
		nickles = getNickelAmount(amountLeftInCents);
		amountLeftInCents = getRemainingAmount(amountLeftInCents, 5);
		
		pennies = getCentAmount(amountLeftInCents);
		amountLeftInCents = getRemainingAmount(amountLeftInCents, 1);
		
		System.out.println(amountLeftInCents);
		System.out.printf("Dollars: %d, Quarters: %d, Dime: %d, Nickle: %d, Pennies: %d", dollars, quarters, dime, nickles, pennies);

	}
	
	public static void main(String[] args) {
		convertMoney();
	}

}
