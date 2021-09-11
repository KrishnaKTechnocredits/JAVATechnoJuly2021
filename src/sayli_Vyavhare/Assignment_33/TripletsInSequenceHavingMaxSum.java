/*
 * program 4 : find the triple which in sequence and having maximum sum

input = {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
iteration : 3,4,5
         9,10,11
		 10,11,12
         1,2,3
output : 10,11,12*/
package sayli_Vyavhare.Assignment_33;

import java.util.Arrays;

public class TripletsInSequenceHavingMaxSum {
	int getMaxSumTriplets(int[] input) {
		int sum = 0, maxSum = 0, outputIndex = 0;

		for (int index = 0; index < input.length - 2; index++) {
			if (input[index] == (input[index + 1] - 1) && input[index + 1] == input[index + 2] - 1) {

				sum = input[index] + input[index + 1] + input[index + 2];
			}
			if (maxSum < sum) {
				maxSum = sum;
				outputIndex = index;

			}
		}
		System.out.println("Triplet in sequence with maximum sum are: ");

		for (int index1 = outputIndex; index1 < outputIndex + 3; index1++) {
			System.out.print(input[index1] + " ");
		}
		return maxSum;
	}

	public static void main(String[] args) {
		int[] input = { 1, 3, 4, 5, 7, 3, 9, 10, 11, 12, 44, 67, 1, 2, 3, 99 };

		System.out.println("Given  array is:" + Arrays.toString(input));

		TripletsInSequenceHavingMaxSum maxsum = new TripletsInSequenceHavingMaxSum();
		System.out.println("having  sum : " + maxsum.getMaxSumTriplets(input));
	}
}
