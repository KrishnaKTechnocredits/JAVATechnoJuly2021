package aniket;

import java.util.Arrays;

public class Assignment_33_1 {
	
	int[] getZeroAtlast(int[] arr) {
		int count=0;
		int[] output= new int[arr.length];
		for(int index=0;index<arr.length;index++) {
			if(arr[index]!=0) {				
				output[count]+=arr[index];
				count++;
			}
			
		}
		return output;
		
		
	}
	
	public static void main(String[] args) {
		
		int[] inut= {1,0,3,4,0,2,88,0,0,22,34};
	System.out.println("The output array is : " + Arrays.toString(new Assignment_33_1().getZeroAtlast(inut)));	
		
	}
		
	
	
}
