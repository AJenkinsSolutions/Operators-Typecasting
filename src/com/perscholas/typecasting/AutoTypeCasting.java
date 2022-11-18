package com.perscholas.typecasting;

public class AutoTypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 20;
		double y = 40.5;
		long p = 30;
		float q = 10.60f;
		
//		int z = x + y; // Error; cannot convert double to int 
		double z = x + y; 
		System.out.println("Sum of two numbers: " + z);
		
//		Long Long = p - q;
		float r = p - q;
		System.out.println("Subtraction of two numbers " + r );
	}

}
