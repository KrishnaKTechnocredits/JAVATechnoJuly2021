package margi.Assignment_33;

import java.util.Arrays;

public class Assignment_33_1 {

	//shift all non zeros at the end
	int[] placeZeros(int[] input) {
		int[] output = new int[input.length];
		int count=0;
		for(int index=0; index<input.length; index++) {
			if(input[index]==0)
				count++;
		}
		int outputIndex = count;
		for(int index=0; index<input.length; index++) {
			if(input[index]!=0) {
				output[outputIndex] = input[index];
				outputIndex++;
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		Assignment_33_1 assignment_33_1 = new Assignment_33_1();
		int[] input = {1,0,3,4,0,2,88,0,0,22,34};
		System.out.println(Arrays.toString(assignment_33_1.placeZeros(input)));
	}
}
