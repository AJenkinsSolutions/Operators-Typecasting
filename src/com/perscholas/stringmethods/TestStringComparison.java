package com.perscholas.stringmethods;

public class TestStringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "alexander";
		String s2 = "alexander";
		String s3 = new String("alexander");
		String s4 = "jenkins";
		/**
		 * equals checks the CONTENTS of the string for equality
		 * 
		 */
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4)+ "\n");
		
		/**
		 *  == comparison operator compares the location in memory for equality 
		 *  Because s2 was created as a 'string literal'it was added to the 'String constant pool'. 
		 *  Because s3 was initialized using the 'new' keyword a new location in memory was created
		 */
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		
		/**
		 * compareTo() method compares the string lexicographically
		 * returns integers describing if the first string was less than, equal to or greater than the second string 
		 */
		System.out.println("\n"+s1.compareTo(s2));

		


	}

}
