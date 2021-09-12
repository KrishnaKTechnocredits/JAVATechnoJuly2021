package monali.Assignment_33;
/*Program 1 : shift all non zeros at the end.
input : {1,0,3,4,0,2,88,0,0,22,34};
output : [0,0,0,0,1,3,4,2,88,22,34]

Program 2: place all negative numbers at the beginning and all positive numbers at the end.
input = {1,-3,-2,11,44,55,-76,33,12};
output : [-3,-2,-76,1,11,44,55,33,12]

program 3: place all negative numbers at the beginning, zeros and all positive numbers at the end.
input = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
output : [-3,-2,-76,0,0,0,1,11,44,55,33,12]*/

import java.util.Arrays;

class ArrayShift {

	int[] startZeroShift(int[] input) {

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
		return output;
	}

	int[] shiftNegativeNumber(int input[]) {

		int output[] = new int[input.length];
		int count = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] < 0) {
				output[count] = input[index];
				count++;
			}
		}

		for (int index = 3; index < input.length; index++) {
			if (input[index] > 0)
				output[count] = input[index];
			count++;
		}

		return output;
	}

	int[] shiftnegativeZeroPositiveNum(int[] input) {

		int output[] = new int[input.length];
		int zeroCount = 0;
		int count = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] < 0) {
				output[count] = input[index];
				count++;
			}
			if (input[index] == 0)
				zeroCount++;
		}
		int outputIndex = count + zeroCount;
		for (int index = 0; index < input.length; index++) {
			if (input[index] > 0) {
				output[outputIndex] = input[index];
				outputIndex++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		ArrayShift zs = new ArrayShift();
		int[] input = { 1, 0, 3, 4, 0, 2, 88, 0, 0, 22, 34 };
		int[] input2 = { 1, -3, -2, 11, 44, 55, -76, 33, 12 };
		int[] input3 = { 1, -3, 0, -2, 11, 0, 44, 55, -76, 33, 0, 12 };

		System.out.println(Arrays.toString(zs.startZeroShift(input)));
		System.out.println(Arrays.toString(zs.shiftNegativeNumber(input2)));
		System.out.println(Arrays.toString(zs.shiftnegativeZeroPositiveNum(input3)));
	}

}
