/*program 3: place all negative numbers at the beginning, zeros and all positive numbers at the end.
input = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
output : [-3,-2,-76,0,0,0,1,11,44,55,33,12]
*/

package parthav.parthavD_Assignment33;

public class PlaceNegativePositiveZeroNumbers {

	int newArrayIndex = 0;
	int negativeNumber = 0;
	// int countOfNegativeNumbers = 0;

	void printShiftedArray(int[] inputArr) {
		System.out.print(
				"The new shifted array as with negative numbers at beginning and zero / positive numbers at the end is: {");
		int[] shiftedOutputArr = new int[inputArr.length];
		insertOnlyNegativeNumbersInArray(inputArr, shiftedOutputArr);
		insertOnlyZerosInArray(inputArr, shiftedOutputArr);
		insertOnlyPositiveNumbersInArray(inputArr, shiftedOutputArr);
		System.out.print("}");
		System.out.println("");

	}

	void insertOnlyNegativeNumbersInArray(int[] inputArr, int[] shiftedOutputArr) {

		for (int index = 0; index < inputArr.length; index++) {
			if (inputArr[index] < 0) {
				// countOfNegativeNumbers++;
				shiftedOutputArr[newArrayIndex] = inputArr[index];
				System.out.print(shiftedOutputArr[newArrayIndex] + ",");
				newArrayIndex++;

			}
		}

	}

	void insertOnlyZerosInArray(int[] inputArr, int[] shiftedOutputArr) {

		for (int index = 0; index < inputArr.length; index++) {
			if (inputArr[index] == 0) {
				// countOfNegativeNumbers++;
				shiftedOutputArr[newArrayIndex] = inputArr[index];
				System.out.print(shiftedOutputArr[newArrayIndex] + ",");
				newArrayIndex++;

			}
		}

	}

	void insertOnlyPositiveNumbersInArray(int[] inputArr, int[] shiftedOutputArr) {

		for (int index = 0; index < inputArr.length; index++) {
			if (inputArr[index] > 0) {
				shiftedOutputArr[newArrayIndex] = inputArr[index];
				System.out.print(shiftedOutputArr[newArrayIndex] + ",");
				newArrayIndex++;
			}
		}

	}

}
