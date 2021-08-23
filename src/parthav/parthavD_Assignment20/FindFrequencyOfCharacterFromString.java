package parthav.parthavD_Assignment20;

import java.util.Scanner;

public class FindFrequencyOfCharacterFromString {

	void findFrequencyOfCharacterInString(String passedStr, char inputCh) {
		int countOfFrequency = 0;
		for (int index = 0; index < passedStr.length(); index++) {
			if (inputCh == passedStr.charAt(index))
				countOfFrequency++;
		}
		System.out.println("The frequency of the character " + inputCh + " in the string " + passedStr + " is: "
				+ countOfFrequency);

	}

	public static void main(String[] args) {
		System.out.println("----------------------Program1-------------------------------");
		FindFrequencyOfCharacterFromString newObject1 = new FindFrequencyOfCharacterFromString();
		Scanner scObject1 = new Scanner(System.in);
		System.out.println("Enter the string from which you need to find frequency of a character: ");
		String inputString = scObject1.next();
		System.out.println("Enter the character for which you need to find frequency in the above string: ");
		char inputCh = scObject1.next().charAt(0);
		newObject1.findFrequencyOfCharacterInString(inputString, inputCh);

		System.out.println("----------------------Program2-------------------------------");
		FindFrequencyOfEachCharacter newObject2 = new FindFrequencyOfEachCharacter();
		Scanner scObject2 = new Scanner(System.in);
		System.out.println("Enter the string in which you need to find frequency of the characters");
		String inputStr = scObject2.next();
		newObject2.printFrequencyOfEachCharacter(inputStr);

		System.out.println("----------------------Program3-------------------------------");
		FindUniqueCharactersInString newObject3 = new FindUniqueCharactersInString();
		String inputStr1 = "aakanksha";
		newObject3.printUniqueCharactersInString(inputStr1);

		System.out.println("----------------------Program4-------------------------------");
		PrintDuplicateCharactersWithFrequency newObject4 = new PrintDuplicateCharactersWithFrequency();
		String inputStr2 = "aakanksha";
		newObject4.printDuplicateCharacters(inputStr2);

		scObject1.close();
		scObject2.close();
	}

}
