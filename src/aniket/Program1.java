package aniket;

import java.util.Scanner;

public class Program1 {

	void getFrequencyOfChar(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch) {
				count++;
			}
		}
		System.out.println("In String " + input + " occurance of character " + ch + " is : " + count);
	}

	void getFrequencyOfEachChar(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == index)
				getFrequencyOfChar(input, ch);
		}
	}

	public static void main(String[] args) {
		Program1 program_1 = new Program1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String form which want to check occurance of character ");
		String input = sc.next();
		System.out.println("Enter the character to check how many times occcured in string");
		char ch = sc.next().charAt(0);
		program_1.getFrequencyOfChar(input, ch);
	}

}
