package nasir;

import amol_Vyas.Assignment_14.ArrayProgram_3;

public class MinMaxDiffrence {
	int getMaximumMinimumDifference(int[] num) {
		int min = num[0];
		int max = 0;
		for (int index = 0; index < num.length; index++) {
			if (num[index] < min)
				min = num[index];
			if (num[index] > max)
				max = num[index];

		}
		return max - min;
	}

	public static void main(String[] args) {
		int[] input = { 1, 11, 44, 23, 55, 99, 23 };
		MinMaxDiffrence minMaxDiffrence = new MinMaxDiffrence();
		System.out.println("Difference between maximum and minimum number from given array is "
				+ minMaxDiffrence.getMaximumMinimumDifference(input));

	}

}
