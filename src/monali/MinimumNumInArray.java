package monali;

public class MinimumNumInArray {
	/*
	 * program 2 : find minimum number from given array. int[] input =
	 * {1,11,44,23,55,99,23}; output : 1
	 */

	int getMinimumNumber(int[] input) {
		int minValue = input[0];

		for (int index = 0; index < input.length; index++) {
			if (input[index] < minValue) {
				minValue = input[index];
			}
		}
		return minValue;
	}

	public static void main(String[] args) {
		MinimumNumInArray minNuminArray = new MinimumNumInArray();
		int[] input = { 1, 11, 44, 23, 55, 99, 23 };
		System.out.println("Minimum Number in array : " + minNuminArray.getMinimumNumber(input));

	}
}
