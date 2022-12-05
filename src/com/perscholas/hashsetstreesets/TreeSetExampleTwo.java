package com.perscholas.hashsetstreesets;

import java.util.TreeSet;

public class TreeSetExampleTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> numTreeSet = new TreeSet<>();
		
		numTreeSet.add(2);
		numTreeSet.add(5);
		numTreeSet.add(6);
		System.out.println("Treeset: " + numTreeSet);
		
		
		//using remove()
		boolean isRemoved =numTreeSet.remove(6);
		System.out.print("Is 6 removed: "+ isRemoved+"\n");

		// Using the removeAll() method
        boolean value2 = numTreeSet.removeAll(numTreeSet);
        System.out.println("Are all elements removed? " + value2);

		
	}

}
