package com.persholas.polymorphisminterfaces;

public class LibaryInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KidUser k1 = new KidUser();
		k1.setAge(10);
		k1.setBookType("Kids");
		k1.registarAccount();
		
		KidUser k2 = new KidUser();
		k2.setAge(18);
		k2.setBookType("Fiction");
		k2.registarAccount();
		
		k1.requestBook();
		k2.requestBook();
		
		///Test case two 
		
		AdultUser a1 = new AdultUser();
		AdultUser a2 = new AdultUser();
		
		
		a1.setAge(5);
		a2.setAge(23);
		
		a1.setBookType("Kids");
		a2.setBookType("Fiction");
		
		a1.registarAccount();
		a2.registarAccount();
		
		a1.requestBook();
		a2.requestBook();
		
		
		
		
	}

}
