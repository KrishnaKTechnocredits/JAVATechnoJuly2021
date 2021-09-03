package riten;

public class SumOfDigitInString {

	void sumOfDigit(String input) {
		int sum = 0;
		int digit = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				sum = Character.getNumericValue(ch);
				digit += sum;

			}
		}
		System.out.println("Total digit sum in string is:" + digit);

	}

	public static void main(String[] args) {
		SumOfDigitInString total = new SumOfDigitInString();
		total.sumOfDigit("Te11ch2no3cr4edi2ts");

	}

}
