package com.datastrcture.algorithm.linearsearch;

public class LinearSearch {

	public static void main(String[] args) {
		
		int[] inputs  = { 20 ,50 , 35, -15, 7 ,1, 55 , -22 };

		int value = 550;
		// if element present in the array return index or else return -1.
		int searchedIndex = linearSearch(inputs, value);
		
		if( searchedIndex>0 ){
			System.out.println("The Search Element : "+ value +" is found at index : " +searchedIndex);
		}else {
			System.out.println("The Search Element : "+ value +" is not found in the list !");
		}
	}

	private static int linearSearch(int[] inputs, int value) {
		// linear search through an complete array
		for (int index = 0; index < inputs.length; index++) {
			if(inputs[index]==value) {
				return index;
			}
		}
		return -1;
	}

}
