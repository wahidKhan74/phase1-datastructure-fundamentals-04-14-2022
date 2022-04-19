package com.datastrcture.algorithm.binarysearch;

public class BinarySearchWithRecursiveCall {

	public static void main(String[] args) {

		// sorted array
		int[] inputs = { -22, -15, -3, -1, 7, 9, 20, 35, 55 };

		// search value
		int value = -3;
		int start = 0;
		int end = inputs.length - 1;

		// if element present in the array return index or else return -1.
		int searchedIndex = binarySearch(inputs, value, start, end);

		if (searchedIndex > 0) {
			System.out.println("The Search Element : " + value + " is found at index : " + searchedIndex);
		} else {
			System.out.println("The Search Element : " + value + " is not found in the list !");
		}

	}

	private static int binarySearch(int[] inputs, int value, int start, int end) {

		// breaking condition -> if value not found
		if(start>end) {
			return -1;
		}
		// find midpoint
		int midpoint = (start + end) / 2;
		// midpoint value is the search
		if (inputs[midpoint] == value) {
			return midpoint;
		}
		// search in right half
		else if (inputs[midpoint] < value) {
			return binarySearch(inputs,value,midpoint+1,end);
		}
		// search in left half
		else {
			return binarySearch(inputs,value,start,midpoint-1);
		}
	}

}
