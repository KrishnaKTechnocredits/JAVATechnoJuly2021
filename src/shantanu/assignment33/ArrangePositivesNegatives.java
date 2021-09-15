package shantanu.assignment33;

import java.util.Arrays;

public class ArrangePositivesNegatives {
	int[] getNewArray(int[] input) {
		int[] output = new int[input.length];
		int outputIndex = 0;
		int count = 0;
		for(int index = 0; index < input.length; index++) {
			if(input[index] < 0) {
				count++;
			}
		}
		for(int index = 0; index < input.length; index++) {
			if(input[index] < 0) {
				output[outputIndex] = input[index];
				outputIndex++;
			}
			else {
				output[count] = input[index];
				count++;
			}
		}
		return output;
	}
	void displayNewArray(int[] input) {
		System.out.println("Array after rearrangement:");
		int[] output = getNewArray(input);
		System.out.println(Arrays.toString(output));
	}
	public static void main(String[] args) {
		ArrangePositivesNegatives arrangePositivesNegatives = new ArrangePositivesNegatives();
		int[] input = {1,-3,-2,11,44,55,-76,33,12};
		arrangePositivesNegatives.displayNewArray(input);
	}
}
