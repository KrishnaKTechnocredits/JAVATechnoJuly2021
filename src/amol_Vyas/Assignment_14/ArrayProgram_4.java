/*
program 4 : print difference between max odd number and max even number from given array. difference should be positive
int[] input = {1,11,44,23,55,99,23,22};
hint : 99 - 44
output : 55
*/

package amol_Vyas.Assignment_14;

public class ArrayProgram_4 {

	int getMaximumMinimumNumberDifference(int[] num) {
		int maxEven = 0;
		;
		int maxOdd = 0;
		for (int index = 0; index < num.length; index++) {
			if (num[index] % 2 == 0) {
				if (num[index] > maxEven)
					maxEven = num[index];
			} else if (num[index] > maxOdd)
				maxOdd = num[index];

		}
		if (maxOdd - maxEven > 0)
			return maxOdd - maxEven;
		else
			return maxEven - maxOdd;
	}

	public static void main(String[] args) {
		int[] input = { 1, 11, 44, 23, 55, 99, 23, 22 };
		ArrayProgram_4 arrayProgram_3 = new ArrayProgram_4();
		System.out.println("Difference between maximum odd and maximum even number from given array is "
				+ arrayProgram_3.getMaximumMinimumNumberDifference(input));
	}

}
