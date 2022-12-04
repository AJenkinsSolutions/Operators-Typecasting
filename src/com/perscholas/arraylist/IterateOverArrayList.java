package com.perscholas.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterateOverArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> tvShows = new ArrayList<>();
		
		 tvShows.add("Breaking Bad");
	     tvShows.add("Game Of Thrones");
	     tvShows.add("Friends");
	     tvShows.add("Prison break");
	    
	     
	     /**
	      * Iterator object
	      */
	     Iterator<String> tvShowIterator = tvShows.iterator();
	     
	     System.out.println("\n=== Iterate using an iterator() ===");
	     System.out.println("\n=== Iterator and While Loop ===");
	     /**
	      * This is how we use an iterator to iterate through a array list
	      */
	     
	     
	     while (tvShowIterator.hasNext()) {
	         String tvShow = tvShowIterator.next();
	         System.out.println(tvShow);
	      }
	     
	     
 	     System.out.println("\n=== Iterate using simple forEachRemaining loop ===");
	     //ForEach Remaining  
	     tvShowIterator.forEachRemaining(tvShow -> {System.out.println(tvShow);});
	     
//	     //Ehanched Loop 
	     System.out.println("\n=== Iterate using simple for-each loop ===");
	     for(String item: tvShows) {
	        System.out.println(item);
	     }
//	     //For loop 
	     System.out.println("\n=== Iterate using for loop with index ===");
	     for(int i = 0; i < tvShows.size(); i++) {
	        System.out.println(tvShows.get(i));
	     }

	     System.out.println("\n=== Iterate iterator ===");
	     
	     
	     
	     ListIterator iterator = tvShows.listIterator();
	     System.out.println("Elements in forward direction");
	     
	     
	     System.out.println("\n====== Iterator using while loop=======");

	     while (iterator.hasNext())
	     {
	        System.out.println(iterator.next());
	     }
	     
	     System.out.println("=========Elements in backward direction======");

	     while (iterator.hasPrevious())
	     {
	        System.out.println(iterator.previous());
	     }



	     

	}
}
