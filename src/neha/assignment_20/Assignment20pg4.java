package neha.assignment_20;

import java.util.Scanner;

/*program 4 : print duplicate characters with their frequency from user defined string.
input : word -> aakanksha
output : a -> 4
         k -> 2
		 n -> 1
		 s -> 1
 h -> 1*/
public class Assignment20pg4 {
	private int freqOfCharacter(String inputStr, char inputChar) {
		int freq = 0;
		for (int index = 0; index < inputStr.length(); index++) {
			if (inputStr.charAt(index) == inputChar)
				freq++;
		}
		return freq;
	}

	void displayDuplicateCharactersWithFreq(String str) {
		System.out.println("Frequency of duplicate characters in given string is: ");
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (str.indexOf(ch) != str.lastIndexOf(ch) && index == str.indexOf(ch))
				System.out.println(ch + " -> " + freqOfCharacter(str, ch));
		}

	}

	public static void main(String[] args) {
		Assignment20pg4 assignment20pg4 = new Assignment20pg4();
		System.out.println("Please provide String :");
		assignment20pg4.displayDuplicateCharactersWithFreq(new Scanner(System.in).nextLine());

	}
}
