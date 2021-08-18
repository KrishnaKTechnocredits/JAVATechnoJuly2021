package parthav.ParthavD_Assignment14;

public class MinNumberFromArray {

	int minNumber;

	void printMinNumberfromArray(int[] arr) {
		minNumber = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (minNumber >= arr[index]) {
				minNumber = arr[index];
			}
		}

		System.out.println("The min number from the given array is: " + minNumber);
	}

}
