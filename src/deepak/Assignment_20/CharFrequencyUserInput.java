/*Assignment 20 [Program 1: find frequency of given character from user defined string.] DATE: 08/20
use scanner class to take word and character from user.
input : word -> technocredits
        ch -> e
output : e -> 2*/

package deepak.Assignment_20;

import java.util.Scanner;

public class CharFrequencyUserInput {

	int charFrequency(String str, char ch) {
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (ch == str.charAt(i)) {
				count++;
			}
		}
		System.out.print("Count of Character " + ch + " is: ");
		return count;
	}

	int input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = scanner.next();
		System.out.println("Enter to get the count of Character in the String: ");
		char ch = scanner.next().charAt(0);
		return charFrequency(str, ch);
	}

	public static void main(String[] args) {
		CharFrequencyUserInput obj = new CharFrequencyUserInput();
		System.out.println(obj.input());

	}

}
