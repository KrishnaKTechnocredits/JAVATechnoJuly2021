package suruchi.Assignment20;

import java.util.Scanner;

public class Program4 {

	int getCharFrequency(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch)
				count++;
		}
		if(count % 2 == 0)
			System.out.println(ch + " -> " + count);
		return count;
	}

	void getDuplicateCharFrequency(String str) {
		for (int index = 0; index < str.length(); index++) {
			if (index == str.indexOf(str.charAt(index)))
				getCharFrequency(str, str.charAt(index));
		}
	}

	public static void main(String[] args) {
		Program4 program4 = new Program4();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a word: ");
		String str = scanner.next();

		System.out.println("Duplicate characters with their frequency in '" + str + "' are: ");
		program4.getDuplicateCharFrequency(str);

		scanner.close();
	}
}