package madhavi;

import java.util.Scanner;

public class Assignment_20_3 {
	int getCharCount(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch) {
				count++;
			}
		}
		return count;
	}

	void getuniqueCharsfromString(String input) {
		for (int index = 0; index < input.length(); index++) {
			if (getCharCount(input, input.charAt(index)) == 1) {
				System.out.println(input.charAt(index));
			}
		}
	}

	public static void main(String[] args) {
		Assignment_20_3 assignment_20_3 = new Assignment_20_3();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Word");
		String word = scanner.next();
		assignment_20_3.getuniqueCharsfromString(word);
		scanner.close();

	}

}
