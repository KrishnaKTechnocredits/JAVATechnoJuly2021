package neha.assignment_34;

import java.util.Arrays;

/*program 1 : place 0 after the triple which in sequence.

input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99}; // 11 + 3 = 14
output = [1,3,4,5,0,7,3,9,10,11,0,14,44,67,1,2,3,0,99];*/

public class TripletProgram1 {
	int findTripletCount(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length - 2; i++) {
			if (arr[i + 1] == arr[i] + 1 && arr[i + 2] == arr[i] + 2)
				count++;
		}
		return count;
	}

	void placeZeroAfterTripletAndDisplay(int[] arr) {
		int outLength = arr.length + findTripletCount(arr); // output array length= original array length+triplet count
		int[] output = new int[outLength];
		int outIndex = 0;
		int inpIndex = 0;
		while (inpIndex < arr.length) {
			if (inpIndex != arr.length - 1 && arr[inpIndex + 1] == arr[inpIndex] + 1
					&& arr[inpIndex + 2] == arr[inpIndex] + 2) {
				output[outIndex] = arr[inpIndex];
				output[outIndex + 1] = arr[inpIndex + 1];
				output[outIndex + 2] = arr[inpIndex + 2];
				output[outIndex + 3] = 0;
				inpIndex += 3;
				outIndex += 4;
			} else {
				output[outIndex] = arr[inpIndex];
				inpIndex++;
				outIndex++;
			}
		}
		System.out.println("Output array with zeros placed after triplet is " + Arrays.toString(output));

	}

	public static void main(String[] args) {
		TripletProgram1 tripletProgram1 = new TripletProgram1();
		int[] input = { 1, 3, 4, 5, 7, 3, 9, 10, 11, 14, 44, 67, 1, 2, 3, 99 };
		tripletProgram1.placeZeroAfterTripletAndDisplay(input);
	}

}
