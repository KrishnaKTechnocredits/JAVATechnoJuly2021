package suruchi.Assignment20;

import java.util.Scanner;

public class Program1 {

	int getCharFrequency(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Program1 program1 = new Program1();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a word: ");
		String stringInput = scanner.next();

		System.out.println("Enter the character you want to check the frequency for: ");
		char ch = scanner.next().charAt(0);

		System.out.println("Frequency of " + ch + " -> " + program1.getCharFrequency(stringInput, ch));
		scanner.close();
	}
}