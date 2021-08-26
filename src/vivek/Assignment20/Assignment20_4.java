package vivek.Assignment20;

import java.util.Scanner;

public class Assignment20_4 {

	int findFrequency(String word, char ch) {
		int cnt = 0;
		for (int index = 0; index < word.length(); index++) {
			if (word.charAt(index) == ch)
				cnt++;
		}
		return cnt;
	}

	void charFrequency(String word) {
		for (int index = 0; index < word.length(); index++) {
			if (word.indexOf(word.charAt(index)) != word.lastIndexOf(word.charAt(index))
					&& index == word.indexOf(word.charAt(index)))
				System.out.println(word.charAt(index) + "->" + findFrequency(word, word.charAt(index)));
		}
	}

	public static void main(String[] args) {
		Assignment20_4 assignment20_4 = new Assignment20_4();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input word");
		String inputWord = scanner.next();
		assignment20_4.charFrequency(inputWord);
	}
}
