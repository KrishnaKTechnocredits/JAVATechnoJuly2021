/*Assignment - 32 : 10th Sep'2021
 
Program 1: find the triple which in sequence and having maximum sum.
int[] arr = {10,64,65,66,23,24,25,26,61,62};
output : 64,65,66 is a triple having maximum sum
Note : 23,24,25             	   24,25,26                      	64,65,66 -> having max sum

*/
package sayli_Vyavhare;

import java.util.Arrays;

public class TripletsSum_assign_32 {
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
		int[] input = { 10, 64, 65, 66, 23, 24, 25, 26, 61, 62 };

		System.out.println("Given  array is:" + Arrays.toString(input));

		TripletsSum_assign_32 maxsum = new TripletsSum_assign_32();
		System.out.println("having  sum : " + maxsum.getMaxSumTriplets(input));
	}
}
