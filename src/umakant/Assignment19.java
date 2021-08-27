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

package umakant;

import java.util.Scanner;

public class Assignment19 {

	int getNumberOfWords(String input) {
		String[] words = input.split(" ");
		return words.length;
	}

	String getMaximumWord(String input) {
		String[] words = input.split(" ");
		String output = words[0];
		for (int index = 1; index < words.length; index++) {
			if (words[index].length() > output.length())
				output = words[index];
		}
		return output;
	}

	String getMinimumWord(String input) {
		String[] words = input.split(" ");
		String output = words[0];
		for (int index = 1; index < words.length; index++) {
			if (words[index].length() < output.length())
				output = words[index];
		}
		return output;
	}

	int getSumOfAllNumbers(String input) {
		int sum = 0;
		String[] numbers = input.split(" ");
		for (int index = 0; index < numbers.length; index++) {
			sum += Integer.parseInt(numbers[index]);
		}
		return sum;
	}

	public static void main(String[] args) {
		Assignment19 assignment19 = new Assignment19();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the statement:");
		System.out.println("Number of the words in the entered statement is :"
				+ assignment19.getNumberOfWords(scanner.nextLine()));
		System.out.println("Enter the statement:");
		System.out.println("The word whose length is maximum in the entered statement is :"
				+ assignment19.getMaximumWord(scanner.nextLine()));
		System.out.println("Enter the statement:");
		System.out.println("The word whose length is minimum in the entered statement is :"
				+ assignment19.getMinimumWord(scanner.nextLine()));
		System.out.println("Enter the statement:");
		System.out.println("Sum of all the numbers entered in above statement is :"
				+ assignment19.getSumOfAllNumbers(scanner.nextLine()));
	}

}
