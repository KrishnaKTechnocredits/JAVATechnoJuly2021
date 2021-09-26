package husain.CodingTest_1;

import java.util.Arrays;

public class ArraySum {

	int calcSum(String str) {
		int sum = 0;

		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index)))
				sum = sum + Character.getNumericValue(str.charAt(index));
		}

		return sum;
	}

	int loopArray(String arr[]) {

		int totalSum = 0;
		for (int index = 0; index < arr.length; index++)
			totalSum += calcSum(arr[index]);

		return totalSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraySum obj = new ArraySum();
		String input[] = { "t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8" };

		System.out.println(
				"The sum of the digits in the given array " + Arrays.toString(input) + " is " + obj.loopArray(input));

	}

}
