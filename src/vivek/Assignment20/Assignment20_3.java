package vivek.Assignment20;

import java.util.Scanner;

public class Assignment20_3 {

	void charFrequency(String word) {
		for (int index = 0; index < word.length(); index++) {
			if (word.indexOf(word.charAt(index)) == word.lastIndexOf(word.charAt(index)))
				System.out.println(word.charAt(index));
		}
	}

	public static void main(String[] args) {
		Assignment20_3 assignment20_3 = new Assignment20_3();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input word");
		String inputWord = scanner.next();
		assignment20_3.charFrequency(inputWord);
	}
}
