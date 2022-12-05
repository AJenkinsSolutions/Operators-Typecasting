package com.perscholas.linkedlistprocessing;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListSortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> lList = new LinkedList<>();
		LinkedList<String> lList2 = new LinkedList<>();

		lList.add("A");
		lList.add("C");
		lList.add("B");
		lList.add("D");
		
		Collections.addAll(lList2, "A", "b", "c", "d");
		System.out.println("linked llist 2" + lList2);
		
		
		//Unsorted
		System.out.println(lList);
		
		//sort 
		Collections.sort(lList);
		
		System.out.println(lList);
		
		Collections.sort(lList, Collections.reverseOrder());
		
		System.out.println(lList);
		

	}

}
