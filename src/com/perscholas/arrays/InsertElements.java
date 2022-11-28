package com.perscholas.arrays;

import java.util.Scanner;

public class InsertElements {

	public static void main(String[] args) {
		
		Scanner inputScanner = new Scanner(System.in);
		
		int[] arr = new int[11];
		
		System.out.println("Enter 10 elements");
		for(int i=0; i <10; i ++) {
			arr[i] = inputScanner.nextInt();
		}
		System.out.println("Enter element to insert");
		int element = inputScanner.nextInt();
		arr[arr.length -1] = element;
		
		System.out.println("Now the array is");
		for(int item: arr) {System.out.println(item);}
	}

}
