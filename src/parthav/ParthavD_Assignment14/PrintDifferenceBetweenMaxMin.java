package parthav.ParthavD_Assignment14;

public class PrintDifferenceBetweenMaxMin {
	int maxNumber;
	int minNumber;
	
	void printMaxNumberFromArray(int[] arr) {

		for (int index = 0; index < arr.length; index++) {
			if (maxNumber <= arr[index]) {
				maxNumber = arr[index];
			}
		}
		System.out.println("The max number from the given array is: " + maxNumber);

	}
	
	void printMinNumberfromArray(int[] arr) {
		minNumber = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (minNumber >= arr[index]) {
				minNumber = arr[index];
			}
		}

		System.out.println("The min number from the given array is: " + minNumber);
	}

	void printMaxMinNumberDifference() {
		System.out.println("The difference between max and min numbers of the given array is: " + (maxNumber - minNumber));
	}

}
