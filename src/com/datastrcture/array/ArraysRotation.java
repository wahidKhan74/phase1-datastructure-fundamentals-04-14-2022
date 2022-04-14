package com.datastrcture.array;

import java.util.Arrays;

public class ArraysRotation {

	public static void main(String[] args) {
		
		// declare an array
		int[] numbers = {10,20,30,40,50,60,70,80};
		
		System.out.println("Before Rotation : ");
		System.out.println(Arrays.toString(numbers));
		
		rotateLeft(numbers, 3);
		
		
		System.out.println("After Rotation : ");
		System.out.println(Arrays.toString(numbers));

	}
	

	private static void rotateLeft(int[] numbers, int rotateCount) {
		// create a tmp array
		int[] temp = new int[rotateCount];
		
		// copy elements into temp[] based on rotateCount
		for (int index = 0; index < rotateCount; index++) {
			temp[index] = numbers[index];
		}
		
		// move actual data forward
		for (int index = rotateCount; index < numbers.length; index++) {
			numbers[index-rotateCount] = numbers[index];
		}
		
		// copy temp array and append to main array.
		for (int index = 0; index < rotateCount; index++) {
			numbers[index + numbers.length - rotateCount] =temp[index];
		}
}		
}
