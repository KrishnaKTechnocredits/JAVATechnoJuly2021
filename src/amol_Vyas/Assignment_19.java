/*
 program 1: Find how many words in a given statement.
input = "Hi Techno Credits Hello"
output : 4

program 2: Find maximum word length from given statement.
input = "good morning technocredits hi hello";
output : technocredits

program 3 : Find minimum word length from given statement.
input = "good morning technocredits hi hello";
output : hi

program 4: sum of all numbers in given statement.
input = "10 10 20 30";
output : 70
 */

package amol_Vyas;

import java.util.Scanner;

public class Assignment_19 {

	int getWordCount(String input) {
		String[] arr = input.split(" ");
		return arr.length;
	}

	String getMaxWordFromString(String input) {
		String[] arr = input.split(" ");
		String output = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index].length() > output.length()) {
				output = arr[index];
			}
		}
		return output;
	}

	String getMinWordFromString(String input) {
		String[] arr = input.split(" ");
		String output = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index].length() < output.length()) {
				output = arr[index];
			}
		}
		return output;
	}

	int getSumOfGivenNumbersFromString(String input) {
		int sum = 0;
		String[] arr = input.split(" ");
		for (int index = 0; index < arr.length; index++) {
			sum += Integer.parseInt(arr[index]);
		}
		return sum;
	}

	public static void main(String[] args) {
		Assignment_19 assignment_19 = new Assignment_19();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Sentence to know the number of words");
		System.out.println("Count of words in given string is " + assignment_19.getWordCount(scanner.nextLine()));
		System.out.println("Enter Sentence to know the maximum word length");
		System.out.println(
				"Maximum length word in given string is " + assignment_19.getMaxWordFromString(scanner.nextLine()));
		System.out.println("Enter Sentence to know the minimum word length");
		System.out.println(
				"Minimum length word in given string is " + assignment_19.getMinWordFromString(scanner.nextLine()));
		System.out.println("Enter Sentence to know the sum of given number");
		System.out.println("Sum of given number from string is "
				+ assignment_19.getSumOfGivenNumbersFromString(scanner.nextLine()));
	}
}
