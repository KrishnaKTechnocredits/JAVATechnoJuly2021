package avinash.frequencycharacter;

import java.util.Scanner;

public class UniqueCharacter {

	int getCharcterCount(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch) {
				count++;
			}
		}
		System.out.println("In word " + input + ", freq of: " + ch);
		return count;
	}

	void printUniqueCharacter(String input) {
		for (int index = 0; index < input.length(); index++) {
			if (input.indexOf(input.charAt(index)) == input.lastIndexOf(input.charAt(index))) {
				getCharcterCount(input, input.charAt(index));
			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniqueCharacter uniqueCharacter = new UniqueCharacter();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String:");
		String input = sc.next();
		uniqueCharacter.printUniqueCharacter(input);

	}

}
