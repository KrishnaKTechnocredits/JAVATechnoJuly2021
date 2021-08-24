package vivek.Assignment20;

import java.util.Scanner;

public class Assignment20_1 {

	int findFrequency(String word, char ch) {
		int cnt = 0;
		for (int index = 0; index < word.length(); index++) {
			if (word.charAt(index) == ch)
				cnt++;
		}
		return cnt;
	}

	public static void main(String[] args) {
		Assignment20_1 assignment20_1 = new Assignment20_1();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input word");
		String inputWord = scanner.next();
		System.out.println("Enter the character to find its frequency");
		char inputLetter = scanner.next().charAt(0);
		System.out.println("The frequency of the letter is ");
		System.out.println(assignment20_1.findFrequency(inputWord, inputLetter));
	}
}
