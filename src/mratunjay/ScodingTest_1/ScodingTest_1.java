package mratunjay.ScodingTest_1;

public class ScodingTest_1 {

	String[] input = { "t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8" };

	int sum;
	int totalsum = 0;

	void getTheStringFromArrayString(String[] str) {

		for (int index = 0; index < str.length; index++) {

			String input = str[index];

			getTotalSumInGivingString(input);

			totalsum = totalsum + sum;

		}

		System.out.println("Sum of total digits in given string: " + totalsum);

	}

	int getTotalSumInGivingString(String str) {
		sum = 0;
		for (int index = 0; index < str.length(); index++) {

			char ch = str.charAt(index);

			if (Character.isDigit(ch)) {

				sum = sum + Character.getNumericValue(ch);

			}

		}
		return sum;

	}

	public static void main(String[] args) {

		ScodingTest_1 test_1 = new ScodingTest_1();
		test_1.getTheStringFromArrayString(test_1.input);

	}

}
