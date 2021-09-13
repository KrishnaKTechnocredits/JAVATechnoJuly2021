package suchita;

//Assignment 32

//Find triplets in sequence and having maximum sum.

import java.util.Arrays;

class Assignment32 {

	void findTripletSum(int[] input) {
		
		int sum = 0;
		int count = 0;
		int maxSum=0;
		int num = 0; 
		int i = 0;
		int[] output = new int[3];
		
		System.out.println("\nInput array :: " + Arrays.toString(input));
		System.out.println("\nInput array :: " + Arrays.toString(input));
		for (int index = 0; index < input.length - 2; index++) {
			if (input[index] == input[index + 1] - 1 && input[index] == input[index + 2] - 2) {
				sum = input[index] + input[index + 1] + input[index + 2];
				if (sum > maxSum) {
					maxSum = sum;
					i = index;
				}
			}
		}
		
		
		for (int index = i; index < i + 3; index++) {
			output[count] = input[index];
			count++;
		}
		System.out.println(Arrays.toString(output) + " triplet have maximum sum of :: "+maxSum);
	}
	
	public static void main(String[] args) {
		
		Assignment32 assignment = new Assignment32();
		int[] input = {10,64,65,66,23,24,25,26,61,62};
		assignment.findTripletSum(input);
	}

}