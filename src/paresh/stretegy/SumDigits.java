package paresh.stretegy;

/*Surprise coding test : 26th Aug 2021

WAP to calculate sum of all the digit available in String array
String input[] = {“t2e4c”, “2h7no”, “3h6h2h5”, ”1mk3”, ”k9g8”}
int output = 52

Hint: 6+9+16+4+17 = 52*/

public class SumDigits {
	int sumOfDigits(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index)))
				sum += Character.getNumericValue(input.charAt(index));
		}
		return sum;
	}

	int geSumOfDigitsInArray(String[] input) {
		int totalSum = 0;
		for (int index = 0; index < input.length; index++)
			totalSum += sumOfDigits(input[index]);
		return totalSum;
	}

	public static void main(String[] args) {
		SumDigits sumDigits = new SumDigits();
		String[] input = { "t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8" };
		System.out.println("Sum is: " + sumDigits.geSumOfDigitsInArray(input));

	}

}