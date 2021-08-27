package deven_dc.assign;

import java.util.Scanner;

public class Assignment19_StringScannerClass {
	private static Scanner scanner;

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
		Assignment19_StringScannerClass assignment_19 = new Assignment19_StringScannerClass();
		scanner = new Scanner(System.in);
		System.out.println("Enter Sentence to Find No. of Words");
		System.out.println("Count of Words in Given Sentence is " +assignment_19.getWordCount(scanner.nextLine()));
		System.out.println("Enter Sentence to Find Maximum Word Length");
		System.out.println("Maximum Length Word in Given Sentence is " +assignment_19.getMaxWordFromString(scanner.nextLine()));
		System.out.println("Enter Sentence to Find Minimum Word Length");
		System.out.println("Minimum Length Word in Given Sentence is " +assignment_19.getMinWordFromString(scanner.nextLine()));
		System.out.println("Enter Nos. to Find Sum of Given No.");
		System.out.println("Sum of Given No. from String is " +assignment_19.getSumOfGivenNumbersFromString(scanner.nextLine()));
	}
}