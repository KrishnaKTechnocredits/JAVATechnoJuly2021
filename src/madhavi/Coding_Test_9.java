package madhavi;

import java.util.Arrays;

public class Coding_Test_9 {

	int getNegativeNumberClosedToZero(int[] arr) {
		int closestVal = arr[0];
		System.out.println(Arrays.toString(arr));

		for (int index = 0; index < arr.length; index++) {
			if (arr[index] < 0 && arr[index] > closestVal) {
				closestVal = arr[index];
			}
		}
		return closestVal;
	}

	public static void main(String[] args) {
		Coding_Test_9 coding_Test_9 = new Coding_Test_9();
		System.out.println(" Print negative number with respect to 0 ");
		int[] inputArray = { -3, 11, 123, -11, -9, -55, 33, 44, 1, 4, 5 };
		System.out.println(coding_Test_9.getNegativeNumberClosedToZero(inputArray));

	}
}