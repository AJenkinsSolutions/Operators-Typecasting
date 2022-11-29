package com.perscholas.loopsassignment;

import java.awt.desktop.AboutHandler;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.event.AncestorEvent;

public class LoopsPracticeAssignment {

	public static void getTimesTable() {
		
		
		for(int i=1; i <=12; i ++) {
			System.out.println(" ");
			for(int j =1; j<=12; j ++) {
				System.out.print(" "+ j * i+ " ");
			}
		}
		System.out.println(" \n");

	}
	
	public static void getGreatCommonDivisor() {
		Scanner inputScanner = new Scanner(System.in);
		int[] userInput = new int[2];
		
		System.out.println("Enter a integer");
		
		
		for(int i=0; i<userInput.length; i ++) {
			userInput[i] = inputScanner.nextInt();
		}
		System.out.println("You choose" + Arrays.toString(userInput));
		
		
		int n1 = userInput[0];
		int n2 = userInput[1];
		
		int gcd=1;
		for(int i=2; i<Math.max(userInput[0], userInput[1]); i++) {
			if(n1%i == 0 && n2 %i ==0){
				gcd = i;
			
			}

		}
		System.out.println("Greatest Common Divisor " + gcd);
		
		
		
		
	}
	
	
	public static void predictFutureTution() {
		double tutiion = 10.000;
		double dblTution = tutiion * 2;
		int years = 0;
		
		while (tutiion <= dblTution) {
			
			tutiion = 1.07 * tutiion;
			years ++;
			
		}
		System.out.printf("Tution is %.2f in %d years",tutiion, years);
	}
	public static void main(String[] args) {
		getTimesTable();
		
		getGreatCommonDivisor();
//		
		predictFutureTution();
		
	}

}
