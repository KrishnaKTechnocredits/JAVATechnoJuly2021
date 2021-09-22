package amol_Pawar.assignment_33;

import java.util.Arrays;

public class Program_3 {

	void getNegativeAtBeginZeroAndPositiveAtEnd(int[] input) {
		int zeroCount = 0;
		int negativeCount = 0;
		int sum = 0;
		int arr[] = new int[input.length];
		for (int index = 0; index < input.length; index++) {
			if (input[index] < 0) {
				arr[negativeCount] = input[index];
				negativeCount++;
			} else if (input[index] == 0) {
				zeroCount++;
			}
			sum = negativeCount + zeroCount;
		}
		for (int index = 0; index < input.length; index++) {
			if (input[index] > 0) {
				arr[sum] = input[index];
				sum++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		Program_3 program_3 = new Program_3();
		int[] input = { 1, -3, 0, -2, 11, 0, 44, 55, -76, 33, 0, 12 };
		program_3.getNegativeAtBeginZeroAndPositiveAtEnd(input);

	}

}
/*
 * program 3: place all negative numbers at the beginning, zeros and all
 * positive numbers at the end. input = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
 * output : [-3,-2,-76,0,0,0,1,11,44,55,33,12]
 */
