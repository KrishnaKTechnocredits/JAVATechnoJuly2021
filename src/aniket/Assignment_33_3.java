package aniket;

import java.util.Arrays;

public class Assignment_33_3 {
	int[] getNumbers(int[] arr) {
		int[] output = new int[arr.length];
		int count = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] < 0) {
				output[count] += arr[index];
				count++;
			}

		}

		for (int index = 0; index < arr.length; index++) {
			if (arr[index] == 0) {
				output[count] += arr[index];
				count++;

			}

		}

		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > 0) {
				output[count] += arr[index];
				count++;

			}
		}

		return output;

	}

	public static void main(String[] args) {

		int[] input = { 1, -3, 0, -2, 11, 0, 44, 55, -76, 33, 0, 12 };
		System.out.println(Arrays.toString(new Assignment_33_3().getNumbers(input)));
	}
}
