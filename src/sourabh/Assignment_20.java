package sourabh;

import java.util.Scanner;

public class Assignment_20 {

	void getFretqOfGivenCharFromString(String input, char ch) {
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
				getFretqOfGivenCharFromString(input, input.charAt(index));
		}
	}

	void getFreqOfUniqueCharFromString(String input) {
		for (int index = 0; index < input.length(); index++) {
			if (input.indexOf(input.charAt(index)) == input.lastIndexOf(input.charAt(index)))
				getFretqOfGivenCharFromString(input, input.charAt(index));
		}
	}

	void getFreqOfDuplicateCharFromString(String input) {
		for (int index = 0; index < input.length(); index++) {
			if (input.lastIndexOf(input.charAt(index)) > input.indexOf(input.charAt(index))) {
				if (index == input.indexOf(input.charAt(index)))
					getFretqOfGivenCharFromString(input, input.charAt(index));
			}
		}
	}

	public static void main(String[] args) {
		Assignment_20 assignment20 = new Assignment_20();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String to get frequency of given char. ");
		String input = scanner.nextLine();
		System.out.println("Enter a char to know the frequency from given string");
		char ch = scanner.nextLine().charAt(0);
		assignment20.getFretqOfGivenCharFromString(input, ch);
		System.out.println("****************************************************");
		System.out.println("Enter String to know frequency of each char.");
		assignment20.getFreqOfEachCharFromString(scanner.nextLine());
		System.out.println("****************************************************");
		System.out.println("Enter String to know frquency unique char.");
		assignment20.getFreqOfUniqueCharFromString(scanner.nextLine());
		System.out.println("****************************************************");
		System.out.println("Enter String to know frequency of duplicate char.");
		assignment20.getFreqOfDuplicateCharFromString(scanner.nextLine());
	}

} 
