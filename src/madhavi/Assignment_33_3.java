package madhavi;

import java.util.Arrays;

public class Assignment_33_3 {
	void getOutputArray(int[] inputarray) {
		int[] output = new int[inputarray.length];
		int zerocount = 0;
		int outputIndex = 0;
		for (int index = 0; index < inputarray.length; index++) {
			if (inputarray[index] < 0) {
				output[outputIndex] = inputarray[index];
				outputIndex++;
			} else if (inputarray[index] == 0) {
				zerocount++;
			}
		}

		outputIndex = outputIndex + zerocount;
		for (int index = 0; index < inputarray.length; index++) {
			if (inputarray[index] > 0) {
				output[outputIndex] = inputarray[index];
				outputIndex++;
			}
		}
		System.out.println("Output: " + Arrays.toString(output));
	}

	public static void main(String[] args) {
		Assignment_33_3 assignment_33_3 = new Assignment_33_3();
		System.out.println(".....place all negative numbers at the beginning, zeros and all positive numbers at the end ....");
		int[] arr = { 1, -3, 0, -2, 11, 0, 44, 55, -76, 33, 0, 12 };
		assignment_33_3.getOutputArray(arr);

	}
}