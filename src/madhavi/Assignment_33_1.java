package madhavi;

import java.util.Arrays;

public class Assignment_33_1 {

	void getOutputArray(int[] inputarray) {
		int count = inputarray.length - 1;
		int[] output = new int[inputarray.length];
		for (int index = inputarray.length - 1; index >= 0; index--) {
			if (inputarray[index] != 0) {
				output[count] = inputarray[index];
				count--;
			}

		}
		System.out.println("Output: " + Arrays.toString(output));
	}

	public static void main(String[] args) {
		Assignment_33_1 assignment_33_1 = new Assignment_33_1();
		System.out.println(".....Shift all Non-Zero's at the end of the array. ....");
		int[] arr = { 1, 0, 3, 4, 0, 2, 88, 0, 0, 22, 34 };
		assignment_33_1.getOutputArray(arr);

	}
}
