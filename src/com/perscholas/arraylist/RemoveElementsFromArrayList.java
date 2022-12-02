package com.perscholas.arraylist;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementsFromArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> programmingLanguages = new ArrayList<>();
		
		programmingLanguages.add("C");
		programmingLanguages.add("C++");
		programmingLanguages.add("Java");
		programmingLanguages.add("Kotlin");
		programmingLanguages.add("Python");
		programmingLanguages.add("Perl");
		programmingLanguages.add("Ruby");
		
		System.out.println(programmingLanguages);
		
		/**
		 * Removing elements from an ArrayList
		 */

		programmingLanguages.remove(5);
		System.out.println("After removiong index 5 "+programmingLanguages);
		
		boolean isRemoved = programmingLanguages.remove("Kotlin");
		System.out.println("After removing (\"Ktolin\")" + programmingLanguages );
		
		
		/**
		 * Removing all elements from an collecion
		 */
		
		List<String> scriptingLanguages = new ArrayList<>();
		
		scriptingLanguages.add("Python");
		scriptingLanguages.add("Ruby");
		scriptingLanguages.add("Perl");
		
		programmingLanguages.removeAll(scriptingLanguages);
		System.out.println("After removing all (\"ScriptinLanguages\")" + programmingLanguages);
		
		
	
		 /**
		  * Removing all elements
		  */
		
		programmingLanguages.clear();
		System.out.println("After clear" + programmingLanguages);
	}

}
