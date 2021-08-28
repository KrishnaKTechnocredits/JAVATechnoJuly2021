//Surprise Coding test 1 26th Aug 2021

package parthav;

public class CalculateSumOfDigitsInStringArray {

	int getSumOfDigitsInStringArray(String[] arr) {
		int sum = 0;

		for (int index = 0; index < arr.length; index++)
			sum += getSumOfDigitsInAString(arr[index]);

		return sum;

	}

	int getSumOfDigitsInAString(String str) {
		int sum = 0;

		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index)))
				sum += Character.getNumericValue(str.charAt(index));
		}

		return sum;

	}

	public static void main(String[] args) {
		String input[] = { "t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8" };
		CalculateSumOfDigitsInStringArray newObject = new CalculateSumOfDigitsInStringArray();
		System.out.println("The sum of all the digits in the passed string array is: "
				+ newObject.getSumOfDigitsInStringArray(input));

	}

}
