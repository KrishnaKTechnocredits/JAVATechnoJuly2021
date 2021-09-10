/*
 * Print second highest and nth highest number in a given array
 */
package bhagyashree;

public class Assignment28 {
	int getSecondHighestNumber(int[] array) {
		int maxnum = 0;
		int secondMax = 0;
		for (int index = 0; index < array.length; index++) {
			if (maxnum < array[index]) {
				secondMax = maxnum;
				maxnum = array[index];
			} else if (secondMax < array[index]) {
				secondMax = array[index];
			}
		}
		return secondMax;

	}

	int getHighestNumber(int[] array) {
		int maxNum = 0;
		int temp = 0;

		for (int index = 0; index < array.length; index++) {
			if (array[index] > maxNum) {
				maxNum = array[index];
				temp = index;
			}
			// array1[temp]=0;
		}
		array[temp] = 0;
		return maxNum;
	}

	int getNthHighestNumber(int[] array, int n) {
		int number = 0;
		for (int index = 0; index < n; index++) {
			number = getHighestNumber(array);
		}
		return number;
	}

	public static void main(String[] args) {
		int[] input = { 10, 23, 2, 11, 55, 43, 99 };
		Assignment28 assignment28 = new Assignment28();
		System.out.println("second Highest number from given array: " + assignment28.getSecondHighestNumber(input));

		// int[] input1= {10,23,2,11,55,43,99};
		System.out.println(assignment28.getHighestNumber(input));

		System.out.println("Given HighestNumber from given array: " + assignment28.getNthHighestNumber(input, 2));
	}
}
