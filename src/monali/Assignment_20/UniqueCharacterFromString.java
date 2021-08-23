package monali.Assignment_20;

import java.util.Scanner;

public class UniqueCharacterFromString {

	void unqueCharFreq(String str) {

		for (int index1 = 0; index1 < str.length(); index1++) {
			char ch = str.charAt(index1);
			int count = 0;
			for (int index2 = 0; index2 < str.length(); index2++) {
				if (str.charAt(index2) == ch)
					count++;
			}

			if (count == 1)
				System.out.println("Unique characters in string : " + ch + " " + count);
		}
	}

	public static void main(String[] args) {
		UniqueCharacterFromString uniqueChar = new UniqueCharacterFromString();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = scanner.next();
		uniqueChar.unqueCharFreq(str);
		scanner.close();
	}
}
