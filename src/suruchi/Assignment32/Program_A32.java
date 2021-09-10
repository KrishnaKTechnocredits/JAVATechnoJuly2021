package suruchi.Assignment32;

import java.util.Arrays;

public class Program_A32 {

	void maxTripletSum(int[] arr) {
		int[] output = new int[3];
		int sum = 0, maxTripletSum = 0, index2 = 0;
		for (int index = 1; index < arr.length - 1; index++) {
			if (arr[index - 1] == (arr[index] - 1) && arr[index + 1] == (arr[index] + 1)) {
				sum = arr[index - 1] + arr[index] + arr[index + 1];
			}
			if (sum > maxTripletSum) {
				maxTripletSum = sum;
				index2 = index - 1;
			}
		}
		int count = 0;
		for (int index = index2; index < index2 + 3; index++) {
			output[count] = arr[index];
			count++;
		}
		System.out.println("\n" + Arrays.toString(output) + " is the triplet having the maximum sum");
	}

	public static void main(String[] args) {
		Program_A32 program_A32 = new Program_A32();

		int[] arr = { 10, 64, 65, 66, 23, 24, 25, 26, 61, 62 };

		System.out.println("Array is as displayed: " + Arrays.toString(arr));

		program_A32.maxTripletSum(arr);
	}
}