package chirag.assignment32;

import java.util.Arrays;

/*Assignment - 32 : 10th Sep'2021
Program 1: find the triple which in sequence and having maximum sum.
int[] arr = {10,64,65,66,23,24,25,26,61,62};
output : 64,65,66 is a triple having maximum sum
Note : 23,24,25
       24,25,26
	   64,65,66 -> having max sum*/

public class MaximumSumForTriplet {
	
	void getMaxSumForTriplet(int [] input) {
		int startIndex = 0;
		int sum = 0;
		int maximumSum = 0;
		for(int index = 0;index < input.length-2;index++) {
			if(input[index] == input[index +1]-1 && input[index] == input[index+2]-2) {
				
				sum = input[index] + input[index+1] + input[index+2];
				if(sum > maximumSum) {
					maximumSum = sum;
					startIndex = index;
				}
			}
		}
		int [] output = new int[3];
		int outputIndex = 0;
		for(int index = startIndex;index < startIndex + 3;index++) {
			output[outputIndex] = input[index];
			outputIndex++;
		}
		System.out.println(Arrays.toString(output)+" is a triplet having maximum sum.");
	}
	public static void main(String[] args) {
		MaximumSumForTriplet maximumSumForTriplet = new MaximumSumForTriplet();
		int[] arr = {10,64,65,66,23,24,25,26,61,62};
		maximumSumForTriplet.getMaxSumForTriplet(arr);
	}
}