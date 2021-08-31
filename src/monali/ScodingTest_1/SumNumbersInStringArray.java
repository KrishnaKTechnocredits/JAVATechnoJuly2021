package monali.ScodingTest_1;

public class SumNumbersInStringArray {

	int numbersSumInString(String str) {

		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index))) {
				sum += Character.getNumericValue(str.charAt(index));
			}
		}
		return sum;
	}

	int getSumOfAllStringArrayElements(String[] input) {
		int total = 0;
		for (int index = 0; index < input.length; index++) {
			total += numbersSumInString(input[index]);

		}
		return total;
	}

	public static void main(String[] args) {
		SumNumbersInStringArray sumNumInString = new SumNumbersInStringArray();
		String input[] = { "t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8" };
		System.out.println(
				"Sum of numbers present in string array is : " + sumNumInString.getSumOfAllStringArrayElements(input));

	}
}
