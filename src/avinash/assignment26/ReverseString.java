package avinash.assignment26;
/*Program : 1 
WAP to print Reverse a given String.
input : This is technocredits
output : stiderconhcet si sihT 
 */

import java.util.Scanner;

public class ReverseString {

	String stringReverse(String input) {
		String rev = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			rev = rev + input.charAt(index);
		}
		return rev;
	}

	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input");
		String input = scanner.nextLine();
		System.out.println("Reverse string is:" + reverseString.stringReverse(input));

	}

}
