/*Assignment - 33 : 11th Sep'2021

*Program 1 : shift all non zeros at the end.*
input : {1,0,3,4,0,2,88,0,0,22,34};
output : [0,0,0,0,1,3,4,2,88,22,34]

*Program 2: place all negative numbers at the beginning and all positive numbers at the end.*
input = {1,-3,-2,11,44,55,-76,33,12};
output : [-3,-2,-76,1,11,44,55,33,12]

*program 3: place all negative numbers at the beginning, zeros and all positive numbers at the end.*
input = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
output : [-3,-2,-76,0,0,0,1,11,44,55,33,12]

*program 4 : find the triple which in sequence and having maximum sum*

input = {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
iteration : 3,4,5
         9,10,11
		 10,11,12
         1,2,3
output : 10,11,12*/

package astha.Assignment33;

import java.util.Arrays;

public class Assignment33 {

	// Program 1 : shift all non zeros at the end.

	int[] shiftNonZeroElement(int[] input) {
		int[] output = new int[input.length];
		int zeroCount = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] == 0)
				zeroCount++;
		}
		for (int index = 0; index < input.length; index++) {
			if (input[index] != 0) {
				output[zeroCount] = input[index];
				zeroCount++;
			}
		}
		return output;
	}

	// Program 2: place all negative numbers at the beginning and all positive
	// numbers at the end.

	int[] shiftNegativeAndPositiveElements(int[] input) {
		int[] output = new int[input.length];
		int negativeCount = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] < 0) {
				output[negativeCount] = input[index];
				// System.out.println(negativeCount + " " + output[negativeCount]);
				negativeCount++;
			}
		}

		for (int index = 0; index < input.length; index++) {
			if (input[index] > 0) {
				output[negativeCount] = input[index];
				negativeCount++;
			}
		}

		return output;
	}

	/*
	 * place all negative numbers at the beginning, zeros and all positive numbers
	 * at the end
	 */

	int[] getRearrangedElements(int[] input) {
		int[] output = new int[input.length];
		int count = 0;
		int zeroCount = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] < 0) {
				output[count] = input[index];
				count++;
			} else if (input[index] == 0)
				zeroCount++;
		}
		int positiveCount = count + zeroCount;
		for (int index = 0; index < input.length; index++) {

			if (input[index] > 0) {
				output[positiveCount] = input[index];
				positiveCount++;
			}
		}

		return output;
	}

	// find the triple which in sequence and having maximum sum

	void getTripletWithMaxSum(int[] input) {
		int sum = 0;
		int maxIndex = 0;
		int tripletSum = 0;
		for (int index = 0; index < input.length-2; index++) {
			if ((input[index] == input[index + 1] - 1) && (input[index + 1] == input[index + 2] - 1)) {
				tripletSum = input[index] + input[index + 1] + input[index + 2];
				if (sum < tripletSum) {
					sum = tripletSum;
					maxIndex = index;
				}
			}
		}
		System.out.println("Output :  The triplets [" + input[maxIndex] + " " + input[maxIndex + 1] + " " + input[maxIndex + 2]
				+ "] have maximum sum = " + sum);
	}

	public static void main(String[] args) {
		Assignment33 assignment33 = new Assignment33();
		System.out.println("shift all non zeros at the end");
		int[] input1 = { 1, 0, 3, 4, 0, 2, 88, 0, 0, 22, 34 };
		System.out.println("Input : " + Arrays.toString(input1));
		System.out.println("Output : " + Arrays.toString(assignment33.shiftNonZeroElement(input1)));
		System.out.println("\n");
		System.out.println("Place all negative numbers at the beginning and all positive numbers at the end.");
		int[] input2 = { 1, -3, -2, 11, 44, 55, -76, 33, 12 };
		System.out.println("Input : " + Arrays.toString(input2));
		System.out.println("Output : " + Arrays.toString(assignment33.shiftNegativeAndPositiveElements(input2)));
		System.out.println("\n");
		System.out.println("place all negative numbers at the beginning, zeros and all positive numbers at the end");
		int[] input3 = { 1, -3, 0, -2, 11, 0, 44, 55, -76, 33, 0, 12 };
		System.out.println("Input : " + Arrays.toString(input3));
		System.out.println("Output : " + Arrays.toString(assignment33.getRearrangedElements(input3)));
		System.out.println("\n");
		System.out.println("find the triple which is in sequence and having maximum sum");
		int[] input4 = { 1, 3, 4, 5, 7, 3, 9, 10, 11, 12, 44, 67, 1, 2, 3, 99 };
		System.out.println("Input : " + Arrays.toString(input4));
		assignment33.getTripletWithMaxSum(input4);

	}
}
