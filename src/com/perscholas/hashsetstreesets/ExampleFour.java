package com.perscholas.hashsetstreesets;

import java.util.HashSet;

public class ExampleFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hSet = new HashSet<>();
		
		//add elements
		hSet.add("Apple");
		hSet.add("Mango");
		hSet.add("Grapes");
		hSet.add("Orange");

		hSet.add("Fig");

		hSet.add("Apple");
		hSet.add("Mango");
		
		hSet.add(null);
		hSet.add(null);
		
		for(String item: hSet) {
			System.out.println("---->" + item);
		}

		
	}

}
