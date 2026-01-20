package mayur.Assignment34;

import java.util.Arrays;

public class Program_1 {

	void getZeroAfterTriple(int[] input) {

		int count = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] < input.length - 2) {
				if (input[index] == input[index + 1] - 1 && input[index] == input[index + 2] - 2) {
					count++;
				}
			}
		}
		int arr[] = new int[input.length + count];
		int outputIndex = 0;
		for (int index = 0; index < input.length; index++) {
			if (index < input.length - 2) {
				if (input[index] == input[index + 1] - 1 && input[index] == input[index + 2] - 2) {
					/*
					 * arr[outputIndex] = input[index]; 
					 * outputIndex++; 
					 * arr[outputIndex] =
					 * input[index + 1]; 
					 * outputIndex++; 
					 * arr[outputIndex] = input[index + 2];
					 * outputIndex++; 
					 * arr[outputIndex] = 0; 
					 * outputIndex++; 
					 * index = index + 2;
					 */
					arr[outputIndex] = input[index];
					arr[outputIndex + 1] = input[index + 1];
					arr[outputIndex + 2] = input[index + 2];
					arr[outputIndex + 3] = 0;
					outputIndex = outputIndex + 4;
					index = index + 2;

				} else {
					arr[outputIndex] = input[index];
					outputIndex++;
				}
			} else {
				arr[outputIndex] = input[index];
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		Program_1 program_1 = new Program_1();
		int[] input = { 1, 3, 4, 5, 7, 3, 9, 10, 11, 14, 44, 67, 1, 2, 3, 99 };
		program_1.getZeroAfterTriple(input);
	}

}
/*
 * program 1 : place 0 after the triple which in sequence.
 * 
 * input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99}; // 11 + 3 = 14 output =
 * [1,3,4,5,0,7,3,9,10,11,0,14,44,67,1,2,3,0,99];
 */
