package com.datastrcture.array;

import java.util.Arrays;

public class ArrayOrderStatistic {

	public static void main(String[] args) {

		int[] items = { -15, 20, 3, 50, 26, 24, 78, 90 };

		int position = 3;

		// order statistic : find 3rd largest element
		int response1 = findKthLargest(items, position);
		System.out.println(" The position '" + position + "' largest element is " + response1);

		// order statistic : find 3rd smallest element
		int response2 = findKthSmallest(items, position);
		System.out.println(" The position '"+position +"' smalllest element is "+response2);
	}

	private static int findKthSmallest(int[] items, int position) {
		// sort array with ascending order
		Arrays.sort(items);
		
		return items[position-1];
	}

	private static int findKthLargest(int[] items, int position) {
		// sort array with ascending order
		Arrays.sort(items);

		// return kth element
		return items[items.length - position];

	}

}
