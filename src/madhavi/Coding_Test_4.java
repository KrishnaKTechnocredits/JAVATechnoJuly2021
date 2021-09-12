package madhavi;

import java.util.Arrays;

public class Coding_Test_4 {
	int count = 0;

	void getOutputArray(int[] inputarray) {
		int[] output = new int[inputarray.length];
		for (int index = 0; index < inputarray.length; index++) {
			if (inputarray[index] != 0) {
				output[count] = inputarray[index];
				count++;
			}
		}
		System.out.println("Output: " + Arrays.toString(output));
	}

	public static void main(String[] args) {
		Coding_Test_4 coding_Test_4 = new Coding_Test_4();
		System.out.println(".....Shift all Zero's at the end of the array. ....");
		int[] arr = { 1, 0, 0, 6, 0, 2, 3, 0, 4, 0, 5 };
		coding_Test_4.getOutputArray(arr);
	}
}