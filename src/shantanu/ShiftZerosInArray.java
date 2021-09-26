package shantanu;

import java.util.Arrays;

public class ShiftZerosInArray {
	int[] getArrayWithShiftedZeros(int[] input) {
		int[] output = new int[input.length];
		int count = 0;
		for(int index = 0; index < input.length; index++) {
			if(input[index] == 0)
				count++;
			else
				output[index - count] = input[index];
		}
		return output;
	}
	void displayArrayWithShiftedZeros(int[] input) {
		System.out.println("Array with shifted zeros:");
		int[] output = getArrayWithShiftedZeros(input);
		System.out.println(Arrays.toString(output));
	}
	public static void main(String[] args) {
		ShiftZerosInArray shiftZerosInArray = new ShiftZerosInArray();
		int[] input = {1,0,0,6,0,2,3,0,4,0,5};
		shiftZerosInArray.displayArrayWithShiftedZeros(input);
	}
}
