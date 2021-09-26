/*
 Program 1: find the triple which in sequence and having maximum sum.
int[] arr = {10,64,65,66,23,24,25,26,61,62};
output : 64,65,66 is a triple having maximum sum
Note : 23,24,25
       24,25,26
	   64,65,66 -> having max sum
 */
package umakant;

import java.util.Arrays;

public class Assignment32 {

	int[] tripletHavingMaximunSum(int[] input) {
		int sum = 0;
		int tripletStart = 0;
		for (int index = 0; index < input.length - 2; index++) {
			if (input[index + 1] == input[index] + 1 && input[index + 2] == input[index] + 2) {
				int newTripletsum = input[index] + input[index + 1] + input[index + 2];
				if (sum < newTripletsum) {
					sum = newTripletsum;
					tripletStart = input[index];
				}
			}
		}
		int[] output = { tripletStart, tripletStart + 1, tripletStart + 2 };
		return output;
	}

	public static void main(String[] args) {
		int[] input = { 10, 64, 65, 66, 23, 24, 25, 26, 61, 62 };
		System.out.println(Arrays.toString(new Assignment32().tripletHavingMaximunSum(input)));
	}

}
