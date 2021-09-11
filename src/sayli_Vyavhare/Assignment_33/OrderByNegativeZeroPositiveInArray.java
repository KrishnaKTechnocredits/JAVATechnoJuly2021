/*program 3: place all negative numbers at the beginning, zeros and all positive numbers at the end.
input = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
output : [-3,-2,-76,0,0,0,1,11,44,55,33,12]*/

package sayli_Vyavhare.Assignment_33;

import java.util.Arrays;

public class OrderByNegativeZeroPositiveInArray {

	int[] getNegativeZeroPositiveInArray(int[] input) {
		int count = 0, zeroCount = 0;
		int[] output = new int[input.length];

		for (int index = 0; index < input.length; index++) {

			if (input[index] < 0) {
				output[count] = input[index];
				count++;
			}
			if (input[index] == 0)
				zeroCount++;
		}
		int outputIndex = count + zeroCount;
		for (int index1 = 0; index1 < input.length; index1++) {

			if (input[index1] > 0) {
				output[outputIndex] = input[index1];
				outputIndex++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		OrderByNegativeZeroPositiveInArray negative = new OrderByNegativeZeroPositiveInArray();
		int[] input = { 1, -3, 0, -2, 11, 0, 44, 55, -76, 33, 0, 12 };
		System.out.println("Given array is: " + Arrays.toString(input));
		int[] arr = negative.getNegativeZeroPositiveInArray(input);

		System.out.print("Array in Order of Negative-Zero-Positive  is: " + Arrays.toString(arr));

	}

}
