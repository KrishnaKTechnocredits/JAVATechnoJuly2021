package mratunjay.Assignment_22;

public class Assignment_22 {

	String str = "Te11ch2no3cr4edi2ts";

	void getTotalDigitsInGivingString(String str) {

		int count = 0;
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {

			char ch = str.charAt(index);

			if (Character.isDigit(ch)) {

				sum = sum + Character.getNumericValue(ch);

				count++;

			}
		}

		System.out.println("Number of total digits in given string: " + count);
		System.out.println("Sum of total digits in given string: " + sum);

	}

	public static void main(String[] args) {

		Assignment_22 A_22 = new Assignment_22();
		A_22.getTotalDigitsInGivingString(A_22.str);

	}

}
