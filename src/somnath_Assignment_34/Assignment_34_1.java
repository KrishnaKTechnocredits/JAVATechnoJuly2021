package somnath_Assignment_34;

			/*
			program 1 : place 0 after the triple which in sequence.
						input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99}; // 11 + 3 = 14
						output = [1,3,4,5,0,7,3,9,10,11,0,14,44,67,1,2,3,0,99];

					*/

import java.util.Arrays;

public class Assignment_34_1 {
	void zeroAfterTripletsSequence(int[] input) {
		int count = 0;

		for (int index = 0; index < input.length - 3; index++) {
			if (input[index + 1] == input[index] + 1 && input[index + 2] == input[index + 1] + 1) {
				count++;

			}
		}
		int[] output = new int[input.length + count];
		int index = 0;

		for (int i = 0; i < input.length; i++) {
			if (i <= input.length - 3) {
				if (input[i] + 1 == input[i + 1] && input[i] + 2 == input[i + 2]) {
					output[index] = input[i];
					index++;
					output[index] = input[i + 1];
					index++;
					output[index] = input[i + 2];
					index++;
					output[index] = 0;
					index++;
					i = i + 2;
				} else {
					output[index] = input[i];
					index++;
				}
			} else {
				output[index] = input[i];
			}
		}

		System.out.println("Output:- " + Arrays.toString(output));
	}

	public static void main(String[] args) {
		Assignment_34_1 as = new Assignment_34_1();
		int[] arr = { 1, 3, 4, 5, 7, 3, 9, 10, 11, 14, 44, 67, 1, 2, 3, 99 };
		as.zeroAfterTripletsSequence(arr);

	}

} 
 
