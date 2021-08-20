package avinash;
/*
 * program 3 : print difference between max and min number from given array.
int[] input = {1,11,44,23,55,99,23};
output : 98
 */
public class DifferenceMaxandMin {
	int getMaxMinNumDiff(int[] num) {
		int min = num[0];
		int max = num[0];
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
		DifferenceMaxandMin differencemaxandmin = new DifferenceMaxandMin();
		System.out.println("Difference Between Maximum And Minimum Number From Given Array is : "
				+ differencemaxandmin.getMaxMinNumDiff(input));
	}

}

