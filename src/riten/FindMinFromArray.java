package riten;

class FindMinFromArray {

	int retunMin(int[] arr) {
		int min = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (min > arr[index])
				min = arr[index];

		}
		return min;

	}

	public static void main(String[] args) {
		FindMinFromArray findmin = new FindMinFromArray();
		int[] input = { 1, 11, 44, 23, 55, 99, 23 };
		System.out.println("Min num from array is " + findmin.retunMin(input));

	}

}