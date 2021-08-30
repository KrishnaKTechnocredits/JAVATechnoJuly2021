package parthav.parthavD_Assignment24;

import java.util.Scanner;

public class CountVowelsInString {

	int getVowelsCountInString(String inputStr) {
		inputStr = inputStr.toLowerCase();
		int countOfVowels = 0;

		for (int index = 0; index < inputStr.length(); index++) {
			switch (inputStr.charAt(index)) {
			case 'a':
				if (index == inputStr.indexOf('a'))
					countOfVowels++;
				break;
			case 'e':
				if (index == inputStr.indexOf('e'))
					countOfVowels++;
				break;
			case 'i':
				if (index == inputStr.indexOf('i'))
					countOfVowels++;

				break;
			case 'o':
				if (index == inputStr.indexOf('o'))
					countOfVowels++;
				break;
			case 'u':
				if (index == inputStr.indexOf('u'))
					countOfVowels++;
				break;
			default:
				continue;

			}

		}

		return countOfVowels;
	}

	public static void main(String[] args) {
		CountVowelsInString newObject = new CountVowelsInString();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string in which you want to find the count of vowels: ");
		String inputStr = sc.next();
		System.out.println(
				"The count of vowels in the string " + inputStr + " is " + newObject.getVowelsCountInString(inputStr));
		System.out.println("Enter a string in which you want to find the count of vowels: ");
		inputStr = sc.next();
		newObject.getVowelsCountInString(inputStr);
		System.out.println(
				"The count of vowels in the string " + inputStr + " is " + newObject.getVowelsCountInString(inputStr));
		sc.close();
		
	}

}
