package vivek;

public class Assignment14 {

	int getMaxNumber(int[] input) {

		int max = input[0];
		for (int index = 0; index < input.length; index++) {
			if (input[index] > max)
				max = input[index];
		}
		return max;
	}

	int getMinNumber(int[] input) {

		int min = input[0];
		for (int index = 0; index < input.length; index++) {
			if (input[index] < min)
				min = input[index];
		}
		return min;
	}

	int getMaxMinDifference(int[] input) {

		return getMaxNumber(input) - getMinNumber(input);
	}

	int getOddEvenDifference(int[] input) {
		int oddMax = input[0];
		int evenMax = input[0];
		for (int index = 0; index < input.length; index++) {
			if (input[index] % 2 == 0) {
				if (input[index] > evenMax)
					evenMax = input[index];
			} else {
				if (input[index] > oddMax)
					oddMax = input[index];
			}
		}
		return oddMax - evenMax;
	}

	public static void main(String[] args) {
		Assignment14 assignment14 = new Assignment14();
		int[] input = { 1, 11, 44, 23, 55, 99, 23 };

		System.out.println("Maximum no in the array is " + assignment14.getMaxNumber(input));
		System.out.println("Minimum no in the array is " + assignment14.getMinNumber(input));
		System.out.println("Difference between Max and min no in the array is " + assignment14.getMaxMinDifference(input));
		System.out.println("Difference between max odd and max even number is " + assignment14.getOddEvenDifference(input));
	}

}
