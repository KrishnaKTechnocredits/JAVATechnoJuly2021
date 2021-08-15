package avinash;

/*
 * program 1 : find maximum number from given array.
int[] input = {1,11,44,23,55,99,23};
output : 99
 */
public class MaxNumberofArray {
	int maxNumberofArray(int[] input) {
		int max = input[0];
		for (int index = 0; index < input.length; index++) {
			if (input[index] > max)
				max = input[index];
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxNumberofArray maxnumberofarray = new MaxNumberofArray();
		int[] input = { 1, 11, 44, 23, 55, 99, 23 };
		System.out.println("Maximum number in the given array is:" + maxnumberofarray.maxNumberofArray(input));
	}

}
