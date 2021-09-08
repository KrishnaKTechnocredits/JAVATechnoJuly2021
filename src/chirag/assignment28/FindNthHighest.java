package chirag.assignment28;

import java.util.Arrays;

//Program 2: Find nth highest number from array.
//int[] arr = {10,23,2,11,55,43,99};
//input n = 3;
//output : 43

public class FindNthHighest {
	
	int nthHighestNumber(int[] input, int arr) {
		int nthHighest = 0;
		for(int index = 1; index <= arr; index++) {
			int value = findHighestNumInArray(input);
			nthHighest = value;
			for(int j = 0; j < input.length; j++) {
				if(input[j] == nthHighest) {
					input[j] = 0;
				}
			}
		}
		return nthHighest;
	}

	int findHighestNumInArray(int[] input) {
		int highestNumber = 0;
		for(int i = 0; i < input.length; i++) {
			if(highestNumber > input[i]) {
				highestNumber = highestNumber;
			}
			else highestNumber = input[i];
		}
		return highestNumber;
	}
	public static void main(String[] args) {
		FindNthHighest findNthHighest=new FindNthHighest();
		int[] arr = {10,23,2,11,55,43,99};
		int nth = 3;
		findNthHighest.findHighestNumInArray(arr);
		System.out.println("Nth highest number in a given array : "+findNthHighest.nthHighestNumber(arr, 3));
	}
	}