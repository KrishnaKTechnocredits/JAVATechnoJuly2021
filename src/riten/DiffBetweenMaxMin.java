package riten;

class DiffBetweenMaxMin {

	int maxSum;
	int minSum;
	int diff;

	int returnMax(int[] arr) {
		int max = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > max)
				max = arr[index];
			maxSum = max;
		}
		return maxSum;
	}

	int returnMin(int[] arr) {
		int min = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (min > arr[index])
				min = arr[index];
			minSum = min;

		}
		return minSum;
	}

	void returnDiff() {
		diff = maxSum - minSum;
		System.out.println("Diffrence between Max and Min is " + diff);
	}

	public static void main(String[] args) {
		DiffBetweenMaxMin diffmaxmin = new DiffBetweenMaxMin();
		int[] input = { 1, 11, 44, 23, 55, 99, 23 };
		System.out.println("Max num from array is " + diffmaxmin.returnMax(input));
		System.out.println("Min num from array is " + diffmaxmin.returnMin(input));
		diffmaxmin.returnDiff();

	}
}