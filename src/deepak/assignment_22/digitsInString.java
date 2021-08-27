/*Assignment - 22 : 25th Aug'2021

Program 1 : Find total digits in a given string.
String str = "Te1ch2no3cr4ed3it4s" 
output : 6
*/
package deepak.assignment_22;

import java.util.Scanner;

public class digitsInString {

	int calculateDigits(String str) {
		int digitCnt = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			boolean flag = Character.isDigit(ch);
			if (flag) {
				digitCnt++;
			}
		}
		return digitCnt;
	}

	int getNumberOfDigits() {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		return calculateDigits(str);
	}

	public static void main(String[] args) {
		digitsInString obj = new digitsInString();
		System.out.println("Enter the alphanumeric string: ");
		System.out.println("The number of digits in the string provided is: " + obj.getNumberOfDigits());
	}
}
