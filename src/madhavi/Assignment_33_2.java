package madhavi;

import java.util.Arrays;

public class Assignment_33_2 {
	void getOutputArray(int[] inputarray) {
		int[] output = new int[inputarray.length];
		int outputIndex = 0;
		for (int index = 0; index < inputarray.length; index++) {
			if (inputarray[index] < 0) {
				output[outputIndex] = inputarray[index];
				outputIndex++;
			}
		}
		for (int index = 0; index < inputarray.length; index++) {
			if (inputarray[index] > 0) {
				output[outputIndex] = inputarray[index];
				outputIndex++;
			}
		}
		System.out.println("Output: " + Arrays.toString(output));
	}

	public static void main(String[] args) {
		Assignment_33_2 assignment_33_2 = new Assignment_33_2();
		System.out.println(".....place all negative numbers at the beginning and all positive numbers at the end. ....");
		int[] arr = { 1, -3, -2, 11, 44, 55, -76, 33, 12 };
		assignment_33_2.getOutputArray(arr);

	}

}
