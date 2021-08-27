package parthav.parthavD_Assignment20;

import java.util.Scanner;

public class FindFrequencyOfEachCharacter {

	void printFrequencyOfEachCharacter(String inputStr) {

		char ch = ' ';

		for (int index = 0; index < inputStr.length(); index++) {
			int frequencyOfCharacter = 0;
			ch = inputStr.charAt(index);
			frequencyOfCharacter = findFrequencyOfEachCharacterInString(inputStr, ch);

			if (inputStr.indexOf(inputStr.charAt(index)) == index)
				System.out.println(ch + " --> " + frequencyOfCharacter);

		}

	}

	int findFrequencyOfEachCharacterInString(String inputStr, char ch) {
		int frequencyOfCharacter = 0;
		for (int innerIndex = 0; innerIndex < inputStr.length(); innerIndex++) {
			if (ch == inputStr.charAt(innerIndex)) {
				frequencyOfCharacter++;
			}
		}

		return frequencyOfCharacter;

	}

}
