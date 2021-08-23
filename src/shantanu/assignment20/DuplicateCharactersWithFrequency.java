package shantanu.assignment20;

import java.util.Scanner;

public class DuplicateCharactersWithFrequency {
	int getFrequencyOfCharacter(String input, char ch) {
		int count = 0;
		for(int index = 0; index < input.length(); index++) {
			if(input.charAt(index) == ch)
				count++;
		}
		return count;
	}
	void displayDuplicateCharactersAndFrequency(String input) {
		for(int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if(index == input.indexOf(ch)) {
				int freq = getFrequencyOfCharacter(input,ch);
				if(freq > 1)
					System.out.println("Frequency of '"+ch+"' is: "+freq);
			}
		}
	}
	public static void main(String[] args) {
		DuplicateCharactersWithFrequency duplicateCharactersWithFrequency = new DuplicateCharactersWithFrequency();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String input = scanner.next();
		duplicateCharactersWithFrequency.displayDuplicateCharactersAndFrequency(input);
		
	}
}
