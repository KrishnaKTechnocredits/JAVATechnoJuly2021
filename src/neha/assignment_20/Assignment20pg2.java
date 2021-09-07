package neha.assignment_20;

import java.util.Scanner;

/*program 2: Find frequency of each character from user defined string.
input : word -> hello
output : h -> 1
         e -> 1
         l -> 2
         o -> 1*/
public class Assignment20pg2 {
	private int freqOfCharacter(String inputStr, char inputChar) {
		int freq = 0;
		for (int index = 0; index < inputStr.length(); index++) {
			if (inputStr.charAt(index) == inputChar)
				freq++;
		}
		return freq;
	}

	void displayFrequency(String str) {
		System.out.println("Frequency of all characters in given string is: ");
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (index == str.indexOf(ch))
				System.out.println(ch + " -> " + freqOfCharacter(str, ch));
		}

	}

	public static void main(String[] args) {
		Assignment20pg2 assignment20pg2 = new Assignment20pg2();
		System.out.println("Please provide String :");
		assignment20pg2.displayFrequency(new Scanner(System.in).nextLine());

	}
}
