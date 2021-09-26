/*
Program 2 : Find sum of all the digits in a given string
String str = "Te11ch2no3cr4edi2ts" 
output : 13*/

package shyam;

public class SumOfDigitsInString {
	
	public static void main(String[] args) {
		String inputString = "Te11ch2no3cr4edi2ts";
		System.out.println("Input String is: " + inputString);
		System.out.println("Sum of degits found in string is: " + new SumOfDigitsInString().getSumOfDigitsInString(inputString));
		
	}

	int getSumOfDigitsInString(String inputString) {
		int Sum = 0;
		
		for (int index = 0; index<inputString.length(); index++) {
			if (Character.isDigit(inputString.charAt(index)))
				Sum += Character.getNumericValue(inputString.charAt(index));
		}

		return Sum;
	}
}
