/*Assignment - 33 : 11th Sep'2021
Program 1 : shift all non zeros at the end.
input : {1,0,3,4,0,2,88,0,0,22,34};
output : [0,0,0,0,1,3,4,2,88,22,34]
Program 2: place all negative numbers at the beginning and all positive numbers at the end.
input = {1,-3,-2,11,44,55,-76,33,12};
output : [-3,-2,-76,1,11,44,55,33,12]
program 3: place all negative numbers at the beginning, zeros and all positive numbers at the end.
input = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
output : [-3,-2,-76,0,0,0,1,11,44,55,33,12]
program 4 : find the triple which in sequence and having maximum sum
input = {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
iteration : 3,4,5
         9,10,11
		 10,11,12
         1,2,3
output : 10,11,12*/
package monika;

import java.util.Arrays;

public class Assignment_33 {
	void getShiftZerostoFirst(int[] input) {
		int zeroCount = 0;
		int[] output = new int[input.length];
		for (int index = 0; index < input.length; index++) {
			if (input[index] == 0)
				zeroCount++;
		}
		int outputIndex = zeroCount;
		for (int index = 0; index < input.length; index++) {
			if (input[index] != 0) {
				output[outputIndex] = input[index];
				outputIndex++;
			}
		}
		System.out.println("Place all non zeros at the start: " + Arrays.toString(output));
	}

	void getShiftNegativeNumberThanPositiv(int[] input) {
		int[] output = new int[input.length];
		int negativeCount = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] < 0) {
				output[negativeCount] = input[index];
				negativeCount++;
			}
		}
		int count = negativeCount;
		for (int index = 0; index < input.length; index++) {
			if (input[index] >= 0) {
				output[count] = input[index];
				count++;
			}
		}
		System.out.println("Place -ve at start & +ve at end: " + Arrays.toString(output));
	}

	void getNegativeZeroPositiveShift(int[] input) {
		int[] output = new int[input.length];
		int negativeCount = 0, zeroCount = 0, positiveCount = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] < 0) {
				output[negativeCount] = input[index];
				negativeCount++;
			} else if (input[index] == 0)
				zeroCount++;
		}
		positiveCount = negativeCount + zeroCount;
		for (int index = 0; index < input.length; index++) {
			if (input[index] > 0) {
				output[positiveCount] = input[index];
				positiveCount++;
			}
		}
		System.out.println("Place -ve at start, 0's & +ve at end: " + Arrays.toString(output));
	}

	void getMaximumTripletFromArray(int[] input) {
		int sum = 0, maxSum = 0;
		int startIndex = 0;
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
		System.out.println(Arrays.toString(output) + " is a triple having maximum Sum");
	}

	public static void main(String[] args) {
		int[] input = { 1, 0, 3, 4, 0, 2, 88, 0, 0, 22, 34 };
		Assignment_33 assignment_33 = new Assignment_33();
		assignment_33.getShiftZerostoFirst(input);
		int[] input1 = { 1, -3, -2, 11, 44, 55, -76, 33, 12 };
		assignment_33.getShiftNegativeNumberThanPositiv(input1);
		int[] input2 = { 1, -3, 0, -2, 11, 0, 44, 55, -76, 33, 0, 12 };
		assignment_33.getNegativeZeroPositiveShift(input2);
		int[] input3 = { 1, 3, 4, 5, 7, 3, 9, 10, 11, 12, 44, 67, 1, 2, 3, 99 };
		assignment_33.getMaximumTripletFromArray(input3);
	}
}
