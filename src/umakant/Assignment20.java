package umakant;

import java.util.Scanner;

public class Assignment20 {

	int getFrequencyOfCharacterInString(String input, char character) {
		int frequency = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == character)
				frequency++;
		}
		System.out.println(character + "->" + frequency);
		return frequency;
	}

	void getFrequencyOfEachCharacterInString(String input) {
		for (int index = 0; index < input.length(); index++) {
			if (index == input.indexOf(input.charAt(index)))
				getFrequencyOfCharacterInString(input, input.charAt(index));
		}
	}

	void getUniqueCharactersInString(String input) {
		for (int index = 0; index < input.length(); index++) {
			if (input.indexOf(input.charAt(index)) == input.lastIndexOf(input.charAt(index)))
				System.out.println(input.charAt(index));
		}
	}

	void getDuplicateCharactersInStringWithFrequency(String input) {
		for (int index = 0; index < input.length(); index++) {
			if ((input.indexOf(input.charAt(index)) != input.lastIndexOf(input.charAt(index)))
					&& (index == input.indexOf(input.charAt(index))))
				getFrequencyOfCharacterInString(input, input.charAt(index));
		}
	}

	public static void main(String[] args) {
		Assignment20 assignment20 = new Assignment20();
		Scanner scanner = new Scanner(System.in);
		System.out.println("**********Program1***************");
		System.out.println("Enter the Word:");
		String input = scanner.next();
		System.out.println("Enter the character:");
		char character = scanner.next().charAt(0);
		assignment20.getFrequencyOfCharacterInString(input, character);
		System.out.println("**********Program2***************");
		System.out.println("Enter the word:");
		input = scanner.next();
		assignment20.getFrequencyOfEachCharacterInString(input);
		System.out.println("**********Program3***************");
		System.out.println("Enter the word:");
		input = scanner.next();
		assignment20.getUniqueCharactersInString(input);
		System.out.println("**********Program4***************");
		System.out.println("Enter the word:");
		input = scanner.next();
		assignment20.getDuplicateCharactersInStringWithFrequency(input);
		scanner.close();
	}
}
