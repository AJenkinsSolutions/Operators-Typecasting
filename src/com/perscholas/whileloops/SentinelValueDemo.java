package com.perscholas.whileloops;

import java.util.Scanner;

public class SentinelValueDemo {

	public static void main(String[] args) {
		
		Scanner inputScanner = new Scanner(System.in);
		int rounds = (int)(Math.random() * 5);
		int count = 0;
		int sum = 0;
		int userInput = 0;
		do {
		sum += userInput;
		System.out.println("Enter number");
		userInput = inputScanner.nextInt();
		} while (userInput != 0 );
		
		System.out.println("Sum is " + sum);
	
	
		}
		
		
		
		
	}



