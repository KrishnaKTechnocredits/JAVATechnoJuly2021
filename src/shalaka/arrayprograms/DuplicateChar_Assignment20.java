package shalaka.ArrayPrograms;

import java.util.Scanner;

public class DuplicateChar_Assignment20 {
	void getCountOfDuplicateChar(String input, char ch) {
		int count = 0;

		for (int index = 0; index < input.length(); index++) {
			if (ch == input.charAt(index))
				count++;
		}
		System.out.println(ch + "->" + count);

	}

	void printDupliateChar(String input) {
		System.out.println("In word " + input + " duplicate characters with frequency are: ");
		for (int index = 0; index < input.length(); index++) {
			if (input.indexOf(input.charAt(index)) != input.lastIndexOf(input.charAt(index))) {
				if (index == input.indexOf(input.charAt(index))) {
					getCountOfDuplicateChar(input, input.charAt(index));
				}
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicateChar_Assignment20 duplicateChar_Assignment20 = new DuplicateChar_Assignment20();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the word");
		String input = scanner.next();
		duplicateChar_Assignment20.printDupliateChar(input);
		scanner.close();
	}

}
