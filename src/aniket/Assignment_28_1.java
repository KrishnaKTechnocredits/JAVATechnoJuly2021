package aniket;

import java.util.Arrays;

public class Assignment_28_1 {
	void getSecondHighestNumber(int[] arr) {
		int maxnumber = arr[0];
		int secondHighestNumber = arr[1];
		if (maxnumber < secondHighestNumber) {
			maxnumber = arr[1];
			secondHighestNumber = arr[0];

		}
		for (int index = 2; index < arr.length; index++) {
			if (maxnumber < arr[index]) {
				secondHighestNumber = maxnumber;
				maxnumber = arr[index];
			} else if (secondHighestNumber < arr[index]) {
				secondHighestNumber = arr[index];

			}

		}
		System.out.println(
				"Secondhighest number in the given array " + Arrays.toString(arr) + " is " + secondHighestNumber);
	}

	public static void main(String[] args) {
		int[] arr = { 10, 23, 2, 11, 55, 43, 99 };
		Assignment_28_1 assignment_28_1 = new Assignment_28_1();
		assignment_28_1.getSecondHighestNumber(arr);

	}
}
