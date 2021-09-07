package trupti;

import java.util.Arrays;

public class Coding_test_3 {

	public static void main(String[] args) {

		int[] inputArray = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		System.out.println("Input Array:" + Arrays.toString(inputArray));
		int arrayIndex = 1;
		for (int index = arrayIndex; index < inputArray.length - 1; index++) {
			inputArray[index] = inputArray[index + 1];
		}
		System.out.println("New array after removing element:" + Arrays.toString(inputArray));

	}
}
