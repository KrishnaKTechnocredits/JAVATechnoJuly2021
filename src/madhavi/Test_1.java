package madhavi;

public class Test_1 {
	int getAllDigits(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				sum += Character.getNumericValue(ch);
			}
		}
		return sum;
	}

	int getSumOfAllDigits(String[] input) {
		int sum = 0;
		for (int index = 0; index < input.length; index++) {
			sum += getAllDigits(input[index]);
		}
		return sum;
	}

	public static void main(String[] args) {
		Test_1 test_1 = new Test_1();
		System.out.println("Print sum of all the digit available in String array :");
		String[] input = { "t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8" };
		System.out.println(test_1.getSumOfAllDigits(input));

	}
}
