package husain.Assignment19;

import java.util.Scanner;

public class Program1 {

	void captureInput() {
		System.out.println("Please enter a word: ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		System.out.println("Please enter the character for which you want to calculate frequency: ");
		char ch = scanner.next().charAt(0);
		printFrequency(str, ch);

	}

	void printFrequency(String str, char ch) {

		int count = 0;

		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == ch)
				count++;
		}

		System.out.println("The frequency of character " + ch + " is: " + count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program1 freq = new Program1();
		freq.captureInput();

	}

}
