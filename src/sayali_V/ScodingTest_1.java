package sayali_V;

public class ScodingTest_1 {

	int findSumOfDigits(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				sum += Character.getNumericValue(ch);
			}
		}
		return sum;
	}

	int getSumOfDigits(String[] input) {
		int sum = 0;
		ScodingTest_1 assignment = new ScodingTest_1();
		for (int index = 0; index < input.length; index++)
			sum = sum + assignment.findSumOfDigits(input[index]);

		System.out.println("sum of all digits in array:" + sum);
		return sum;
	}

	public static void main(String[] args) {
		ScodingTest_1 assignment = new ScodingTest_1();
		String[] input = { "t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8" };
		assignment.getSumOfDigits(input);

	}
}
