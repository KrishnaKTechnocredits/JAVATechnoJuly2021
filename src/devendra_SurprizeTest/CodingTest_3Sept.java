package devendra_SurprizeTest;

import java.util.Arrays;

public class CodingTest_3Sept {
	
	void removeSpecificElement(int input[], int element) {
		int output[] = new int[input.length - 1];
		int outputIndex = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] != element) {
				output[outputIndex] = input[index];
				outputIndex++;
			}
		}
		System.out.println(" After Removing Element,\n Output Array = " + Arrays.toString(output));
	}

	public static void main(String[] args) {
		int input[] = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		System.out.println(" Input Array = " + Arrays.toString(input));
		CodingTest_3Sept codingTest3 = new CodingTest_3Sept();
		codingTest3.removeSpecificElement(input, 14);
	}
}
