package nidhi;

import java.util.Arrays;

/**
Assignment - 33 : 11th Sep'2021

*Program 1 : shift all non zeros at the end.*
input : {1,0,3,4,0,2,88,0,0,22,34};
output : [0,0,0,0,1,3,4,2,88,22,34]
**/

class Assignment_33_Program1{
	
	String shiftNonZeros(int[] input){
		int[] output = new int[input.length];
		int cnt = input.length-1 ;
		for (int i=input.length-1;i>=0;i--){
			if (input[i] !=0)
				output[cnt--] = input[i];
				
		}
		return Arrays.toString(output);
	}
	
	public static void main(String[] ar){
		Assignment_33_Program1 assignment33 = new Assignment_33_Program1();
		int[] input = {1,0,3,4,0,2,88,0,0,22,34};
		System.out.println(assignment33.shiftNonZeros(input));
	}

}
