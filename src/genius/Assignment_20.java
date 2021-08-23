package genius;

import java.util.Scanner;

public class Assignment_20 {
	
	void getFreqOfGivenCharFromString(String input,char ch) {
		int count=0;
		for(int index=0;index<input.length();index++) {
			if(input.charAt(index) == ch)
				count++;
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
	
	public static void main(String[] args) {
		Assignment_20 assignment_20 = new Assignment_20();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the word :");
		String input = scanner.nextLine();
		System.out.println("Enter any character from the word :");
		char ch = scanner.nextLine().charAt(0);
		assignment_20.getFreqOfGivenCharFromString(input, ch);
		System.out.println("Enter String");
		assignment_20.getFreqOfEachCharFromString(scanner.nextLine());
		System.out.println("Enter String");
		assignment_20.getFreqOfUniqueCharFromString(scanner.nextLine());
		System.out.println("Enter String");
		assignment_20.getFreqOfDuplicateCharFromString(scanner.nextLine());
		
		

	}

}
