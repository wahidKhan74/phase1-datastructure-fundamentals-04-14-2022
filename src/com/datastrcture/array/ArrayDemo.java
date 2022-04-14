package com.datastrcture.array;

public class ArrayDemo {

	public static void main(String[] args) {

		// declare an array
		int[] numbers = new int[10]; // arrays is linear fixed in size DS.

		numbers[0] = 30;
		numbers[1] = 40;
		numbers[2] = 50;
		numbers[3] = 44;
		numbers[4] = 53;

		float amounts[] = new float[5];

		amounts[0] = 3.3330f;
		amounts[1] = 4.44450f;
		amounts[2] = 5.4540f;

		// default valus based array
		String[] names = { "John", "Mike", "Will", "Sam" };

		// iterate over numbers
		for (int index = 0; index < numbers.length; index++) {
			System.out.println(index + "  index has value " + numbers[index]);
		}

		System.out.println("-----------------");
		// iterate over amount
		for (int index = 0; index < amounts.length; index++) {
			System.out.println(index + "  index has value " + amounts[index]);
		}

		System.out.println("-----------------");
		// iterate over names
		for (int index = 0; index < names.length; index++) {
			System.out.println(index + "  index has value " + names[index]);
		}
	}

}
