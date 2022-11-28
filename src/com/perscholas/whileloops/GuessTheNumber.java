package com.perscholas.whileloops;

import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		
		
		int randInt = (int)(Math.random() * 100);
		Scanner input = new Scanner(System.in);
		
		boolean gameOver = false;
		
		while(!gameOver) {
		
		System.out.println("Please Enter a number");
		int userInput = input.nextInt();
		
			if(userInput == randInt) {
			
				gameOver = true;
				System.out.println("Congrats, computers number " + randInt);
				
			}else if (userInput < randInt) {
				System.out.println("Wrong answer too Low ! choose a higher number");
			}else if(userInput > randInt) {
				System.out.println("Wrong answer too High ! choose a Lower number");

			}
		}
		
	}

}
