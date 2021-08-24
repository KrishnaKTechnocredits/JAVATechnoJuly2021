package monali.Assignment_20;

import java.util.Scanner;

public class CharFrequency {

	int getCharCount(String str, char ch) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == ch) {
				count++;
			}
		}
		System.out.println("In word " + str + " frequency of character " + ch + " : " + count);
		return count;
	}

	public static void main(String[] args) {
		CharFrequency charfrequency = new CharFrequency();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String from user: ");
		String str = scanner.next();
		System.out.println("Enter character from user");
		char ch = scanner.next().charAt(0);
		charfrequency.getCharCount(str, ch);
		scanner.close();
	}
}
