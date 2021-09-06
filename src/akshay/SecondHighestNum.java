package akshay;

import java.util.Arrays;

public class SecondHighestNum {
	
	int max = 0;
	int secondMax = 0;
	
	int getSecondHighestNum(int[] input) {
		for(int index = 0; index < input.length; index++) {	
			if(input[index]>max) {
				secondMax = max;
				max = input[index];
			}
			else if(input[index] > secondMax) {
				secondMax = input[index];
			}
		}	
		return secondMax;
	}
	
	public static void main(String[] args) {
		SecondHighestNum secondHighest = new SecondHighestNum();
		int[] arr = {10,23,2,11,55,43,99};
		System.out.println("Given Array: " +Arrays.toString(arr));
		System.out.println("Second Highest number from given array is: " +secondHighest.getSecondHighestNum(arr));
	}
}
