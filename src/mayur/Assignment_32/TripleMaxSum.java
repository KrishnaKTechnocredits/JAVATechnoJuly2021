/*Program 1: find the triple which in sequence and having maximum sum.
int[] arr = {10,64,65,66,23,24,25,26,61,62};
output : 64,65,66 is a triple having maximum sum
Note : 23,24,25
       24,25,26
	   64,65,66 -> having max sum*/
package mayur.Assignment_32;

import java.util.Arrays;

public class TripleMaxSum {
	
	void getMaxSumFromTriplet(int[] input) {
		int sum = 0, startIndex = 0, maxSum = 0;
		for (int index = 0; index < input.length - 2; index++) {
			if (input[index] == input[index + 1] - 1 && input[index] == input[index + 2] - 2) {
				sum = input[index] + input[index + 1] + input[index + 2];
				if (sum > maxSum) {
					maxSum = sum;
					startIndex = index;
				}
			}
		}
		int[] output = new int[3];
		int count = 0;
		for (int index = startIndex; index < startIndex + 3; index++) {
			output[count] = input[index];
			count++;
		}
		System.out.println(Arrays.toString(output) + " is a triple having maximum sum");
	}

	public static void main(String[] args) {
		int[] input = { 10, 64, 65, 66, 23, 24, 25, 26, 61, 62 };
		TripleMaxSum tripleMaxSum = new TripleMaxSum();
		tripleMaxSum.getMaxSumFromTriplet(input);
	}
	

}
