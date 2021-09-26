/*Assignment - 33 : 11th Sep'2021

Program 1 : shift all non zeros at the end.
input : {1,0,3,4,0,2,88,0,0,22,34};
output : [0,0,0,0,1,3,4,2,88,22,34]*/

package shraddha.Assignment33;

import java.util.Arrays;

public class ShiftNonZerosToEndInArray {
	public static void main(String[] args) {
		int[] inputArray = { 1, 0, 3, 4, 0, 2, 88, 0, 0, 22, 34 };

		int outputArray[] = new int[11];
		int temp = 0;
		int zeroCount = 0;
		System.out.println("Input Array is :- " + Arrays.toString(inputArray));
		for (int index = 0; index < inputArray.length; index++) {
			if (inputArray[index] == 0)
				zeroCount++;
		}
		temp = zeroCount;
		for (int index = 0; index < inputArray.length; index++) {
			if (inputArray[index] != 0)
				outputArray[temp++] = inputArray[index];
		}
		System.out.println("Output Array is :- " + Arrays.toString(outputArray));
	}

}
