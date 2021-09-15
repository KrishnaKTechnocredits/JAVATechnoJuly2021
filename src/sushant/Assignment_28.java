/*Program 1: Find second highest number from array.
int[] arr = {10,23,2,11,55,43,99};
output : 55

Program 2: Find nth highest number from array.
int[] arr = {10,23,2,11,55,43,99};
input n = 3;
output : 43

Note : Please watch session recording for hints(29.5/29.6)*/


package sushant;

import java.util.Arrays;

public class Assignment_28 {
	void secondHighest(int[] input) {
		System.out.println("Enter the array: "+Arrays.toString(input));
		int output=0;
		for(int i=0; i<input.length;i++) {
			for(int j=i+1; j<input.length;j++) {
				if(input[i]>input[j]) {
					output=input[i];
					input[i]=input[j];
					input[j]=output;
				}
			}
		}
		System.out.println("The second highest number is: "+output);
	}

	void nthHighest(int[] input, int n) {
		System.out.println("Enter the array: "+Arrays.toString(input));
		int output=0, temp=0;
		for(int i=0; i<input.length;i++) {
			for(int j=i+1; j<input.length;j++) {
				if(input.length>n) {
					if(input[i]>input[j]) {
						temp=input[i];
						input[i]=input[j];
						input[j]=temp;
					}
					output=input[input.length-n];
				}	
			}
		}
		if(input.length<=n) 
			System.out.println("Enter the valid nth term");
		else
			System.out.println("The nth highest number is: "+output);
	}

	public static void main(String[] args) {
		Assignment_28 assignment_28 = new Assignment_28();
		int[] input={10,23,2,11,55,43,99};
		assignment_28.secondHighest(input);
		System.out.println("--------------------------------------------");
		int[] arr = {10,23,2,11,55,43,99};
		assignment_28.nthHighest(arr, 3);
		System.out.println("--------------------------------------------");
		int[] arr1 = {10,23,2,11,55,43,99};
		assignment_28.nthHighest(arr1, 8);

	}
}