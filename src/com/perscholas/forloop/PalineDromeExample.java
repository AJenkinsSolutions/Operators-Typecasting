package com.perscholas.forloop;

import java.util.Scanner;

public class PalineDromeExample {

	public static void main(String[] args) {
		
		String orignal = "";
		String reverseString = "";
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Please eneter a word");
		orignal = inputScanner.nextLine();
		
		
		int len = orignal.length();
		for(int i =len -1 ; i >= 0; i--) {
			reverseString = reverseString+ orignal.charAt(i);
		}
		System.out.println(reverseString);
		if (orignal.equals(reverseString)) {
			System.out.println("is a palinedome");
		}else {
			System.out.println("is not a palinedrome");
		}

	}

}