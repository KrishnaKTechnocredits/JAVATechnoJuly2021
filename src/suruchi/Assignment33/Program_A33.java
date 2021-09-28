package suruchi.Assignment33;

import java.util.Arrays;

public class Program_A33 {

	void displayArrayAfterShiftingNonZeroNum(int[] arr) {
		int outputLength = arr.length;
		int[] output = new int[outputLength];
		int count = 0;
		for (int index = 0; index < outputLength; index++) {
			if (arr[index] == 0)
				count++;
		}
		for (int index = 0; index < outputLength; index++) {
			if (arr[index] != 0) {
				output[count] = arr[index];
				count++;
			}
		}
		System.out.println("Array after shifting non zeros to the end is: " + Arrays.toString(output));
	}

	void displayArrayAfterShiftingNegativePositiveNum(int[] arr) {
		int outputLength = arr.length;
		int[] output = new int[outputLength];
		int outputIndex = 0;
		for (int index = 0; index < outputLength; index++) {
			if (arr[index] < 0) {
				output[outputIndex] = arr[index];
				outputIndex++;
			}
		}
		for (int index = 0; index < outputLength; index++) {
			if (arr[index] > 0) {
				output[outputIndex] = arr[index];
				outputIndex++;
			}
		}
		System.out.println(
				"Array after shifting negative numbers at the beginning and all positive numbers at the end is: "
						+ Arrays.toString(output));
	}

	void displayArrayAfterShiftingNegativeZeroPositiveNum(int[] arr) {
		int outputLength = arr.length;
		int[] output = new int[outputLength];
		int outputIndex = 0;
		int zeroCount = 0;
		for (int index = 0; index < outputLength; index++) {
			if (arr[index] < 0) {
				output[outputIndex] = arr[index];
				outputIndex++;
			}
			if (arr[index] == 0)
				zeroCount++;
		}
		for (int index = 0; index < outputLength; index++) {
			if (arr[index] > 0) {
				output[outputIndex + zeroCount] = arr[index];
				outputIndex++;
			}
		}
		System.out.println(
				"Array after shifting negative numbers at the beginning ,zero and all positive numbers at the end is: "
						+ Arrays.toString(output));
	}

	void displayTripletWithMaxSum(int[] arr) {
		int maxSum = 0;
		int sum = 0;
		int maxStartIndex = 0;
		System.out.println("Triplets from the array are: ");
		for (int index = 0; index < arr.length - 2; index++) {
			if (arr[index + 1] == arr[index] + 1 && arr[index + 2] == arr[index] + 2) {
				sum = arr[index] + arr[index + 1] + arr[index + 2];
				System.out.println(arr[index] + "," + arr[index + 1] + "," + arr[index + 2]);
				if (maxSum < sum) {
					maxSum = sum;
					maxStartIndex = index;
				}
			}
		}
		System.out.println("Triplet with maximum sum is [" + arr[maxStartIndex] + "," + arr[maxStartIndex + 1] + ","
				+ arr[maxStartIndex + 2] + "] and sum is " + maxSum);

	}

	public static void main(String[] args) {
		Program_A33 program_a33 = new Program_A33();
		int[] input = { 1, 0, 3, 4, 0, 2, 88, 0, 0, 22, 34 };
		System.out.println("Array1 is: " + Arrays.toString(input));
		program_a33.displayArrayAfterShiftingNonZeroNum(input);

		int[] input2 = { 1, -3, -2, 11, 44, 55, -76, 33, 12 };
		System.out.println("\nArray2 is: " + Arrays.toString(input2));
		program_a33.displayArrayAfterShiftingNegativePositiveNum(input2);

		int[] input3 = { 1, -3, 0, -2, 11, 0, 44, 55, -76, 33, 0, 12 };
		System.out.println("\nArray3 is: " + Arrays.toString(input3));
		program_a33.displayArrayAfterShiftingNegativeZeroPositiveNum(input3);

		int[] input4 = { 1, 3, 4, 5, 7, 3, 9, 10, 11, 12, 44, 67, 1, 2, 3, 99 };
		System.out.println("\nArray4 is: " + Arrays.toString(input4));
		program_a33.displayTripletWithMaxSum(input4);
	}
}