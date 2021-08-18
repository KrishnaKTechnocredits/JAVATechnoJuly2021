package shweta_Dharmadhikari.array_examples;

public class MaxMinCountFromArray {

	int[] input = { 1, 11, 44, 23, 55, 99, 23 };

	int maxNumber() {
		int index = 0;
		int max = input[index];
		for (; index < input.length; index++) {
			if (input[index] > max)
				max = input[index];
		}
		return max;
	}

	int minNumber() {
		int index = 0;
		int min = input[index];
		for (; index > input.length; index++) {
			if (input[index] < min)
				min = input[index];
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxMinCountFromArray maxMinCountFromArray = new MaxMinCountFromArray();
		System.out.println("Maximum number is " + maxMinCountFromArray.maxNumber());
		System.out.println("\nMinimum number is " + maxMinCountFromArray.minNumber());
		System.out.println("\nDifference between max and min number is "
				+ (maxMinCountFromArray.maxNumber() - maxMinCountFromArray.minNumber()));
	}

}
