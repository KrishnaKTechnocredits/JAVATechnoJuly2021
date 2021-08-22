package prajwal;

import java.util.Scanner;

public class Program2 {

	int getCharFrequency(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch)
				count++;
		}
		System.out.println(ch + " -> " + count);
		return count;
	}

	void getAllCharFrequencyInString(String str) {
		for (int index = 0; index < str.length(); index++) {
			if (index == str.indexOf(str.charAt(index)))
				getCharFrequency(str, str.charAt(index));
		}
	}

	public static void main(String[] args) {
		Program2 program2 = new Program2();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a word: ");
		String str = scanner.next();

		System.out.println("Frequency of each character in '" + str + "' is: ");
		program2.getAllCharFrequencyInString(str);
		scanner.close();
	}
} 