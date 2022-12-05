package com.perscholas.arraylistuserdefinedobjects;

import java.util.ArrayList;

public class ShowData {
	public static void main(String[] args) {
		//Creating our helper class to return an ArrayList<Book> of Book objects 
		
		AddDataToArrayList b = new AddDataToArrayList();
		
		ArrayList<Book> mybooklist = b.bookdetails();
        
		
		for(Book showValue: mybooklist)
    {
    // ---- invoking getter method for geting Data---------       
 System.out.println(showValue.getNumber() + " " + showValue.getName() +" "+ showValue.getCategory() +" "+ showValue.getAuthor());
    }

	}

}
