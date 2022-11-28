package com.perscholas.arrays;

public class ArrayDemoOne {

	public static void main(String[] args) {

		int [] ages = {12, 13, 24, 42, 59};
		
		System.out.println("Accessing Elements of an Array");
		System.out.println("First element: " + ages[0]);
		System.out.println("Second element: " + ages[1]);
		System.out.println("Thrid element: " + ages[2]);
		System.out.println("Forth element: " + ages[3]);
		System.out.println("Firth element: " + ages[4]);
		
		//Using loops
		
		System.out.println("Using Forloops with arrays");
		for(int i = 0; i< ages.length; i ++) {
			System.out.println(ages[i]);
		}
		System.out.println("Enhanced ForLoops");
		for(int item: ages) {System.out.println(item);}
	}

}
