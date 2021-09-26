package gauravk.Assignment_28;

import java.util.Arrays;

/*
 * Assignment - 28 : 4th Sep'2021 

Program 1: Find second highest number from array.
int[] arr = {10,23,2,11,55,43,99};
output : 55

Program 2: Find nth highest number from array.
int[] arr = {10,23,2,11,55,43,99};
input n = 3;
output : 43

Note : Please watch session recording for hints
 */
public class SecondHighestValueFromArray {
	
	int getSecondHighestValueFromArray(int[] input) {
		int highestValue = input[0], secondHighestValue = input[1];
		if(input.length>2) {            //just ruling out the possibility if array only contains two values.
			if(input[0]>input[1]) {
				highestValue=input[0];
				secondHighestValue=input[1];
			}else {
				highestValue=input[1];
				secondHighestValue=input[0];
			}
			
			for(int i=3; i<input.length;i++) {
				if(input[i]>highestValue) {
					secondHighestValue=highestValue;
					highestValue = input[i];
				}
			}
		}
		else {
			if(input[0]>input[1]) {
				highestValue=input[0];
				secondHighestValue=input[1];
			}else {
				highestValue=input[1];
				secondHighestValue=input[0];
			}
		}
		return secondHighestValue;
	}
	
	public static void main(String[] args) {
		int[] arr = {10,23,2,11,55,43,99};
		System.out.println("The second highest value from array "+Arrays.toString(arr)+" is "+new SecondHighestValueFromArray().getSecondHighestValueFromArray(arr));
	}
}
