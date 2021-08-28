package shyam;

import java.util.Scanner;

public class FrequencyOfCharInString {

	public static void main(String[] args) {
		FrequencyOfCharInString newObject = new FrequencyOfCharInString();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter a String: ");
		String input = scanner.nextLine().toLowerCase();
		System.out.println("Enter a char to know the frequncy in the above string :- ");
		char ch = scanner.nextLine().toLowerCase().charAt(0);
		newObject.getFreqOfGivenCharFromString(input, ch);
		System.out.println("Enter String to get frequency of each character :- ");
		newObject.getFreqOfEachCharFromString(scanner.nextLine().toLowerCase());
		System.out.println("Enter String to get all the unique characters entered :- ");
		newObject.getFreqOfUniqueCharFromString(scanner.nextLine().toLowerCase());
		System.out.println("Enter String to get frequency of duplicate characters :- ");
		newObject.getFreqOfDuplicateCharFromString(scanner.nextLine().toLowerCase());
	}

	void getFreqOfGivenCharFromString(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch) {
				count++;
			}
		}
		System.out.println("The count of Char '" + ch + "' in given string " + input + " is " + count);
	}

	void getFreqOfEachCharFromString(String input) {
		for (int index = 0; index < input.length(); index++) {
			if (index == input.indexOf(input.charAt(index)))
				getFreqOfGivenCharFromString(input, input.charAt(index));
		}
	}

	void getFreqOfUniqueCharFromString(String input) {
		for (int index = 0; index < input.length(); index++) {
			if (input.indexOf(input.charAt(index)) == input.lastIndexOf(input.charAt(index)))
				getFreqOfGivenCharFromString(input, input.charAt(index));
		}
	}

	void getFreqOfDuplicateCharFromString(String input) {
		for (int index = 0; index < input.length(); index++) {
			if (input.lastIndexOf(input.charAt(index)) > input.indexOf(input.charAt(index))) {
				if (index == input.indexOf(input.charAt(index)))
					getFreqOfGivenCharFromString(input, input.charAt(index));
			}
		}
	}
	
}