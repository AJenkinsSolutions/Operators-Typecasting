package com.perscholas.currencyformatter;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
	/**
	 * Takes input double from user and converts it into
	 * Us, French, Chinese, India currency
	 */
	public static void formatCurrency() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter amount of money you would like to format as a double ");
 
		
		double payment = scanner.nextDouble();
        scanner.close();
		System.out.println("You entered " + payment);
		
		String france = DecimalFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        String us = DecimalFormat.getCurrencyInstance(Locale.US).format(payment);
        String china = DecimalFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = formatter.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
        
	}

	public static void main(String[] args) {
		
		formatCurrency();
		

	}

}
