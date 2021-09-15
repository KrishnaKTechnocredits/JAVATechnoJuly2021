package varun.varun_array_assignment;

import java.util.Arrays;

public class Coding_Test_3 {
	int[] removeSpecificElement(int[] input,int num) {
		int []output = new int[input.length-1];
		int outputIndex=0;
		for(int index = 0;index<input.length;index++) {
			if (input[index] != num)
				output[outputIndex++] = input[index];
		}
		return output;
	}
	
	public static void main(String[] args) {
		int input[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		System.out.println(Arrays.toString(new Coding_Test_3().removeSpecificElement(input, 14)));
	}
}
