package com.perscholas.lexicographicsize;

public class LexicoSmallestLargest {
	public static String getSmallestLargest(String s, int k) {
		String smallest = "";
		String largest = "";
		
		
		
		for(int i =0; i <= s.length()-k; i++) {
			String subString = s.substring(i, i +k);
			
			// because initially our smallest 'var' will always be lexico smallest 
			// this basically adds the first substring we create to the value of the smallest
			if (i == 0) {
				smallest = subString;
				
			}
			
			if (subString.compareTo(largest) > 0) {
				largest = subString;
				
			}
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
