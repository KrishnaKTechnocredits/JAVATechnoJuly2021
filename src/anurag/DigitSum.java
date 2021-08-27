package anurag;

public class DigitSum {

	int sumOfDigit(String str) {
		boolean isDigit = true;

		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			Character ch = str.charAt(i);

			if (isDigit == Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);

			}
		}
		return sum;

	}

	public static void main(String[] args) {
		DigitSum digitsum = new DigitSum();
		String str = "Te11ch2no3cr4edi2ts";
		System.out.println("Sum of digits-" + digitsum.sumOfDigit(str));

	}
}
