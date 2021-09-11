package margi.Assignment_33;

import java.util.Arrays;

public class Assignment_33_3 {

	//place all negative numbers at the beginning, zeros and all positive numbers at the end
	int[] arrangeArray(int[] input) {
		int[] output = new int[input.length];
		int outputIndex=0;
		int countZero=0;
		for(int index=0; index<input.length; index++) {
			if(input[index]<0) {
				output[outputIndex]=input[index];
				outputIndex++;
			}
			else if(input[index]==0)
				countZero++;
		}
		outputIndex = outputIndex + countZero;
		for(int index=0; index<input.length; index++) {
			if(input[index]>0) {
				output[outputIndex] = input[index];
				outputIndex++;
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		Assignment_33_3 assignment_33_3 = new Assignment_33_3();
		int[] input = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
		System.out.println(Arrays.toString(assignment_33_3.arrangeArray(input)));
	}
}
