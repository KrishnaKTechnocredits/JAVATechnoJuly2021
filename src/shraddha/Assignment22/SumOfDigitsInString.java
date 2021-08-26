/*
Program 2 : Find sum of all the digits in a given string
String str = "Te11ch2no3cr4edi2ts" 
output : 13*/

package shraddha.Assignment22;

public class SumOfDigitsInString {
	public static void main(String[] args) {
		String inputString = "Te1ch2no3cr4ed3it4s";
		System.out.println("Input String is :- " + inputString);
		System.out.println("Sum of digits found in input String is :- "
				+ new SumOfDigitsInString().getSumOfDigitsInString(inputString));
	}

	//method to return sum of all digits in a given String
	int getSumOfDigitsInString(String inputString) {
		int totalDigits = 0;
		for (int index = 0; index < inputString.length(); index++) {
			if (Character.isDigit(inputString.charAt(index)))
				totalDigits += Character.getNumericValue(inputString.charAt(index));
		}
		return totalDigits;
	}
}
