package umakant;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment24 {
	char[] getNumberOfVowels(String input) {
		int aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = Character.toUpperCase(input.charAt(index));
			if (ch == 'A')
				aCount = 1;
			else if (ch == 'E')
				eCount = 1;
			else if (ch == 'I')
				iCount = 1;
			else if (ch == 'O')
				oCount = 1;
			else if (ch == 'U')
				uCount = 1;
		}
		char[] output = new char[aCount + eCount + iCount + oCount + uCount];
		int index = 0;
		if (aCount == 1)
			output[index++] = 'a';
		if (eCount == 1)
			output[index++] = 'e';
		if (iCount == 1)
			output[index++] = 'i';
		if (oCount == 1)
			output[index++] = 'o';
		if (uCount == 1)
			output[index++] = 'u';
		return output;
	}

	void showMaxRepeatingWord(String input) {
		String[] words = input.split(" ");
		int[] frequency = new int[words.length];
		for (int index = 0; index < words.length - 1; index++) {
			int count = 1;
			for (int innerindex = index + 1; innerindex < words.length; innerindex++) {
				if (words[index].equals(words[innerindex])) {
					count++;
				}
			}
			frequency[index] = count;
		}
		// System.out.println(Arrays.toString(frequency));
		int maxFrequency = 0;
		String word = "";
		for (int index = 0; index < frequency.length; index++) {
			if (frequency[index] > maxFrequency) {
				maxFrequency = frequency[index];
				word = words[index];
			}
		}
		System.out.println(word + "->" + maxFrequency);
	}

	public static void main(String[] args) {
		Assignment24 assignment24 = new Assignment24();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the line to get the max repeated word:");
		String input = scanner.nextLine();
		assignment24.showMaxRepeatingWord(input);
		System.out.println("Enter the String to get the vowel count:");
		input = scanner.next();
		System.out.println("Vowels are : " + Arrays.toString(assignment24.getNumberOfVowels(input)));
		scanner.close();
	}
}
