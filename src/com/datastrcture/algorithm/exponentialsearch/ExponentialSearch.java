package com.datastrcture.algorithm.exponentialsearch;

import java.util.Arrays;

public class ExponentialSearch {

	public static void main(String[] args) {
		
		int[] inputs = { -22, -15, -3, -1, 7, 9, 20, 35, 55 };
		
		int value = 35;
		
		int searchedIndex = exponentialSearch(inputs,value);

		System.out.println("The Element : " + value + " is found at index : " + searchedIndex);
	}

	private static int exponentialSearch(int[] inputs, int value) {
		// start with index 0 and it is the search value
		if(inputs[0] == value) {
			return 0;
		}
		
		// find the range in which elements may reside
		int i = 1;
		while(i <inputs.length && inputs[i]<= value) {
			i = i * 2;
		}
		// apply binary search on found range.
		return Arrays.binarySearch(inputs, i/2, Math.min(i, inputs.length), value);
	}

}
