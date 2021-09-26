package shantanu.assignment32;

import java.util.Arrays;

public class TripleMaxSum {
	int[] getTripletWithMaxSum(int[] input) {
		int[] triplet = new int[3];
		int maxSum = 0;
		for(int index = 0; index < input.length-2; index++) {
			if(input[index]+1 == input[index+1] && input[index]+2 == input[index+2]) {
				int sum = input[index]+input[index+1]+input[index+2];
				if(sum > maxSum) {
					maxSum = sum;
					triplet[0] = input[index];
					triplet[1] = input[index+1];
					triplet[2] = input[index+2];
				}
			}
		}
		return triplet;
	}
	void displayTripleWithMaxSum(int[] input) {
		int[] output = getTripletWithMaxSum(input);
		System.out.println("Triplet with maximum sum is:");
		System.out.println(Arrays.toString(output));
	}
	public static void main(String[] args) {
		TripleMaxSum tripleMaxSum = new TripleMaxSum();
		int[] input = {10,64,65,66,23,24,25,26,61,62};
		tripleMaxSum.displayTripleWithMaxSum(input);
	}
	
}
