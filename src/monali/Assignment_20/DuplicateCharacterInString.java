package monali.Assignment_20;

import java.util.Scanner;

public class DuplicateCharacterInString {

	int getCharCount(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch)
				count++;
		}
		return count;
	}

	void printCharFreq(String input) {
		int count1 = 0;
		for (int index = 0; index < input.length(); index++) {
			if (index == input.indexOf(input.charAt(index))) {
				count1 = getCharCount(input, input.charAt(index));
			}
			if (count1 > 1) {
				System.out.println("Duplicate character in string : " + input + " " + input.charAt(index)
						+ " and count is : " + count1);
			}

		}
	}

	public static void main(String[] args) {
		DuplicateCharacterInString duplicateChar = new DuplicateCharacterInString();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.next();
		duplicateChar.printCharFreq(str);

	}
}
