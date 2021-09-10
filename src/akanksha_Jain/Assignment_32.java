package akanksha_Jain;

import java.util.Arrays;

public class Assignment_32 {
	
	void findMaxNumberInTripleSeq(int[] arr) {
		int sum=0, maxSum=0, index2=0;
		for(int index=0; index<arr.length-2; index++) {
			if(arr[index+1]==arr[index]+1 && arr[index+2]==arr[index+1]+1) {
				sum = sum + arr[index] + arr[index+1] + arr[index+2];
			}
			if(sum > maxSum) {
				maxSum = sum;
				index2 = index;
			}
		}
		int[] output = new int[3];
		int count = 0;
		for(int index=index2; index<index2 + 3; index++) {
			output[count] = arr[index];
			count ++;
		}
		System.out.println(Arrays.toString(output) + " is a triple sequence having maximum sum");
	}
	
	public static void main(String[] args) {
		int[] arr = {10,23,24,25,26,61,62,64,65,66};
		Assignment_32 assignment_32 = new Assignment_32();
		assignment_32.findMaxNumberInTripleSeq(arr);
	}		
}
