package madhavi;

import java.util.Scanner;

public class Assignment_20_1 {

	int getCharCount(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {

		Assignment_20_1 assignment_20_1 = new Assignment_20_1();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Word");
		String word = scanner.next();

		System.out.println("Enter character");
		char c = scanner.next().charAt(0);
		System.out.println(assignment_20_1.getCharCount(word, c));

		scanner.close();
	}

}
