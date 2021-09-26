package devendra_Assignment_32;

import java.util.Arrays;

public class Assignment32_MaxTripletSum {
	void maxTripletSum(int[] arr) {
		int[] output = new int[3];
		int sum = 0, maxTripletSum = 0, index2 = 0;
		for (int index = 1; index < arr.length - 1; index++) {
			if (arr[index - 1] == (arr[index] - 1) && arr[index + 1] == (arr[index] + 1)) {
				sum = arr[index - 1] + arr[index] + arr[index + 1];
			}
			if (sum > maxTripletSum) {
				maxTripletSum = sum;
				index2 = index - 1;
			}
		}
		int count = 0;
		for (int index = index2; index < index2 + 3; index++) {
			output[count] = arr[index];
			count++;
		}
		System.out.println("The Triplet having Maximum Sum = " + Arrays.toString(output));
	}

	public static void main(String[] args) {
		Assignment32_MaxTripletSum obj = new Assignment32_MaxTripletSum();

		int[] arr = { 10, 64, 65, 66, 23, 24, 25, 26, 61, 62 };

		System.out.println("Input Array = " + Arrays.toString(arr));

		obj.maxTripletSum(arr);
	}
}

/*
Assignment - 32 : 10th Sep'2021

Program 1: find the triple which in sequence and having maximum sum.
int[] arr = {10,64,65,66,23,24,25,26,61,62};
output : 64,65,66 is a triple having maximum sum
Note : 23,24,25
       24,25,26
	   64,65,66 -> having max sum

*/