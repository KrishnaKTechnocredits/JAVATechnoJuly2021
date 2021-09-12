package margi.Assignment_34;

import java.util.Arrays;

public class Assignment_34_2 {

	//place sum of triple after each triple which in sequence
	int newArrayLength(int[] input) {
		int num;
		int countTriplet=0;
		for(int index=0; index<input.length-2; index++) {
			num=input[index];
			if((num+1)==input[index+1]) {
				if((num+2)==input[index+2]) {
					countTriplet++;
				}
			}
		}
		return countTriplet;
	}
	int[] arrangeArray(int[] input) {
		int len = newArrayLength(input) + input.length;
		int[] output = new int[len];
		int outputIndex=0;
		for(int index=0; index<input.length; index++) {
			if(index<input.length-2) {
				if(input[index]+1==input[index+1] && input[index]+2==input[index+2]) {
					output[outputIndex] = input[index];
					outputIndex++;
					output[outputIndex] = input[index+1];
					outputIndex++;
					output[outputIndex] = input[index+2];
					outputIndex++;
					output[outputIndex] = input[index] + input[index+1] + input[index+2];
					outputIndex++;
					index = index+2;
				}
				else {
					output[outputIndex] = input[index];
					outputIndex++;
				}
			}
			else
				output[outputIndex]=input[index];
		}
		return output;
	}
	
	public static void main(String[] args) {
		Assignment_34_2 assignment_34_2 = new Assignment_34_2();
		int[] arr = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
		System.out.println(Arrays.toString(assignment_34_2.arrangeArray(arr)));
	}
}
