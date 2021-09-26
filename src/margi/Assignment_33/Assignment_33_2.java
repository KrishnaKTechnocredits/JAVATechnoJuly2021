package margi.Assignment_33;

import java.util.Arrays;

public class Assignment_33_2 {

	//place all negative numbers at the beginning and all positive numbers at the end
	int[] arrangeArray(int[] input) {
		int[] output = new int[input.length];
		int outputIndex=0;
		for(int index=0; index<input.length; index++) {
			if(input[index]<0) {
				output[outputIndex]=input[index];
				outputIndex++;
			}
		}
		for(int index=0; index<input.length; index++) {
			if(input[index]>0) {
				output[outputIndex] = input[index];
				outputIndex++;
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		Assignment_33_2 assignment_33_2 = new Assignment_33_2();
		int[] input = {1,-3,-2,11,44,55,-76,33,12};
		System.out.println(Arrays.toString(assignment_33_2.arrangeArray(input)));
	}
}
