package com.perscholas.arraylist;

import java.util.ArrayList;
import java.util.List;

public class SearchElementsInArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = new ArrayList<>();
		
		names.add("John");
		names.add("Alice");
		names.add("Bob");
		names.add("Steve");
		names.add("John");
        names.add("Steve");
        names.add("Maria");
        names.add("Bob");

        
        /**
         * Check if an ArrayList contains an given element
         */
        System.out.println("Does names array contain \"Boo\"? : " + names.contains("Bob"));
        
        
        //Find the index of the first occurence of an element in an ArrayList
        System.out.println("1st Index of \'Steve\' is: "+ names.indexOf("Steve"));
        System.out.println("1st Index of \'John\' is: "+ names.indexOf("John"));

        //Find the index of the last Occurrence of an element
        System.out.println("Last Index of \'Steve\' is: "+ names.lastIndexOf("Steve"));
        System.out.println("Last Index of \'Bob\' is: "+ names.lastIndexOf("Bob"));


        
		
	}

}
