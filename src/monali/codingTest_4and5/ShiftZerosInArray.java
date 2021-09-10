package monali.codingTest_4and5;

import java.util.Arrays;

public class ShiftZerosInArray {

	void shiftZeros(int[] arr) {
		int[] output = new int[arr.length];
		int count = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != 0) {
				output[count] = arr[index];
				count++;
			}
		}
		System.out.println("After shifting zero at the end : " + Arrays.toString(output));

	}

	public static void main(String[] args) {
		int[] arr = { 1, 0, 0, 6, 0, 2, 3, 0, 4, 0, 5 };
		ShiftZerosInArray c4 = new ShiftZerosInArray();

		c4.shiftZeros(arr);
	}

}
