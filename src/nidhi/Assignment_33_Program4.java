package nidhi;

import java.util.Arrays;

/**
Assignment - 33 : 11th Sep'2021
*program 4 : find the triple which in sequence and having maximum sum*

input = {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
iteration : 3,4,5
         9,10,11
		 10,11,12
         1,2,3
output : 10,11,12
**/

class Assignment_33_Program4{
	
	String tripletMaxSum(int[] input){
		int[] output = new int[3];
		int sum = 0;
		int maxsum = 0;
		for (int i=0;i<input.length-2;i++){
			if (input[i+1] == input[i]+1){
				if (input[i+2] == input[i]+2)
					sum=input[i+2]+ input[i+1]+input[i];
		}
		if (sum>maxsum){
			maxsum=sum;
			output[0] = input[i];
			output[1] = input[i+1];
			output[2] = input[i+2];
			}
		}
		return Arrays.toString(output);
	}
	
	public static void main(String[] ar){
		Assignment_33_Program4 assignment33 = new Assignment_33_Program4();
		int[] input = {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
		System.out.println(assignment33.tripletMaxSum(input));
	}

}
