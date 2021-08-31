package trupti;

import java.util.Scanner;

public class Assignment_24 {

	public static void main(String[] args) {
		Assignment_24 vow = new Assignment_24();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str = in.nextLine();
		System.out.println("vowels count: " + vow.getVowelCount(str));

		System.out.println("============================================");

		Assignment_24 repeat = new Assignment_24();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String arr = sc.nextLine();
		System.out.println("Reapeting word count: " + repeat.getRepeatWordCount(arr));

	}

	int getVowelCount(String str) {
		int vowelCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
					|| str.charAt(i) == 'O' || str.charAt(i) == 'U') {
				vowelCount++;
				System.out.println(str.charAt(i));
			}
		}
		// System.out.println("vowels count is: " +vowelCount);
		return vowelCount;
	}

	int getRepeatWordCount(String arr) {
		String[] s = arr.split(" ");
		int count = 0;
		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i].equals(s[j])) {
					count++;
					// System.out.println(s[i]);
				}
			}
		}
		return count;
	}
}
