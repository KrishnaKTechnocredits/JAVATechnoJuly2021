package arti_G_Assignment19;

import java.util.Scanner;

/*program 1: Find how many words in a given statement.
input = "Hi Techno Credits Hello"
output : 4

program 2: Find maximum word length from given statement.
input = "good morning technocredits hi hello"
output : technocredits

program 3 : Find minimum word length from given statement.
input = "good morning technocredits hi hello"
output : hi

program 4: sum of all numbers in given statement.
input = "10 10 20 30";
output : 70*/

public class StringProgramsBasedOnScannerClass {

	// 1 program
	int getWordCount(String str) {
		String[] input = new String[str.length()];
		input = str.split(" ");
		int output = input.length;
		return output;

	}

	// 2 program
	String maxWordLength(String arr) {
		int max = 0;
		String output = "";
		String[] input = new String[arr.length()];
		input = arr.split(" ");
		for (int index = 0; index <= input.length - 1; index++) {
			if (max < input[index].length()) {
				max = input[index].length();
				output = input[index];

			}
		}
		return output;
	}

	// 3 program
	String minWordLength(String str1) {
		String output = "";
		String[] input = new String[str1.length()];
		input = str1.split(" ");
		int min = input[0].length();
		for (int index = 0; index <= input.length - 1; index++) {
			if (min > input[index].length()) {
				min = input[index].length();
				output = input[index];
			}
		}
		return output;
	}

	// 4 program
	int sumOfNumbers(String num) {
		int sum = 0;
		String[] arr = new String[num.length()];
		arr = num.split(" ");
		int input[] = new int[arr.length];
		for (int index = 0; index <= input.length-1; index++) {
			input[index] = Integer.parseInt(arr[index]);
			sum = sum + input[index];
		}
		return sum;
	}

	public static void main(String[] args) {
		StringProgramsBasedOnScannerClass stringProgramsBasedOnScannerClass = new StringProgramsBasedOnScannerClass();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Count of words :");
		System.out.println("Enter the String: ");
		String str = scanner.nextLine();
		System.out.println(stringProgramsBasedOnScannerClass.getWordCount(str));
		System.out.println("*******************************************");

		System.out.println("Max length of words: ");
		System.out.println("Enter the String: ");
		String arr = scanner.nextLine();
		System.out.println(stringProgramsBasedOnScannerClass.maxWordLength(arr));
		System.out.println("*******************************************");

		System.out.println("Min length of words: ");
		System.out.println("Enter the String: ");
		String str1 = scanner.nextLine();
		System.out.println(stringProgramsBasedOnScannerClass.minWordLength(str1));
		System.out.println("*******************************************");

		System.out.println("Sum of all Numbers: ");
		System.out.println("Enter the String: ");
		String num = scanner.nextLine();
		System.out.println(stringProgramsBasedOnScannerClass.sumOfNumbers(num));
	}

}
