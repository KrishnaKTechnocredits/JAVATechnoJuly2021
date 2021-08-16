package avinash;

/*
 * program 2 : find minimum number from given array.
int[] input = {1,11,44,23,55,99,23};
output : 1
 */
public class MinNumberofArray {

	int minNumberofArray(int[] input) {
		int min = input[0];
		for (int index = 0; index < input.length; index++) {
			if (input[index] < min)
				min = input[index];
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinNumberofArray minnumberofarray = new MinNumberofArray();
		int[] input = { 1, 11, 44, 23, 55, 99, 23 };
		System.out.println("Minimum number in the given array is:" + minnumberofarray.minNumberofArray(input));
	}

}
