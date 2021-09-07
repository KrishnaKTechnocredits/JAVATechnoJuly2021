package gauravk.Assignment_28;

import java.util.Arrays;
import java.util.ArrayList;

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
public class NthHighestNumberArray {
	
	int nthHighestNumber(int[] input, int xth) {
		int nthHighest=0;
		for(int i=1; i<=xth; i++) {
			int value = findingHighestNumInArray(input);
			nthHighest = value;
			for(int j=0; j<input.length; j++) {
				if(input[j]==nthHighest) {
					input[j]=0;
				}
			}
		}
		return nthHighest;
	}
	
	int findingHighestNumInArray(int[] input) {
		int highestNum=0;
		for(int i=0; i<input.length; i++) {
			if(highestNum>input[i]) {
				highestNum=highestNum;
			}
			else highestNum=input[i];
		}
		return highestNum;
	}
	
	public static void main(String[] args) {
		int[] arr = {10,23,2,11,55,43,99};
		int x = 3;
		System.out.println("The nth highest number from the array "+Arrays.toString(arr)+" is "+new NthHighestNumberArray().nthHighestNumber(arr,x)+", where n="+x);
	}
}
