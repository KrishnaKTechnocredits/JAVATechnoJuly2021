/*Assignment - 34 : 11th Sep'2021
program 1 : place 0 after the triple which in sequence.

input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99}; // 11 + 3 = 14
output = [1,3,4,5,0,7,3,9,10,11,0,14,44,67,1,2,3,0,99];

		 
program 2 : place sum of triple after each triple which in sequence.

input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
output = [1,3,4,5,12,7,3,9,10,11,30,14,44,67,1,2,3,6,99];*/
		 
package shalaka.Assignment34;

import java.util.Arrays;

public class ZeroAfterTriplet {

	void getZeroAfterTriplet(int arr[]) {
		int[] output = new int[arr.length * 2];
		int count = 0;
		int countOfseq = 0;
		int numbersAfterLastTriplets = 0;
		int index = 0;
		for (; index < arr.length - 2; index++, count++) {
			output[count] = arr[index];
			numbersAfterLastTriplets++;
			if ((arr[index + 2] == arr[index] + 2) && (arr[index + 1] + 1 == arr[index + 2])) {
				countOfseq++;
				output[++count] = arr[index + 1];
				output[++count] = arr[index + 2];
				output[++count] = 0;
				index += 2;
				numbersAfterLastTriplets = 0;
			}
		}
		numbersAfterLastTriplets += (arr.length - index);
		if (numbersAfterLastTriplets == 1) {
			output[count] = arr[index];
		} else if (numbersAfterLastTriplets > 1) {
			output[count] = arr[index];
			output[++count] = arr[++index];
		}
		System.out.print("After placing zero after each triplet output array is: ");
		for (int index1 = 0; index1 < arr.length + countOfseq; index1++) {
			System.out.print(output[index1] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = { 1, 3, 4, 5, 7, 3, 9, 10, 11, 14, 44, 67, 1, 2, 3, 99 };
		ZeroAfterTriplet zeroAfterTriplet = new ZeroAfterTriplet();
		zeroAfterTriplet.getZeroAfterTriplet(input);
	}
}