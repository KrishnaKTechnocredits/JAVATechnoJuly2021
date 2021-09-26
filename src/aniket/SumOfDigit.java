package aniket;

public class SumOfDigit {

	int getSumOfStringDigit(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				sum += Character.getNumericValue(ch);

			}
		}

		return sum;

	}

	int getSumofEachStringDigit(String[] input) {
		int sum = 0;
		for (int index = 0; index < input.length; index++) {
			sum += getSumOfStringDigit(input[index]);

		}

		return sum;

	}

	public static void main(String[] args) {

		String[] input = { "t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8" };
		System.out.println("The sum of digit in given string is :" + new SumOfDigit().getSumofEachStringDigit(input));

	}
}
