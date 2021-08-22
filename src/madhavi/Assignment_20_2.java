package madhavi;

import java.util.Scanner;

public class Assignment_20_2 {
	int getCharCount(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch) {
				count++;
			}
		}
		return count;
	}

	void getCharFrequency(String input) {

		for (int index = 0; index < input.length(); index++) {
			if (index == input.indexOf(input.charAt(index))) {
				System.out.println(input.charAt(index) + "->" + getCharCount(input, input.charAt(index)));
			}
		}
	}

	public static void main(String[] args) {

		Assignment_20_2 assignment_20_2 = new Assignment_20_2();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Word");
		String word = scanner.next();
		assignment_20_2.getCharFrequency(word);
		scanner.close();

	}

}
