package com.perscholas.stringmethods;
import java.util.Arrays;

public class SplitMethod {

	public static void main(String[] args) {
		/**
		 * Splits a strings contents by a specified delimiter and returns its contents as an Array
		 */
		String s1 = "It was the best of times";
		String s2 = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age if foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of darkness, it was the season of light";
		String[] result= s1.split(" ");
		String[] results2 = s2.split(",");
		System.out.println(Arrays.toString(result));
		System.out.println(Arrays.toString(results2));


	}

}
