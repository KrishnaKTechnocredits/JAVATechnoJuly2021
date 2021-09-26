package monali.Assignment_34;

import java.util.Arrays;

/*program 1 : place 0 after the triple which in sequence.

input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
output = [1,3,4,5,0,7,3,9,10,11,0,14,44,67,1,2,3,0,99];

program 2 : place sum of triple after each triple which in sequence.

input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
output = [1,3,4,5,12,7,3,9,10,11,30,14,44,67,1,2,3,6,99]; */

public class AppendNumAfterConsecutiveNumbers {

	int[] placeZeroAfterTriplet(int[] input) {
		int count = 0;

		for (int index = 0; index < input.length - 2; index++) {

			if (input[index + 1] == input[index] + 1 && input[index + 2] == input[index] + 2) {
				count++;
			}
		}
		int output[] = new int[input.length + count];
		int outputIndex = 0;
		int index;
		for (index = 0; index < input.length - 2; index++) {
			if (input[index + 1] == input[index] + 1 && input[index + 2] == input[index] + 2) {
				output[outputIndex++] = input[index++];
				output[outputIndex++] = input[index++];
				output[outputIndex++] = input[index];
				output[outputIndex++] = 0;
			} else
				output[outputIndex++] = input[index];
		}
		while (index < input.length)
			output[outputIndex++] = input[index++];
		return output;
	}

	int[] placeSumAfterTriplet(int[] input) {
		int count = 0;
		for (int index = 0; index < input.length - 1; index++) {
			if (input[index + 1] == input[index] + 1 && input[index + 2] == input[index] + 2) {
				count++;
			}
		}
		int output[] = new int[input.length + count];
		int outputIndex = 0;
		int index1;
		for (index1 = 0; index1 < input.length - 2; index1++) {
			if (input[index1 + 1] == input[index1] + 1 && input[index1 + 2] == input[index1] + 2) {
				output[outputIndex++] = input[index1++];
				output[outputIndex++] = input[index1++];
				output[outputIndex++] = input[index1];
				output[outputIndex++] = 3 * (input[index1 - 1]);
			} else
				output[outputIndex++] = input[index1];
		}
		while (index1 < input.length) {
			output[outputIndex++] = input[index1++];
		}
		return output;
	}

	public static void main(String[] args) {
		int input[] = { 1, 3, 4, 5, 7, 3, 9, 10, 11, 14, 44, 67, 1, 2, 3, 99 };
		AppendNumAfterConsecutiveNumbers tripletZero = new AppendNumAfterConsecutiveNumbers();
		System.out.println(Arrays.toString(tripletZero.placeZeroAfterTriplet(input)));
		System.out.println(Arrays.toString(tripletZero.placeSumAfterTriplet(input)));
	}
}
