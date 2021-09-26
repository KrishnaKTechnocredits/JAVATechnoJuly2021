package dattaraj;

import java.util.Arrays;

public class Assignment33_P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
		Assignment33_P3 p3 = new Assignment33_P3();
		p3.rearrange(arr);
		
	}

	void rearrange(int[] input) {
		//TODO Auto-generated method stub
		int[] output = new int[input.length];
		int negativeCount = 0, zeroCount = 0, positiveCount = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] < 0) {
				output[negativeCount] = input[index];
				negativeCount++;
			} else if (input[index] == 0)
				zeroCount++;
		}
		positiveCount = negativeCount + zeroCount;
		for (int index = 0; index < input.length; index++) {
			if (input[index] > 0) {
				output[positiveCount] = input[index];
				positiveCount++;
			}
		}
		System.out.println("Array after rearrangement is : " + Arrays.toString(output));
	}
}
