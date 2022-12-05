package com.perscholas.linkedlistprocessing;

import java.util.LinkedList;
import java.util.*;

public class LinkedListExample {
	public static void main(String[] args) {
		//Create a LinkedList Declaration
		LinkedList<String> lList = new LinkedList<String>();
		
		lList.add("Item1");
		lList.add("Item5");
		lList.add("Item3");
		lList.add("Item6");
		lList.add("Item2");
		
	    /*Display Linked List Content*/
		System.out.println("Linked List Content: "+lList);
		
		/**
		 * 
		 */
		lList.addFirst("First Item");
		lList.addLast("Last item");
	    System.out.println("LinkedList Content after addition: " + lList);
	    
	    
	    //get item 
	    String firstVar = lList.get(0);
	    System.out.println("First element: "+ firstVar);

	    
	    //Set item
	    lList.set(0, "New first item");
	    System.out.println(lList);
	    
	    //get new first item
	    String newFirstItem = lList.get(0);
	    System.out.println(newFirstItem);
	    
	    
	    //Remove first
	    lList.removeFirst();
	    lList.removeLast();
	    System.out.println("LinkedList after deletion of first and last element" + lList);
		
	    
	    //Add position and remove position
	    lList.add(0, "Newly added item");
	    lList.remove(2);
	    System.out.println("Final Content: " + lList); 
	    
	}
	
	


}
