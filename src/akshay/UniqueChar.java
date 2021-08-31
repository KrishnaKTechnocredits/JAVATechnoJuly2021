package akshay;

import java.util.Scanner;

public class UniqueChar {
	void getStringFromUser(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch))
				System.out.println("Unique Character is " + input + " : " + ch);
			// getUniqueCharFromString(String input, char ch);
		}
	}

	public static void main(String[] args) {
		UniqueChar uniqueChar = new UniqueChar();
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		uniqueChar.getStringFromUser(word);
	}
}
