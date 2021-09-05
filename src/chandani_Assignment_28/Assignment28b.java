package chandani_Assignment_28;

import java.util.Arrays;

public class Assignment28b{

int getMaximumNumber(int[] input){
		
	int maxindexnumber = 0;
	int maxnumber = 0;
		
	for (int index = 0; index < input.length; index++){
		if(input[index] > maxnumber){
			maxnumber = input[index];
			maxindexnumber = index;
			}
	}
		input[maxindexnumber]=0;
		return maxnumber;
}

	int getNthMaximumNumber(int[] input, int n){
	
		int nthhighestnumber = 0;

		for(int index=0; index < n; index++) {
			nthhighestnumber = getMaximumNumber(input);	
		}
	return nthhighestnumber;
	}
	
	public static void main(String[] args){
		Assignment28b assignment28b = new Assignment28b();
		int[] arr = {10,23,2,11,55,43,99};
		int n = 3;
		System.out.println("Nth highest number of " +Arrays.toString(arr) + " is : " + assignment28b.getNthMaximumNumber(arr, n));		
	}
}