package aniket;

import java.util.Arrays;

public class Assignment_33_2 {
int [] getArrayNumbers(int[] arr) {
		
		int count= 0 ;
		int [] output = new int[arr.length];
		
		for(int index=0;index<arr.length;index++) {
			if( arr[index]<0) {
				output[count] +=arr[index];
				count++;
			}
			
		}
		
		for(int index=0;index<arr.length;index++) {
			if(arr[index]>0) {
				output[count] += arr[index];
				count++;
			}
			
		}
		
		return output;
		
		
	}
	
	public static void main(String[] args) {
		
		int [] input = {1,-3,-2,11,44,55,-76,33,12};
		System.out.println(Arrays.toString(new Assignment_33_2().getArrayNumbers(input) ));
		
	}
}
