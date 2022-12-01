package com.persholas.polymorphisminterfaces;

public class AdultUser implements LibaryUser{

	private int age;
	private String bookType;
	@Override
	public void registarAccount() {
		// TODO Auto-generated method stub
		if(this.age >= 1) {
			System.out.println("You have successfully registered under an Adult Account");
		}else {
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		}
		
	}
	@Override
	public void requestBook() {
		// TODO Auto-generated method stub
		if(this.bookType.equalsIgnoreCase("Fiction")) {
			System.out.println("Book Issued successfully, please return the book within 7 days");
		}else {
			System.out.println("Oops, you are allowed to take only adult Fiction books");
		}
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBookType() {
		return bookType;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	} 
	
}
