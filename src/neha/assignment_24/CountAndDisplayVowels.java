package neha.assignment_24;
/*Program 1: Java Program to Count the Number of Vowels in user defined string.
Input : technocredits
output : vowels are e , o, i */

import java.util.Scanner;

public class CountAndDisplayVowels {
	void countAndDisplayVowels(String str) {
		int count = 0;
		Boolean flag = true;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if ((ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
					|| ch == 'u' || ch == 'U') && index == str.indexOf(ch)) {
				count++;
				if (count == 1) {
					System.out.println("Vowels in string are: ");
					System.out.print(ch);
				} else
					System.out.print(", " + ch);

			}
		}
		if (flag)
			System.out.println("\r\nCount of vowels is: " + count);
		else
			System.out.println("\r\nThere are no vowels in user string");
	}

	public static void main(String[] args) {
		CountAndDisplayVowels countAndDisplayVowels = new CountAndDisplayVowels();
		System.out.println("Please enter string: ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		countAndDisplayVowels.countAndDisplayVowels(input);
	}
}
