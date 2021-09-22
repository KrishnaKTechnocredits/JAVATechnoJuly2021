package shantanu.assignment33;

import java.util.Arrays;

public class NegativeZeroPositive {
	int[] getNewArray(int[] input) {
		int[] output = new int[input.length];
		int count = 0;
		int outputIndex = 0;
		for(int index = 0; index < input.length; index++) {
			if(input[index] < 0 || input[index] == 0)
				count++;
		}
		for(int index = 0; index < input.length; index++) {
			if(input[index] < 0) {
				output[outputIndex] = input[index];
				outputIndex++;
			}
			else if(input[index] > 0) {
				output[count] = input[index];
				count++;
			}
		}
		return output;
	}
	void displayNewArray(int[] input) {
		System.out.println("New Array:");
		int[] output = getNewArray(input);
		System.out.println(Arrays.toString(output));
	}
	public static void main(String[] args) {
		NegativeZeroPositive negativeZeroPositive = new NegativeZeroPositive();
		int[] input = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
		negativeZeroPositive.displayNewArray(input);
	}
}
