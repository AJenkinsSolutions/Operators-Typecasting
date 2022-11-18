package com.perscholas.operatorsnumbers;

import java.security.PublicKey;

import javax.sound.midi.Soundbank;

public class OperatorsNumbersAssignment {
	public static void method1() {
		
		System.out.println("Method 1");
		
		int x = 2;
		System.out.println("2: "+ Integer.toBinaryString(x));
		x = x << 1; 
		//binary 100
		//decimal 4
		System.out.println("2 << 1 binary: "+ Integer.toBinaryString(x));
		System.out.println("2 << 1 decimal: "+x);
		
		x = 9;
		System.out.println("9: "+Integer.toBinaryString(x));
		x = x << 1;
		//binary 10010
		//decimal 18
		System.out.println("9 << 1 binary: "+ Integer.toBinaryString(x));
		System.out.println("2 << 1 decimal: "+ x);
		
		x = 17;
		System.out.println("17: "+Integer.toBinaryString(x));
		x = x << 1;
		System.out.println("17 << 1 binary: "+ Integer.toBinaryString(x));
		System.out.println("17 << 1 decimal: "+ x);
		
		x = 88;
		System.out.println("88: "+Integer.toBinaryString(x));
		x = x << 1;
		System.out.println("88 << 1 binary: "+ Integer.toBinaryString(x));
		System.out.println("88 << 1 decimal: "+ x);
		}
	public static void method2() {
		System.out.println("Method 2");
		int x  = 150;
		System.out.println(Integer.toBinaryString(x));
		x = x >> 2;
		//100101
		System.out.println(x);
		System.out.println(Integer.toBinaryString(x));
		
		x = 255;
		System.out.println(x);
		System.out.println(Integer.toBinaryString(x));
		x = x >> 2;
		System.out.println(x);
		System.out.println(Integer.toBinaryString(x));
		
		x = 1555;
		System.out.println(x);
		System.out.println(Integer.toBinaryString(x));
		x = x >> 2;
		System.out.println(x);
		System.out.println(Integer.toBinaryString(x));
		
		x = 32456;
		System.out.println(x);
		System.out.println(Integer.toBinaryString(x));
		x = x >> 2;
		System.out.println(x);
		System.out.println(Integer.toBinaryString(x));
		
		
	}
	
	public static void method3() {
		System.out.println("Method 3");
		int x = 7 , y = 17, z;
		
		z = x & y; 
		//00001
		//1
		System.out.println("z: Decimal " + z);
		System.out.println("z: Binary " + Integer.toBinaryString(z));
		
		z = x | y;
		//10111
		System.out.println(z);
		System.out.println(Integer.toBinaryString(z));

	}
	public static void method4() {
		System.out.println("Method 4");
		int a = 10;
		System.out.println("Before postfix increment " + a );
		a = a++;
		System.out.println("After postfix increment " + a );
	}
	public static void method5() {
		System.out.println("Method 5");
		int a = 10, b =1;
		
		System.out.println(a);
		a ++;
		System.out.println(a);
		a +=1;
		System.out.println(a);
		a = a + b;
		System.out.println(a);
	
	}
	public static void method6() {
		System.out.println("Method 6");
		int x = 5, y = 8;
		
		int sum = y + ++x;
		System.out.println(sum);
		
		sum = y + x++;
		System.out.println(sum);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
		System.out.println("");
		method2();
		System.out.println("");
		method3();
		System.out.println("");
		method4();
		System.out.println("");
		method5();
		System.out.println("");
		method6();
		
		
		
		
		
	}

}
