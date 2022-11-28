package com.perscholas.arrays;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PractiseAssignmentArray {
		

	public static void method1() {
			int[] listArray = {1,2,3};
			System.out.println(Arrays.toString(listArray));
		
		}
	public static int method2() {
		int[] intArray = {13, 5, 7, 68, 2};
		
		int arrayLen = intArray.length;
		int middleElement = arrayLen / 2;
		
		return intArray[middleElement];
	}
	
	public static void method3() {
		String[] color = {"red", "green", "blue", "yellow"};
		
		String[] targetArray = new String[color.length];
		
		targetArray = color.clone();
		System.out.println(Arrays.toString(targetArray));
		
		
		
		
	}
	
	public static void method4() {
		int[] listArray = new int[5];
		
	}
	
	public static void method5() {
		int[] listArray = new int[5];
		
		for(int i =0; i < listArray.length; i ++) {
			listArray[i] = i;
		}
	}
	
	public static void method6() {
		int[] listArray = {1,2,3,4,5};
		
		for(int i =0; i < listArray.length; i ++) {
			if(i == listArray.length /2) {
				continue;
			}else {
				System.out.println(listArray[i]);
			}
		}
	}
	
	public static void method7() {
		int[] arrayList = {1,2,3,4,5};
		
		
		int a = arrayList[arrayList.length-1];
		int b = arrayList[0];
		
		arrayList[0] = a;
		arrayList[arrayList.length -1] = b;
		
		System.out.println(Arrays.toString(arrayList));
		
		
		
	}
	
	public static void method8() {
		
		int[] numbArray = {4,2,9,13,1,0};
		
		Arrays.sort(numbArray);
		System.out.println(Arrays.toString(numbArray));
		
	}
	
	
	public static void method9() {
		ArrayList assortmentArrayList = new ArrayList<>(Arrays.asList(1, "hello", "world", "mama", 1.0));
		System.out.println(assortmentArrayList);

	}
	
	public static void method10() {
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.println("How many favs ? ");
		int favs = inputScanner.nextInt();
		
		String[] listArray = new String[favs];
		inputScanner.nextLine();
		
		System.out.println("Add item");
		for(int i =0; i <listArray.length; i++) {
			
			listArray[i] = inputScanner.nextLine();
		}
		
		System.out.println(Arrays.toString(listArray));
		
	}
	public static void main(String[] args) {
			method1();
			System.out.println(method2());
			method3();
			method4();
			method5();
			method6();
			method7();
			method8();
			method9();
			method10();
	}

}
