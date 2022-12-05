package com.perscholas.hashsetstreesets;

import java.util.HashSet;

public class ExampleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create HashSet 
		HashSet<Integer> evenNumber = new HashSet<>();
		
		//Using add() 
		evenNumber.add(2);
		evenNumber.add(4);
		evenNumber.add(6);
		System.out.println("HashSet: " + evenNumber );
		
		HashSet<Integer> numbers = new HashSet<>();
		
		//Using Add all
		numbers.addAll(evenNumber);
		numbers.add(5);
		System.out.println("New HashSet: "+ numbers);

	}

}
