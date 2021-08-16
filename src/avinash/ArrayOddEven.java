package avinash;
/*
 * 
program 4 : print difference between max odd number and max even number from given array. difference should be positive

int[] input = {1,11,44,23,55,99,23,22};
hint : 99 - 44
output : 55
 */

public class ArrayOddEven {

	int getMaxOddMaxEvenNumDiff(int[] num) {
		int maxEven = 0;
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
		ArrayOddEven arrayoddeven = new ArrayOddEven();
		System.out.println("Difference Between Maximum Odd And Maximum Even Number From Given Array Is : "
				+ arrayoddeven.getMaxOddMaxEvenNumDiff(input));
	}

}
