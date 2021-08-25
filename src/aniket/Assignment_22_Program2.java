package aniket;

public class Assignment_22_Program2 {
	int sum = 0;

	int getSumOfDigits(String input) {

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				sum += Character.getNumericValue(ch);
			}

		}

		return sum;

	}

	public static void main(String[] args) {

		String str = "Te11ch2no3cr4edi2ts";
		System.out.println("The Sum of digit in given string is "+ new Assignment_22_Program2().getSumOfDigits(str));

	}

}
