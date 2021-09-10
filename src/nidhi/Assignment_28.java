package nidhi;

import java.util.Arrays;

/**
Program 1: Find second highest number from array.
int[] arr = {10,23,2,11,55,43,99};
output : 55

Program 2: Find nth highest number from array.
int[] arr = {10,23,2,11,55,43,99};
input n = 3;
output : 43
**/

class Assignment_28{
	
	int secondHighestNbr(int[] arr){
		Arrays.sort(arr);
		return arr[arr.length -2];		
	}
	
	int secondHighestNbr(int[] arr, int num){
		Arrays.sort(arr);
		return arr[arr.length -num];	
	}
	
	public static void main(String[] arg){
		Assignment_28 assignment28 = new Assignment_28();
		int[] arr = {10,23,2,11,55,43,99};
		System.out.println(assignment28.secondHighestNbr(arr));
		System.out.println(assignment28.secondHighestNbr(arr, 5));
	}

}