//Program to find minimum number from given array.
package shreya;

public class MinNumberInArray {

	int getMinNoFromArray(int[] num) {
		int min = num[0];
		for (int i = 1; i < num.length; i++) {
			if (num[i] < min)
				min = num[i];
		}
		return min;
	}

	public static void main(String[] args) {
		int[] input = { 1, 11, 44, 23, 55, 99, 23 };
		MinNumberInArray minNumberInArray = new MinNumberInArray();
		System.out.println("Minimum number from an array is " + minNumberInArray.getMinNoFromArray(input));
	}
}
