/*Assignment - 22 : 25th Aug'2021
Program 2 : Find sum of all the digits in a given string
String str = "Te11ch2no3cr4edi2ts" 
output : 13*/
package deepak.assignment_22;

import java.util.Scanner;

public class sumOfDigitsInString {

	int calculateSumOfDigits(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			boolean flag = Character.isDigit(ch);
			if (flag)
				sum += Character.getNumericValue(ch);
		}
		return sum;
	}

	int getSumOfDigits() {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		return calculateSumOfDigits(str);
	}

	public static void main(String[] args) {
		sumOfDigitsInString obj = new sumOfDigitsInString();
		System.out.println("Enter the alphanumeric string: ");
		System.out.println("The sum of digits in the string provided is: " + obj.getSumOfDigits());
	}
}
