/*Assignment - 34 : 11th Sep'2021
program 1 : place 0 after the triple which in sequence.

input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99}; // 11 + 3 = 14
output = [1,3,4,5,0,7,3,9,10,11,0,14,44,67,1,2,3,0,99];
*/

package shraddha.Assignment34;

import java.util.Arrays;

public class PlaceZeroAfterTripletInSequence {
	public static void main(String[] args) {
		int[] inputArray = { 1, 3, 4, 5, 7, 3, 9, 10, 11, 14, 44, 67, 1, 2, 3, 99 };
		PlaceZeroAfterTripletInSequence newObject = new PlaceZeroAfterTripletInSequence();
		newObject.getConsecutiveTripletsInArray(inputArray);
	}

	void getConsecutiveTripletsInArray(int[] inputArray) {
		int number1;
		int number2;
		int number3;
		int count = 0;
		System.out.println("input array is :- " + Arrays.toString(inputArray));
		for (int index = 0; index < inputArray.length - 2; index++) {
			number1 = inputArray[index];
			number2 = inputArray[index + 1];
			number3 = inputArray[index + 2];
			if (number2 - number1 == 1 && number3 - number2 == 1) {
				count++;
			}
		}
		int[] outputArray = new int[inputArray.length + count];
		int ouputIndex = 0;
		int index;
		for (index = 0; index < inputArray.length - 2; index++) {
			number1 = inputArray[index];
			number2 = inputArray[index + 1];
			number3 = inputArray[index + 2];
			if (number2 - number1 == 1 && number3 - number2 == 1) {
				outputArray[ouputIndex++] = inputArray[index++];
				outputArray[ouputIndex++] = inputArray[index++];
				outputArray[ouputIndex++] = inputArray[index];
				outputArray[ouputIndex++] = 0;
			} else
				outputArray[ouputIndex++] = inputArray[index];
		}
		while (index < inputArray.length)
			outputArray[ouputIndex++] = inputArray[index++];
		System.out.println("OutPut Array is :- " + Arrays.toString(outputArray));
	}

}
