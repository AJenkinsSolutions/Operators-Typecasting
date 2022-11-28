package com.perscholas.whileloops;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

import com.perscholas.stringmethods.IsEmptyExample;

public class SubtractionQuizLoop {

	public static void main(String[] args) {
		
		Scanner inputScanner = new Scanner(System.in);
		
		
		int correctAnswers = 0; 
		
		final int NUMBER_OF_QUESTIONS = 3;
		int count = 0; 
		
		while(count < NUMBER_OF_QUESTIONS) {
			
			int numb1 = (int) (Math.random() * 100) ;
			int numb2 = (int) (Math.random() * 100) ;
			
			
			int questionOne = numb1 - numb2; 
			System.out.printf("What is %d - %d ?" , numb1, numb2);
			int userAnsOne = inputScanner.nextInt();
			
			if(questionOne == userAnsOne) {
				correctAnswers ++;
				System.out.println(correctAnswers);
			}
			count ++;
			if(count == NUMBER_OF_QUESTIONS) {
				System.out.println("Final score " + correctAnswers + " Out of " + NUMBER_OF_QUESTIONS);
				System.out.println("Would you like to play again ?");
				inputScanner.nextLine();
				String playAgain = inputScanner.nextLine();
			
				
				if(playAgain.equalsIgnoreCase("y")) {
					count = 0;
					correctAnswers = 0;
				}
			}
			
		}
		System.out.println("Thank you for playing");
		

	}

}
