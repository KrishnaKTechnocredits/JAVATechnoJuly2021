package shweta_Dharmadhikari.string_examples;

import java.util.Scanner;

public class CountFrequencyOfCharacter {
	
	int printFreqOfEachChar(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (index == input.indexOf(input.charAt(index)))
				count = getCharCount(input, input.charAt(index));
		}
		return count;

	}

	int getUniqueCharacters(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch))
				getCharCount(input, ch);
		}

		return 0;
	}

	int getDuplicateCharacters(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) < input.lastIndexOf(ch)) {
				if (index == input.indexOf(ch))
					getCharCount(input, ch);
			}
		}
		return 0;
	}
	int getCharCount(String input1, char ch) {

		int count = 0;
		for (int index = 0; index < input1.length(); index++) {
			if (input1.charAt(index) == ch)
				count++;
		}
		System.out.println("Frequency of " + ch + " is :" + count);
		return count;
	}

	public static void main(String[] args) {

		CountFrequencyOfCharacter countFrequencyOfCharacter = new CountFrequencyOfCharacter();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Occurrence of given character" + "\n" + "Enter the string: ");
		String str = scanner.next();
		System.out.println("Enter the character: ");
		char ch = scanner.next().charAt(0);
		countFrequencyOfCharacter.getCharCount(str, ch);

		System.out.println("\nOccurrence of each character in the given string \n Enter the string: ");
		String str1 = scanner.next();
		countFrequencyOfCharacter.printFreqOfEachChar(str1);

		System.out.println("\nUnique character in given string " + "\n" + "Enter the string: ");
		String str2 = scanner.next();
		countFrequencyOfCharacter.getUniqueCharacters(str2);

		System.out.println("\nDuplicate character in given string " + "\n" + "Enter the string: ");
		String str3 = scanner.next();
		countFrequencyOfCharacter.getDuplicateCharacters(str3);
		scanner.close();
	}
}