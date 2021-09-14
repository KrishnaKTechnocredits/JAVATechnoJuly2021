package madhavi;

import java.util.Arrays;

public class Assignment_31_2 {
	void getTripletsSequenceCount(int[] input) {
		int count = 0;
		for (int index = 0; index < input.length - 2; index++) {
			if (input[index + 1] == input[index] + 1 && input[index + 2] == input[index + 1] + 1) {
				count++;
				System.out.println("triplets are - " + input[index] + " " + input[index + 1] + " " + input[index + 2]);
			}
		}
		System.out.println("The count of triplets sequence in a given array " + Arrays.toString(input) + " are " + count);
	}

	public static void main(String[] args) {
		Assignment_31_2 assignment_31_2 = new Assignment_31_2();
		int[] arr = { 10, 23, 24, 25, 26, 61, 62, 64, 65, 66 };
		assignment_31_2.getTripletsSequenceCount(arr);

	}
}