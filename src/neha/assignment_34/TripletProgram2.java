package neha.assignment_34;
/*program 2 : place sum of triple after each triple which in sequence.

input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
output = [1,3,4,5,12,7,3,9,10,11,30,14,44,67,1,2,3,6,99];*/

import java.util.Arrays;

public class TripletProgram2 extends TripletProgram1 {
	void placeTripletSumAfterTripletAndDisplay(int[] arr, int tripleCount) {
		int outLength = arr.length + tripleCount; // output array length= original array
													// length+triplet count
		int[] output = new int[outLength];
		int outIndex = 0;
		int inpIndex = 0;
		int sum = 0;
		while (inpIndex < arr.length) {
			if (inpIndex != arr.length - 1 && arr[inpIndex + 1] == arr[inpIndex] + 1
					&& arr[inpIndex + 2] == arr[inpIndex] + 2) {
				output[outIndex] = arr[inpIndex];
				output[outIndex + 1] = arr[inpIndex + 1];
				output[outIndex + 2] = arr[inpIndex + 2];
				sum = output[outIndex] + output[outIndex + 1] + output[outIndex + 2];
				output[outIndex + 3] = sum;
				inpIndex += 3;
				outIndex += 4;
			} else {
				output[outIndex] = arr[inpIndex];
				inpIndex++;
				outIndex++;
			}
		}
		System.out.println("Output array with triplet sum placed after triplet is " + Arrays.toString(output));

	}

	public static void main(String[] args) {
		TripletProgram2 tripletProgram2 = new TripletProgram2();
		int[] input = { 1, 3, 4, 5, 7, 3, 9, 10, 11, 14, 44, 67, 1, 2, 3, 99 };
		int tripletCount = tripletProgram2.findTripletCount(input); // findTripletCount(input) is parent class method
		tripletProgram2.placeTripletSumAfterTripletAndDisplay(input, tripletCount);
	}

}
