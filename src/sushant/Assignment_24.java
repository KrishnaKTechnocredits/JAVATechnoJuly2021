/*Assignment - 24 : 28th Aug'2021
Program 1: Java Program to Count the Number of Vowels in user defined string.
Input : technocredits
output : vowels are e , o, i 

Program 2 : Max repeating word with its freq.
input : Hi Hello Hi Techno Hello Hi
output : Hi -> 3*/

package sushant;

import java.util.Scanner;

public class Assignment_24 {

	void getVowelsInString(String input) {
		String str = "";
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (index == input.indexOf(input.charAt(index))) {
				switch (input.charAt(index)) {
				case 'a':
					str += "a ";
					count++;
					break;
				case 'e':
					str += "e ";
					count++;
					break;
				case 'i':
					str += "i ";
					count++;
					break;
				case 'o':
					str += "o ";
					count++;
					break;
				case 'u':
					str += "u ";
					count++;
					break;
				}
			}
		}
		System.out.println("Total vowels in the word are: " + count);
		System.out.println("Vowels in the word are: " + str);
	}

	void getMaxRepeatingWordInString(String input) {
		String[] arr = input.split(" ");
		int count;
		int maxFrequency = 0;
		String maxFreqWord = "";
		for (int index = 0; index < arr.length; index++) {
			count = 0;
			for (int index2 = 0; index2 < arr.length; index2++) {
				if (arr[index].equals(arr[index2])) {
					count++;
				}
				if (maxFrequency < count) {
					maxFrequency = count;
					maxFreqWord = arr[index];
				}
			}
		}
		System.out.println(
				"Maximum repeating word in the string is: " + maxFreqWord + " repeated " + maxFrequency + " times");
	}

	public static void main(String[] args) {
		Assignment_24 assignment_24 = new Assignment_24();

		Scanner scanner = new Scanner(System.in);

		String input = "Hi Hello Hi Techno Hello Hi";
		System.out.println("String is as displayed: " + input);

		System.out.println();
		assignment_24.getMaxRepeatingWordInString(input);

		System.out.println();
		System.out.println("Enter a word:");
		String input2 = scanner.next();

		assignment_24.getVowelsInString(input2);

		scanner.close();
	}
} 