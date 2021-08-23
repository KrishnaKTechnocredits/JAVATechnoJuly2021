package avinash.frequencycharacter;

import java.util.Scanner;

public class FrequencyofGivenNumber {

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the given string:");
		String str = scanner.next();
		System.out.println("Enter the given character of String:");
		char ch = scanner.next().charAt(0);
		FrequencyofGivenNumber frequencyofGivenNumber = new FrequencyofGivenNumber();
		frequencyofGivenNumber.getCharcterCount(str, ch);

	}

}
