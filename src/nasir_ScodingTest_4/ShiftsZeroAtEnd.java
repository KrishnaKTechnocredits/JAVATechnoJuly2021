package nasir_ScodingTest_4;

import java.util.Arrays;

public class ShiftsZeroAtEnd {

	void zeroAtEndArray(int[] input) {
		int count = 0;
		int[] output = new int[input.length];
		for (int index = 0; index < input.length; index++) {
			if (input[index] != 0) {
				output[count] = input[index];
				count++;

			}
		}
		System.out.println("Shift all zeros of input array " + Arrays.toString(input));
		System.out.println("Output is " + Arrays.toString(output));

	}

	public static void main(String[] args) {
		int[] input = { 1, 0, 0, 6, 0, 2, 3, 0, 4, 0, 5 };
		ShiftsZeroAtEnd shiftsZeroAtEnd = new ShiftsZeroAtEnd();
		shiftsZeroAtEnd.zeroAtEndArray(input);

	}

}
