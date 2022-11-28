package com.perscholas.arrays;

import java.awt.image.AreaAveragingScaleFilter;

public class ArrayDemoThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] values = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
		
		int sum = 0; 
		
		for(int item: values) {sum += item;}
		
		int arrayLen = values.length;
		
		double average = Math.round((double)sum / (double)arrayLen);
		System.out.println("Sum: "+ sum);

		System.out.println("Average: "+ average);
		
	}

}
