package com.perscholas.arraylist;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * Create array lilst using ListObjext upcasting
		 */
		List<String> animals = new ArrayList<>();
		
		/**
		 * Add elements to arraylist
		 */
		animals.add("Lion");
		animals.add("Tiger");
		animals.add("Cat");
		animals.add("Dog");
		
		System.out.println(animals);
		
		animals.add(2, "Elephant");
		System.out.println(animals);
			
		
		
		

	}

}
