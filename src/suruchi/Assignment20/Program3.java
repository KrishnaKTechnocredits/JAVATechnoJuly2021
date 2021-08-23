package suruchi.Assignment20;

import java.util.Scanner;

public class Program3 {

	void getUniqueCharInString(String input) {
		for (int index = 0; index < input.length(); index++) {
			if (input.indexOf(input.charAt(index)) == input.lastIndexOf(input.charAt(index)))
				System.out.println(input.charAt(index));
		}
	}

	public static void main(String[] args) {
		Program3 program3 = new Program3();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a word: ");
		String str = scanner.next();

		System.out.println("Unique characters from '" + str + "' are: ");
		program3.getUniqueCharInString(str);

		scanner.close();
	}
}