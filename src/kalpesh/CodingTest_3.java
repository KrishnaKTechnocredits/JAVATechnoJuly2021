package kalpesh;

import java.util.Arrays;

public class CodingTest_3 {
	void removeElementFromArray(int[] input, int num) {
		int[] output = new int[input.length - 1];
		int outputIndex = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] != num)
				output[outputIndex++] = input[index];
		}
		System.out.println("Output:- " + Arrays.toString(output));
	}

	public static void main(String[] args) {
		int input[] = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		int num = 14;
		CodingTest_3 test = new CodingTest_3();
		test.removeElementFromArray(input, num);
	}
}

/*
 * Programming Test - 3 WAP to remove a specific element from an array int
 * input[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49}; 
 * specific number: 14
 * output[] = {25, 56, 15, 36, 56, 77, 18, 29, 49}
 */