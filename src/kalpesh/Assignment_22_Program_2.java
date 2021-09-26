package kalpesh;

public class Assignment_22_Program_2 {
	static int count = 0;
	static int sum = 0;

	int getSumOfDigitsFromString(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				int number = Character.getNumericValue(ch);
				sum = sum + number;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		String str = "Te11ch2no3cr4edi2ts";
		int answer = new Assignment_22_Program_2().getSumOfDigitsFromString(str);
		System.out.println("The sum of digits in a string is " + answer);
	}
}

/*
 * Program 2 : Find sum of all the digits in a given string String str =
 * "Te11ch2no3cr4edi2ts" output : 13
 */