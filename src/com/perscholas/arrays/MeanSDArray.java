package com.perscholas.arrays;

import java.util.Arrays;

public class MeanSDArray {

	public static void main(String[] args) {
		
		int[] marks = {74, 43, 58, 60, 90, 64, 70};
		int sum = 0;
		int sumsq; 
		double mean, stdDev; 
		
		int arrayLen = marks.length;
		
		for(int item: marks) {sum+= item;}
		
		mean = (double) sum / (double) arrayLen;
		
		//subtract mean from each score 
		
		for(int i=0; i <arrayLen; i++) {
			marks[i] = marks[i] - (int)mean;
		}
		
		//sqaure each deviation from mean 
		
		for(int i=0; i <arrayLen; i++) {
			marks[i] = marks[i] * marks[i];
		}
		
		//sum of all sqaures 
		
		for(int i =0; i <arrayLen; i ++) {
			sum += marks[i];
	
		}
		
		//Find variance
		
		double variance = sum/(arrayLen-1);
		
		//stdDev
		
		stdDev = Math.sqrt(variance);
		
		System.out.printf("Standard Deviation is: %.2f", stdDev);
	}

}
