package kalpesh;

public class SumOfDigitsInString {
	int sumOfDigits(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index)))
				sum += Character.getNumericValue(str.charAt(index));
		}
		return sum;

	}

	int sumOfDigitsInArray(String[] str) {
		int sum = 0;
		for (int index = 0; index < str.length; index++) {
			sum += sumOfDigits(str[index]);
		}
		return sum;
	}

	public static void main(String[] args) {
		SumOfDigitsInString sumofdigitsinstring = new SumOfDigitsInString();
		String[] str = { "t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8" };
		System.out.println(sumofdigitsinstring.sumOfDigitsInArray(str));
	}
}

/*
 * WAP to calculate sum of all the digit available in String array String
 * input[] = {“t2e4c”, “2h7no”, “3h6h2h5”, ”1mk3”, ”k9g8”} int output = 52
 * 
 * Hint: 6+9+16+4+17 = 52
 */
