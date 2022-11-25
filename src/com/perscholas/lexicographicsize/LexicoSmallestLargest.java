package com.perscholas.lexicographicsize;

public class LexicoSmallestLargest {
	public static String getSmallestLargest(String s, int k) {
		String smallest = "";
		String largest = "";
		
		
		//Start iterator at 0
		// while i is less than or equal to length of 'String' -k iterate through 
		for(int i =0; i <= s.length()-k; i++) {
			//Create a new substring from index i, too i + k; 
			//That will create a substring the length of K
			String subString = s.substring(i, i +k);
			
			// Setting smallest to equal the first subString on the first iteration of the loop
			if (i == 0) {
				smallest = subString;
				
			}
			//If the current substring is 'Lexicographically' largest
			//Assign it to largest
			if (subString.compareTo(largest) > 0) {
				largest = subString;
				
			}
			//If the current substring is 'Lexicographically' smaller than smallest
			//Assign it to smallest
			if (subString.compareTo(smallest) < 0 ) {
				smallest = subString;
				
			}
			
		}
		
		return "Smallest: "+ smallest + "\n" + "Largest: " + largest;
	}
	
	

	public static void main(String[] args) {
		
		System.out.println(getSmallestLargest("welcomeToJava", 3));
		
		
		
	}

}
