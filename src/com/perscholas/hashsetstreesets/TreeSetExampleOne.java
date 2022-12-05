package com.perscholas.hashsetstreesets;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExampleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> num_Treeset = new TreeSet<>();
		
		num_Treeset.add(20);
		num_Treeset.add(5);
		num_Treeset.add(15);
		num_Treeset.add(25);
		num_Treeset.add(10);
		
		
		//Using an Iterator to traverse our Tree set
		Iterator<Integer> itr = num_Treeset.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next());
			System.out.print(", ");
		}
		
		

	}

}
