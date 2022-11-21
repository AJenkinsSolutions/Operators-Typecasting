package com.perscholas.readingstdin;

import java.util.Scanner;
/**
 * System.in creates a standard input stream 
 * that is already open and ready to supply input data
 * 
 * The scanner is a simple text scanner can parse primitive types and strings 
 * using regular expressions 
 * 
 * So passing System.in to scanner allows us to parse or read strings from the standard input strea, 
 * aka the console.
 * 
 * @author apjenkins
 *
 */
public class ReadingStringFromConsole {
	public static void method1(Scanner S) {
		//Creating our scanner
				
				System.out.println("Enter Three words seperated by a spaces");
				String s1 = S.next();
				String s2 = S.next();
				String s3 = S.next();
				System.out.println("s1  is " + s1);
				System.out.println("s2 is " + s2);
				System.out.println("s3 is " + s3);
				S.nextLine();
				
				
				
				System.out.println("Enter a charcter");
				String s = S.nextLine();
				char ch = s.charAt(0);
				System.out.printf("The character entered is \'%s\'", ch);
	}
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);		
		
		method1(inputScanner);
		
		
		
		

		
		
		
		

	}

}
