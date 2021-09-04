/*Program 1: Find second highest number from array.
int[] arr = {10,23,2,11,55,43,99};
output : 55*/

package shraddha.Assignment28;

import java.util.Arrays;

public class SecondHighestNumberInArray {
	public static void main(String[] args) {
		int[] arr = { 10, 23, 2, 11, 55, 43, 99 };
		SecondHighestNumberInArray newObject = new SecondHighestNumberInArray();
		System.out.println("Input Array is :- " + Arrays.toString(arr));
		newObject.getSecondHighestNumber(arr);
	}

	void getSecondHighestNumber(int[] inputArray) {
		int maxNumber = inputArray[0];
		int maxSecondNo = 0;
		for (int index = 0; index < inputArray.length; index++) {
			if (maxNumber < inputArray[index]) {
				maxSecondNo = maxNumber;
				maxNumber = inputArray[index];
			} else if (inputArray[index] > maxSecondNo)
				maxSecondNo = inputArray[index];
		}
		System.out.println("highest number is :- " + maxNumber);
		System.out.println("Second Highest number is :- " + maxSecondNo);
	}

}
