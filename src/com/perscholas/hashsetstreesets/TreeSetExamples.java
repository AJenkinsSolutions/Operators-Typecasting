package com.perscholas.hashsetstreesets;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> cities = new TreeSet<>();
		
		cities.add("UAE");
		cities.add("Mumbai");
	       cities.add("NewYork");
	       cities.add("Hyderabad");
	       cities.add("Karachi");
	       cities.add("Xanadu");
	       cities.add("Lahore");
	       cities.add("Zagazig");
	       cities.add("Yingkou");
	       
	       System.out.println(cities);
	       System.out.println(cities.descendingSet());
	       
	       System.out.println(cities);

//	       System.out.println("TreeSet: " + cities);

		
	}

}
