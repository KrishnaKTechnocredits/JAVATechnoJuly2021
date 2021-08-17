package kalpesh;

public class DifferenceBetweenMaxAndMin {

	static int max = 0, min = 100;

	int findMaxNumber(int[] input) {
		for (int index = 0; index < input.length; index++) {
			if (input[index] > max)
				max = input[index];
		}
		return max;
	}

	int findMinNumber(int[] input) {
		for (int index = 0; index < input.length; index++) {
			if (input[index] < min)
				min = input[index];
		}
		return min;
	}

	public static void main(String[] args) {
		DifferenceBetweenMaxAndMin difference = new DifferenceBetweenMaxAndMin();
		int[] input = { 1, 11, 44, 23, 55, 99, 23, };
		difference.findMaxNumber(input);
		difference.findMinNumber(input);
		int diff;
		diff = max - min;
		System.out.println("The difference between max & min numbers is " + diff);
	}

}

