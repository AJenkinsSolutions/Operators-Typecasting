package com.perscholas.operators;

public class UnaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = +1; //sum is now 
		System.out.println(sum);
		
		sum --; // sum is now 0
		System.out.println(sum);
		
		sum ++; // sum is now 1
		System.out.println(sum);
		
		
		sum = -sum; // sum is now negative
		System.out.println(sum);
		
		boolean result = false;
		
		System.out.println(result);  //false
		System.out.println(!result); //true
		
		
	}

}
