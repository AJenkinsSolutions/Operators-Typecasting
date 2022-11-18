package com.perscholas.operators;

public class AssignmentOperatorsDemo {
	
	public static void main(String[] args) {
		
		System.out.println("Assigning primitaves");
		System.out.println("--------");
		//Assigning Primitives
		int j, k; 
		j = 10; //j get the value of 10
		j = 5; //j gets the value 5, previous  value get overwritten
		k = j; // k get the value of j 5
		System.out.println("j is : " + j);
		System.out.println("k is : " + k + "\n" );
		
		
		System.out.println("Mupltiple Assignment");
		System.out.println("--------");
		//			Multiple Assignments
		k = j = 10; // (k = (j=10))
		System.out.println("j is : " + j);
		System.out.println("k is : " + k);
		
		
		
		


	}

}
