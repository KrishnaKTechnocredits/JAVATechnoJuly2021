package monali;

public class DiffBtwnMaxAndMinNum {
	/*
	 * program 3 : print difference between max and min number from given array.
	 * int[] input = {1,11,44,23,55,99,23}; output : 98
	 */

	int getDiffBtwnMaxAndMinNum(int[] input) {
		int minValue = input[0];
		int maxValue = input[0];
		for (int index = 0; index < input.length; index++) {
			if (input[index] < minValue) {
				minValue = input[index];
			}
			if (input[index] > maxValue) {
				maxValue = input[index];
			}
		}
		return maxValue - minValue;
	}

	public static void main(String[] args) {
		DiffBtwnMaxAndMinNum diffMaxandMin = new DiffBtwnMaxAndMinNum();
		int[] input = { 1, 11, 44, 23, 55, 99, 23 };
		System.out.println("Difference between Minimum and maximum value in array  : "
				+ diffMaxandMin.getDiffBtwnMaxAndMinNum(input));

	}
}
