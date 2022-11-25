package com.perscholas.forloop;


public class PyramidExample {

	public static void main(String[] args) {
		String pyramidString = "";
		
		for(int i=0; i< 5; i ++) {
			pyramidString = pyramidString + '*';
			System.out.println(pyramidString);
		}
	}

}
