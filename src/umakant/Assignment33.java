/*
 Assignment - 33 : 11th Sep'2021

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
output : 10,11,12
 */
package umakant;

import java.util.Arrays;

public class Assignment33 {

	int[] shiftAllNonZeroesAtEnd(int[] input) {
		int[] output = new int[input.length];
		int outputIndex = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] != 0)
				output[outputIndex++] = input[index];
		}
		return output;
	}

	int[] shiftAllNonZeroesAtStart(int[] input) {
		int[] output = new int[input.length];
		int zeroesCount = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] == 0)
				zeroesCount++;
		}
		for (int index = 0; index < input.length; index++) {
			if (input[index] != 0)
				output[zeroesCount++] = input[index];
		}
		return output;
	}

	int[] shiftNegativeAndPositiveNumbers(int[] input) {
		int[] output = new int[input.length];
		int negativeCount = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] < 0)
				negativeCount++;
		}
		int innerCount = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] > 0)
				output[negativeCount++] = input[index];
			else
				output[innerCount++] = input[index];
		}
		return output;
	}

	int[] shiftNegativeZeroesAndPositiveNumbers(int[] input) {
		int[] output = new int[input.length];
		int zeroesCount = 0;
		int negativeCount = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] == 0)
				zeroesCount++;
			else if (input[index] < 0)
				negativeCount++;
		}
		int zeroesStartCount = negativeCount;
		int negativeStartCount = 0;
		int positiveStartCount = negativeCount + zeroesCount;
		for (int index = 0; index < input.length; index++) {
			if (input[index] < 0)
				output[negativeStartCount++] = input[index];
			else if (input[index] == 0)
				output[zeroesStartCount++] = input[index];
			else
				output[positiveStartCount++] = input[index];
		}
		return output;
	}

	void tripletHavingMaximumSum(int[] input) {
		int tripletSum = 0;
		int tripletIndex = 0;
		boolean hasTriplet = false;
		for (int index = 0; index < input.length - 2; index++) {
			if (input[index + 1] == input[index] + 1 && input[index + 2] == input[index] + 2) {
				hasTriplet = true;
				int newTripletSum = 3 * (input[index] + 1);
				if (newTripletSum > tripletSum) {
					tripletSum = newTripletSum;
					tripletIndex = index;
				}
			}
		}
		if (hasTriplet)
			System.out.println(Arrays.toString(input) + ":Triplet having maximum sum is :" + input[tripletIndex] + ","
					+ input[tripletIndex + 1] + "," + input[tripletIndex + 2]);
		else
			System.out.println(Arrays.toString(input) + ":Array does not contain any triplet.");

	}

	public static void main(String[] args) {
		int[] input1 = { 1, 0, 3, 4, 0, 2, 88, 0, 0, 22, 34 };
		Assignment33 assignment = new Assignment33();
		System.out.println(Arrays.toString(assignment.shiftAllNonZeroesAtEnd(input1)));
		System.out.println(Arrays.toString(assignment.shiftAllNonZeroesAtStart(input1)));
		int[] input2 = { 1, -3, -2, 11, 44, 55, -76, 33, 12 };
		System.out.println(Arrays.toString(assignment.shiftNegativeAndPositiveNumbers(input2)));
		int[] input3 = { 1, -3, 0, -2, 11, 0, 44, 55, -76, 33, 0, 12 };
		System.out.println(Arrays.toString(assignment.shiftNegativeZeroesAndPositiveNumbers(input3)));
		int[] input4 = { 1, 3, 4, 5, 7, 3, 9, 10, 11, 12, 44, 67, 1, 2, 3, 99 };
		assignment.tripletHavingMaximumSum(input4);
		int[] input5 = { 1, 3, 5, 7, 3, 9, 11, 12, 44, 67, 1, 3, 99 };
		assignment.tripletHavingMaximumSum(input5);
	}

}
