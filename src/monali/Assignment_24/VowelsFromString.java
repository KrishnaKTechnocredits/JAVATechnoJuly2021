package monali.Assignment_24;

import java.util.Scanner;

public class VowelsFromString {

	/*
	 * Assignment - 24 : 28th Aug'2021 Program 1: Java Program to Count the Number
	 * of Vowels in user defined string. Input : technocredits output : vowels are e
	 * , o, i
	 */

	void getVowels(String str) {
		String vowel = "";
		for (int index = 0; index < str.length(); index++) {
			switch (str.charAt(index)) {
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U':
				if (vowel.indexOf(str.charAt(index)) == -1)
					vowel += str.charAt(index) + " ";
				break;
			}
		}
		System.out.println("Vowels are : " + vowel);
	}

	String getString() {
		System.out.println("Enter the string : ");
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}

	public static void main(String[] args) {
		VowelsFromString findVowels = new VowelsFromString();
		findVowels.getVowels(findVowels.getString());
	}
}
