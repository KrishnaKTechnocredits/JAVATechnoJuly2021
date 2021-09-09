/*Test 4 : Shift all Zero's at the end of the array. 
int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
ouput : {1,6,2,3,4,5,0,0,0,0,0};*/

package shraddha.CodingTest;

import java.util.Arrays;

public class ShiftAllZerosToEndOfArray {
	public static void main(String[] args) {
		int[] inputArray = { 1, 0, 0, 6, 0, 2, 3, 0, 4, 0, 5 };
		int outputArray[] = new int[inputArray.length];
		int temp = 0;
		System.out.println("Input Array is :- " + Arrays.toString(inputArray));
		for (int index = 0; index < inputArray.length; index++) {
			if (inputArray[index] != 0)
				outputArray[temp++] = inputArray[index];
		}
		System.out.println("Output Array is :- " + Arrays.toString(outputArray));

	}
}
