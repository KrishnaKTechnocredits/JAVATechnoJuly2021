package avinash.frequencycharacter;

import java.util.Scanner;

public class FrequencyofEachCharacter {

	int getCharcterCount(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch) {
				count++;
			}
		}
		System.out.println("In word " + input + ", freq of: " + ch + " -> " + count);
		return count;
	}

	void printFrequencyofCharacter(String input) {
		for (int index = 0; index < input.length(); index++) {
			if (input.indexOf(input.charAt(index)) == index) {
				getCharcterCount(input, input.charAt(index));
			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrequencyofEachCharacter frequencyofEachCharacter = new FrequencyofEachCharacter();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String:");
		String input = sc.next();
		frequencyofEachCharacter.printFrequencyofCharacter(input);

	}

}
