package shantanu.assignment33;

import java.util.Arrays;

public class ShiftNonZeroAtEnd {
	int[] getNewArray(int[] input) {
		int[] output = new int[input.length];
		int outputIndex = input.length-1;
		for(int index = input.length - 1; index >= 0; index--) {
			
			if(input[index] != 0) {
				output[outputIndex] = input[index];
				outputIndex--;
			}
		}
		return output;
	}
	void displayNewArray(int[] input) {
		System.out.println("Array after shifting non-zero elements at end:");
		int[] output = getNewArray(input);
		System.out.println(Arrays.toString(output));
	}
	public static void main(String[] args) {
		ShiftNonZeroAtEnd shiftNonZeroAtEnd = new ShiftNonZeroAtEnd();
		int[] input = {1,0,3,4,0,2,88,0,0,22,34};
		shiftNonZeroAtEnd.displayNewArray(input);
	}
}
