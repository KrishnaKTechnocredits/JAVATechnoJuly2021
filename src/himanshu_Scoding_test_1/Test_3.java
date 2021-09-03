package himanshu_Scoding_test_1;

import java.util.Arrays;

public class Test_3 {

	int element = 14;

	void removeSpecificElement(int[] input) {

		int[] output = new int[input.length];

		for (int index = 0; index < input.length; index++) {
			if (input[index] != element) {
				output[index] = input[index];
				System.out.print(output[index] + " ");
			}

		}
	}

	public static void main(String[] args) {

		int[] input = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };

		Test_3 test_3 = new Test_3();
		test_3.removeSpecificElement(input);
	}

}
