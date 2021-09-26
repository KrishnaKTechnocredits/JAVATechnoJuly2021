package riten;

class MaxOddMinOdd {

	int maxodd;
	int minodd;
	int diff;

	int returnMaxOdd(int[] arr) {
		int max = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 2 == 0 & arr[index] > max)
				max = arr[index];
			maxodd = max;
		}
		return maxodd;
	}

	int returnMinOdd(int[] arr) {
		int min = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 2 != 0 & arr[index] > min)
				min = arr[index];
			minodd = min;

		}
		return minodd;
	}

	void returnDiff() {
		if (maxodd > minodd) {
			diff = maxodd - minodd;
		} else {
			diff = minodd - maxodd;
		}
		System.out.println("Diffrence between Maxodd and Minodd is " + diff);
	}

	public static void main(String[] args) {
		MaxOddMinOdd maxoddminodd = new MaxOddMinOdd();
		int[] input = { 1, 11, 44, 23, 55, 99, 23, 22 };
		System.out.println("Max num from array is " + maxoddminodd.returnMaxOdd(input));
		System.out.println("Min num from array is " + maxoddminodd.returnMinOdd(input));
		maxoddminodd.returnDiff();

	}
}