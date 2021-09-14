package nidhi;

import java.util.Arrays;

/**
Assignment - 33 : 11th Sep'2021

*program 3: place all negative numbers at the beginning, zeros and all positive numbers at the end.*
input = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
output : [-3,-2,-76,0,0,0,1,11,44,55,33,12]
**/

class Assignment_33_Program3{
	
	String shiftNegPos(int[] input){
		int[] output = new int[input.length];
		int fcnt = input.length-1;
		int ecnt = 0;
		for (int i=input.length-1;i>=0;i--){
			if (input[i] > 0)
				output[fcnt--] = input[i];
		}
		for (int i=0;i<input.length-1;i++){
			if (input[i] < 0)
				output[ecnt++] = input[i];
		}
		return Arrays.toString(output);
	}
	
	public static void main(String[] ar){
		Assignment_33_Program3 assignment33 = new Assignment_33_Program3();
		int[] input = {1,-3,0,-2,11,0,44,55,-76,33,0,12};;
		System.out.println(assignment33.shiftNegPos(input));
	}


}
