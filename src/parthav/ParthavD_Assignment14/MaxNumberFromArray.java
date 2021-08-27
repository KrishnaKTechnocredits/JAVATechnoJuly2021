package parthav.ParthavD_Assignment14;

public class MaxNumberFromArray {
	int maxNumber;

	void printMaxNumberFromArray(int[] arr) {

		for (int index = 0; index < arr.length; index++) {
			if (maxNumber <= arr[index]) {
				maxNumber = arr[index];
			}
		}
		System.out.println("The max number from the given array is: " + maxNumber);

	}

}
