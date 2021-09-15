package suruchi.ScodingTest_3;

import java.util.Arrays;

public class ElementRemoval_CT3 {

	int[] getElementRemovedFromArray(int[] input, int numRemoval) {
		int index2 = 0;
		int[] output = new int[input.length - 1];
		for (int index = 0; index < input.length; index++) {
			if (input[index] != numRemoval) {
				output[index2] = input[index];
				index2++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		ElementRemoval_CT3 elementRemoval_CT3 = new ElementRemoval_CT3();

		int input[] = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };

		System.out.println("Output: " + Arrays.toString(elementRemoval_CT3.getElementRemovedFromArray(input, 14)));
	}
}