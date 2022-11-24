package com.perscholas.stringtokenizer;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Takes A strings.
 * removes all non alphabetic tokens are returns the string as a list of characters.
 * Based on a hackerRank question
 * @author apjenkins
 * @version 1.0
 *
 */
public class StringTokenizer {
		
	public static String[] tokenizer(String s) {
			String[] data = null;
			
	        if(s.isBlank()){
	        System.out.println("String is blank");
	        
	        }else{
	        
		    s = s.trim();
		    s = s.replaceAll("[ ?.@!,_'\\s\\n]+", " ");
		    s = s.replaceAll("\\s", " ");
		    
		    data = s.split(" ");
		    }
	        
	        return data;
		}
		
		
	public static void main(String[] args) {
		
		String s = "Hello, thanks for attempting this problem! Hope it will help you to learn java! Good luck and have a nice day!\n";
        String s1 = "He is a very very good boy, isn't he?\n";
        
        String[] data = tokenizer(s);
        String[] data2 = tokenizer(s1);

        System.out.println(Arrays.toString(data));
        System.out.println(Arrays.toString(data2));

	}

}
 