package kalpesh;

public class MaxNumberInArray {

	static int max = 0;

	int findMaxNumber(int[] input) {
		for (int index = 0; index < input.length; index++) {
			if (input[index] > max)
				max = input[index];
		}
		return max;
	}

	public static void main(String[] args) {
		MaxNumberInArray maxnumberinarray = new MaxNumberInArray();
		int[] input = { 1, 11, 44, 23, 55, 99, 23, };
		System.out.println("Maximum Number From The Given Array Is " + maxnumberinarray.findMaxNumber(input));

	}

}

/*
 * Assignment 14 : 15th Aug'2021
 * 
 * 
 * program 1 : find maximum number from given array.
 * 
 * int[] input = {1,11,44,23,55,99,23}; output : 99
 * 
 * program 2 : find minimum number from given array. int[] input =
 * {1,11,44,23,55,99,23}; output : 11
 * 
 * 
 * program 3 : print difference between max and min number from given array.
 * int[] input = {1,11,44,23,55,99,23}; output : 98
 * 
 * 
 * program 4 : print difference between max odd number and max even number from
 * given array. difference should be positive
 * 
 * int[] input = {1,11,44,23,55,99,23,22}; hint : 99 - 44 output : 55
 */
