/*
program 3 : print difference between max and min number from given array.
int[] input = {1,11,44,23,55,99,23};
output : 98
*/

package amol_Vyas.Assignment_14;

public class ArrayProgram_3 {

	int getMaximumMinimumNumberDifference(int[] num) {
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
		ArrayProgram_3 arrayProgram_3 = new ArrayProgram_3();
		System.out.println("Difference between maximum and minimum number from given array is "
				+ arrayProgram_3.getMaximumMinimumNumberDifference(input));
	}

}
