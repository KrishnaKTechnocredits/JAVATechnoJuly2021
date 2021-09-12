/*Assignment - 34 : 11th Sep'2021
program 2 : place sum of triple after each triple which in sequence.

input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
output = [1,3,4,5,12,7,3,9,10,11,30,14,44,67,1,2,3,6,99];
*/

package shraddha.Assignment34;

import java.util.Arrays;

public class PlaceSumAfterTripletInSequence {
	public static void main(String[] args) {
		int[] inputArray = { 1, 3, 4, 5, 7, 3, 9, 10, 11, 14, 44, 67, 1, 2, 3, 99 };
		PlaceSumAfterTripletInSequence newObject = new PlaceSumAfterTripletInSequence();
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
				outputArray[ouputIndex++] = number1 + number2 + number3;
			} else
				outputArray[ouputIndex++] = inputArray[index];
		}
		while (index < inputArray.length)
			outputArray[ouputIndex++] = inputArray[index++];
		System.out.println("OutPut Array is :- " + Arrays.toString(outputArray));
	}

}
