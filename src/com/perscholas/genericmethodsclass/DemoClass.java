package com.perscholas.genericmethodsclass;

public class DemoClass {
	
	
	public <T> void genericMethod(T data) {
		System.out.println("Generics method: ");
		System.out.println("Data Passed: " + data);
	}

}
