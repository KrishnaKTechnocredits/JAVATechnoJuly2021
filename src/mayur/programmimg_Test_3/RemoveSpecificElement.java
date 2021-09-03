package mayur.programmimg_Test_3;

import java.util.Arrays;

public class RemoveSpecificElement {

	int[] removeSpecificElement(int[] input, int number) {
		int[] output = new int[input.length - 1];
		int outputIndex = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] != number)
				output[outputIndex++] = input[index];
		}
		return output;
	}

	public static void main(String[] args) {
		
		int input[] = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		System.out.println("After Removing an Element from Array is : "+Arrays.toString(new RemoveSpecificElement().removeSpecificElement(input, 14)));
	}
}