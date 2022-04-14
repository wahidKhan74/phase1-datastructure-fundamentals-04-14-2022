package com.datastrcture.array;

public class ArrayDemo2 {

	public static void main(String[] args) {
		
		int[] numbers = {10,20,30,40,50,60,70,80};
		
		iterateForward(numbers);
		
		System.out.println("------------------------");
		
		iterateReverse(numbers);
	}

	private static void iterateReverse(int[] numbers) {
		// iterate over array from end
		for (int index = numbers.length-1; index >= 0; index--) {
			System.out.println(index + "  index has value " + numbers[index]);
		}
		
	}

	private static void iterateForward(int[] numbers) {
		// iterate over array from start
		for (int index = 0; index < numbers.length; index++) {
			System.out.println(index + "  index has value " + numbers[index]);
		}
	}
	
	
}
