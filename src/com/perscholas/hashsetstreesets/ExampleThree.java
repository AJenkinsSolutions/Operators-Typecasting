package com.perscholas.hashsetstreesets;

import java.util.HashSet;

public class ExampleThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calculate the difference between to hashsets
		HashSet<Integer> primeNumbers = new HashSet<>();
		
		primeNumbers.add(2);
		primeNumbers.add(3);
		primeNumbers.add(5);
		System.out.println("Hash Set 1 " + primeNumbers);
		
		HashSet<Integer> oddNumbers = new HashSet<>();
		oddNumbers.add(1);
		oddNumbers.add(3);
		oddNumbers.add(5);
		System.out.println("Hashset2: " + oddNumbers);
		
		//Difference betwen HashSet1 and HashSet2 
		primeNumbers.removeAll(oddNumbers);
		System.out.println("Duplicates: " + primeNumbers);
	}

}
