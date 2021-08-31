/*Assignment - 22 : 25th Aug'2021

Program 1 : Find total digits in a given string.
String str = "Te1ch2no3cr4ed3it4s" 
output : 6

Program 2 : Find sum of all the digits in a given string
String str = "Te11ch2no3cr4edi2ts" 
output : 13*/

package amol_Vyas;

public class Assignment_22 {

	int getTotalDigitsFromNumber(String input) {
		int countDigit = 0;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				countDigit++;
			}
		}
		return countDigit;
	}

	int getSumOfTotalDigits(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				sum += Character.getNumericValue(input.charAt(index));
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		String input = "Te1ch2no3cr4ed3it4s";
		String input1 = "Te11ch2no3cr4edi2ts";
		Assignment_22 assignment_22 = new Assignment_22();
		System.out.println(
				"Total digits in a '" + input + "' string is " + assignment_22.getTotalDigitsFromNumber(input));
		System.out.println(
				"Sum of all the digits in a '" + input1 + "' string is " + assignment_22.getSumOfTotalDigits(input1));
	}
}
