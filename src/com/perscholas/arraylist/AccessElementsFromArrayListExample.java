package com.perscholas.arraylist;

import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.Sides;

public class AccessElementsFromArrayListExample {

	public static void main(String[] args) {
		
		List<String> topCompanies = new ArrayList<>();
		
		System.out.println("Is the topCompanies list empty " + topCompanies.isEmpty());
		topCompanies.add("Google");
		topCompanies.add("Apple");
		topCompanies.add("Microsoft");
		topCompanies.add("Amazon");
		topCompanies.add("FaceBook");
	
		System.out.println("Here are the top " + topCompanies.size() + "companies in the world");
		
		System.out.println(topCompanies);
		
		/**
		 * Retreive an element by its index
		 */
		
		String bestCompany = topCompanies.get(0);
		String secondBestCompany = topCompanies.get(1);
		String lastCompany = topCompanies.get(topCompanies.size()-1);
		
		System.out.println("Best company "+ bestCompany);
		System.out.println("Second best compnay " + secondBestCompany);
		System.out.println("Last Compnay in thge list" + lastCompany);
		
		
		/**
		 * Modifying the element at given index
		 */
		topCompanies.set(4, "Walmart");
		System.out.println("Modified top companies list " + topCompanies);
		
	}

}
