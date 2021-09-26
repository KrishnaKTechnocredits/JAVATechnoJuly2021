package avinash.frequencycharacter;

import java.util.Scanner;

public class DuplicateCharacterString {

	int getCharcterCount(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch) {
				count++;
			}
		}
		System.out.println("In word " + input + ", freq of: " + ch + " -> " + count);
		return count;
	}

	void printDuplicateCharacter(String input) {
		for (int index = 0; index < input.length(); index++) {
			if (input.lastIndexOf(input.charAt(index)) != input.indexOf(input.charAt(index))) {
				if (input.indexOf(input.charAt(index)) == index) {
					getCharcterCount(input, input.charAt(index));
				}
			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicateCharacterString duplicateCharacterString = new DuplicateCharacterString();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String:");
		String input = sc.next();
		duplicateCharacterString.printDuplicateCharacter(input);

	}

}
