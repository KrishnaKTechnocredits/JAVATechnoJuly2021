//Program to find maximum number from a given array.
package shreya;

public class MaxNumberInArray {

	int getMaxNoFromArray(int[] num) {
		int max = num[0];
		for (int i = 1; i < num.length; i++) {
			if (num[i] > max)
				max = num[i];
		}
		return max;
	}

	public static void main(String[] args) {
		int[] input = { 1, 11, 44, 23, 55, 99, 23 };
		MaxNumberInArray maxNumberInArray = new MaxNumberInArray();
		int max1 = maxNumberInArray.getMaxNoFromArray(input);
		System.out.println("Maximum number from an array is " + max1);
	}
}
