package suchita;

import java.util.Arrays;

class Assignment28 {
 
	// Find second highest number in given array
	
	int getSecondHighest(int[] input) {
	
		int num1 = 0;
		int num2 = 0;
		System.out.println("Given array :: " + Arrays.toString(input));
		for(int index=0;index<input.length;index++) {
			
			if(input[index] > num1) {
				num2 = num1;
				num1 = input[index];
			} else if(input[index] != num1 && input[index] > num2)
					num2 = input[index];
			
		}
		return num2;
	}
	
	int getHightest(int[] input) {
	
		int max = 0;
	
		int temp =0;
		
		int index=0;
		
		//while(index < n){
		for(;index<input.length;index++) {
			
			if(input[index] > max) {
				
				max = input[index];
				 temp = index;
			}
		
		}
		input[temp] = 0;
		return max;
	}
	
	// Find Nth highest number in the given array
	
	int getNthHightest(int[] input,int n) {
		
		int num = 0;
		System.out.println("\n Given array :: " + Arrays.toString(input));
		for(int index=0;index<n;index++) {
			num = getHightest(input);
			
		}	
		return num;
	}
	
	public static void main(String[] args) {
		
		Assignment28 assignment = new Assignment28();
		int[] input = {10,23,2,11,55,43,99};
		int output = assignment.getSecondHighest(input);
		System.out.println("\n The second highest number :: " + output);
		int output2 = assignment.getNthHightest(input,3);
		System.out.println("\n The Nth highest number :: " + output2);
	}
}