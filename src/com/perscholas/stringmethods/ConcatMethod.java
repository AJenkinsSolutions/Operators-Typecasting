package com.perscholas.stringmethods;

public class ConcatMethod {

	public static void main(String[] args) {
		/**
		 * Will concatenate the contents of two strings together.
		 */
		String s1 = "Learn ";
		String s2 = "java ";
		String s3 = "please";
		System.out.println(s1.concat(s2).concat(s3));
		
		//The addition operator will achieve the same thing
		System.out.println(s1 + s2 + s3 + " !");

	}

}
