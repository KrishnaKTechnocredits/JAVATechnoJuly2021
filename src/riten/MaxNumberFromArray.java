package riten;

class MaxNumberFromArray {

	int max = 0;

	int findMax(int[] arr) {
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > max)
				max = arr[index];
		}
		return max;
	}

	public static void main(String[] args) {
		MaxNumberFromArray maxarray = new MaxNumberFromArray();
		int[] input = { 1, 11, 44, 23, 55, 99, 23 };
		System.out.println("Max Number from array is " + maxarray.findMax(input));

	}

}