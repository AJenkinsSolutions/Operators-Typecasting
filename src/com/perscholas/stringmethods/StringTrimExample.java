package com.perscholas.stringmethods;

public class StringTrimExample {
	public static void main(String[] args) {
		/**
		 * HL: .trim() String method removes leading and trailing whitespace from a string
		 * Ll: Checks for unicode value of the space character ('\0020') before and after string
		 * Removes it.
		 * Returns omitted string  
		 * 
		 */
		String s1 = "   hello   ";
		System.out.println(s1 + "how are you"); //without trim 
		System.out.println(s1.trim() + " how are you"); // with trim 
	}

}
