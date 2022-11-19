package com.perscholas.stringmethods;

public class CompareToMethod {

	public static void main(String[] args) {
		/**
		 * String.compareTo(String) compares to strings 
		 * if strings are equal returns 0;
		 * if s1>s2 returns positive number
		 * if s1<s2 returns negative number
		 */
		String s1 = "hello";
		String s2 = "hello";
		String s5 = new String("hello");
		String s3 = "hemlo";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s5));
		System.out.println(s1.compareTo(s3));// -1 Because the "l" is only one time lower than m 

	}

}
