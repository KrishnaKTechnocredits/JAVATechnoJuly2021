package arti_G_Assignment_22;

import java.util.Scanner;

/*Assignment - 22 : 25th Aug'2021

Program 1 : Find total digits in a given string.
String str = "Te1ch2no3cr4ed3it4s" 
output : 6

Program 2 : Find sum of all the digits in a given string
String str = "Te11ch2no3cr4edi2ts" 
output : 13*/
public class CharacterClassMethods {

	// 1 program
	int countNumericDigit(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				count++;
			}
		}
		return count;
	}

	// 2 program
	int sumOfAllDigit(String str1) {
		int sum = 0;
		for (int index = 0; index < str1.length(); index++) {
			char ch = str1.charAt(index);
			if (Character.isDigit(ch)) {
				sum += Character.getNumericValue(ch);
			}
		}
		return sum;

	}

	// Input ="Te1ch2no3cr4ed3it4s" I want to count for Uppercase letter(Just for
	// Practice)
	int upperCaseLetter(String str2) {
		int count = 0;
		for (int index = 0; index < str2.length(); index++) {
			char ch = str2.charAt(index);
			if (Character.isUpperCase(ch)) {
				count++;
			}
			
		}

		return count;
	}

	// Input ="Te1ch2no3cr4ed3it4s" I want to count for Lowercase letter(Just for
	// Practice)
	int lowerCaseLetter(String str3) {
		int count = 0;
		for (int index = 0; index < str3.length(); index++) {
			char ch = str3.charAt(index);
			if (Character.isLowerCase(ch))
				
			count++;
		}
		return count;

	}

	public static void main(String[] args) {
		CharacterClassMethods characterClassMethods = new CharacterClassMethods();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = scanner.nextLine();
		System.out.println("Total digits in a given string :");
		System.out.println(characterClassMethods.countNumericDigit(str));

		System.out.println("Enter the String :");
		String str1 = scanner.nextLine();
		System.out.println("Sum of all the digits in a given string :");
		System.out.println(characterClassMethods.sumOfAllDigit(str1));

		System.out.println("Enter the String :");
		String str2 = scanner.nextLine();
		System.out.println("Upper case letters in a given string :");
		System.out.println(characterClassMethods.upperCaseLetter(str2));

		System.out.println("Enter the String :");
		String str3 = scanner.nextLine();
		System.out.println("Lower case letters in a given string :");
		System.out.println(characterClassMethods.lowerCaseLetter(str3));
	}
}
