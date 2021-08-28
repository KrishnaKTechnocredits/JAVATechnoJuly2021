package shantanu.assignment20;

import java.util.Scanner;

public class UniqueCharactersFromString {
	void displayUniqueCharacters(String input) {
		System.out.println("Unique characters:");
		for(int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if(input.indexOf(ch) == input.lastIndexOf(ch))
				System.out.println(ch);
		}
	}
	public static void main(String[] args) {
		UniqueCharactersFromString uniqueCharactersFromString = new UniqueCharactersFromString();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String input = scanner.next();
		uniqueCharactersFromString.displayUniqueCharacters(input);
	}
}
