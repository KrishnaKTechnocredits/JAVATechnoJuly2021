//Assignment 22:

package parthav.parthavD_Assignment22;

public class CharOperationsInString {

	int getDigitCountInString(String inputStr) {
		int digitCount = 0;

		for (int index = 0; index < inputStr.length(); index++) {
			if (Character.isDigit(inputStr.charAt(index)))
				digitCount++;

		}
		return digitCount;
	}

	int getSumOfDigitsInString(String inputStr) {
		int sum = 0;

		for (int index = 0; index < inputStr.length(); index++) {
			if (Character.isDigit(inputStr.charAt(index))) {
				sum += Character.getNumericValue(inputStr.charAt(index));
			}

		}
		return sum;
	}

	public static void main(String[] args) {
		CharOperationsInString newObject = new CharOperationsInString();
		String str1 = "Te1ch2no3cr4ed3it4s";
		System.out.println("The total digits in the string: " + str1 + " is " + newObject.getDigitCountInString(str1));
		String str2 = "Te11ch2no3cr4edi2ts";
		System.out.println(
				"The sum of all digits in the string: " + str2 + " is " + newObject.getSumOfDigitsInString(str2));

	}

}
