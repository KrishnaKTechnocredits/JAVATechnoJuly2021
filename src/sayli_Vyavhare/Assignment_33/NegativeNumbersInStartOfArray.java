/*Program 2: place all negative numbers at the beginning and all positive numbers at the end.
input = {1,-3,-2,11,44,55,-76,33,12};
output : [-3,-2,-76,1,11,44,55,33,12]*/
package sayli_Vyavhare.Assignment_33;

import java.util.Arrays;

public class NegativeNumbersInStartOfArray {

	int[] getNegativeAtStartOfArray(int[] input) {
		int count = 0;
		int[] output = new int[input.length];

		for (int index = 0; index < input.length; index++) {

			if (input[index] < 0) {

				output[count] = input[index];
				count++;
			}
		}

		int outputIndex = count;
		for (int index = 0; index < input.length; index++) {

			if (input[index] > 0) {
				output[outputIndex] = input[index];
				outputIndex++;
			}
		}
		return output;

	}

	public static void main(String[] args) {
		NegativeNumbersInStartOfArray negative = new NegativeNumbersInStartOfArray();
		int[] input = { 1, -3, -2, 11, 44, 55, -76, 33, 12 };
		System.out.println("Given array is: " + Arrays.toString(input));
		int[] arr = negative.getNegativeAtStartOfArray(input);
		System.out.print("Array in Order of Negative-Positive number is: " + Arrays.toString(arr));

	}

}
