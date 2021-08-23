package shantanu.assignment20;

import java.util.Scanner;

public class FrequencyOfGivenCharacter {
	int getFrequencyOfCharacter(String input, char ch) {
		int count = 0;
		for(int index = 0; index < input.length(); index++) {
			if(input.charAt(index) == ch)
				count++;
		}
		return count;
	}
	void displayFrequencyOfCharacter(String input, char ch) {
		System.out.println("Frequency of '"+ch+"' in "+input+" is: "+getFrequencyOfCharacter(input, ch));
	}
	public static void main(String[] args) {
		FrequencyOfGivenCharacter frequencyOfGivenCharacter = new FrequencyOfGivenCharacter();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the word:");
		String input = scanner.next();
		System.out.println("Enter the character:");
		char ch = scanner.next().charAt(0);
		frequencyOfGivenCharacter.displayFrequencyOfCharacter(input, ch);
	}
}
