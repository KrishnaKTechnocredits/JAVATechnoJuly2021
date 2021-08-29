package suruchi.Assignment25;

import java.util.Scanner;

public class Program1 {

	String getSortedString(String input) {
		String upperCaseChar = "", lowerCaseChar = "", digitChar = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch))
				upperCaseChar += ch;
			else if (Character.isLowerCase(ch))
				lowerCaseChar += ch;
			else if (Character.isDigit(ch))
				digitChar += ch;
		}
		return upperCaseChar + digitChar + lowerCaseChar;
	}

	int getSumOfNumbersInString(String input) {
		String digitChar = "0";
		int sumOfNumbers = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				digitChar += ch;
			} else {
				sumOfNumbers += Integer.parseInt(digitChar);
				digitChar = "0";
			}
		}
		return sumOfNumbers;
	}

	public static void main(String[] args) {
		Program1 program1 = new Program1();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a word:"); 
		String str = scanner.next();
	 
		System.out.println(program1.getSortedString(str));

		System.out.println("Enter another word:");
		String str1 = scanner.next();

		System.out.println("Sum of Numbers in the word is: " + program1.getSumOfNumbersInString(str1));

		scanner.close();
	}
}