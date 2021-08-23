package arti_G_Assignment20;

import java.util.Scanner;

/*Assignment-20 : 21st Aug'2021

Program 1: find frequency of given character from user defined string.
use scanner class to take word and character from user.
input : word -> technocredits
        ch -> e
output : e -> 2

Note : We dont have any method to take character from String. 
Solution : char ch = scanner.next().charAt(0); will help to capture character given by user.		
Explanation : scanner.next() returns String and on that string we are asking for first character using charAt(0) method.

program 2: Find frequency of each character from user defined string.
input : word -> hello
output : h -> 1
         e -> 1
         l -> 2
         o -> 1

program 3: print unique characters from user defined string.
input : word -> aakanksha
output : n
         s
         h

program 4 : print duplicate characters with their frequency from user defined string.
input : word -> aakanksha
output : a -> 4
         k -> 2
		 n -> 1
		 s -> 1
		 h -> 1*/
public class CountFrequency {

	int getFrequencyOfGivenChar(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch) {
				count++;
			}
		}
		System.out.println("Frequency of " + ch + " in " + input + " is " + count);
		return count;
	}

	int getFrequencyOfEachChar(String input) {
		int frequency = 0;
		for (int index = 0; index < input.length(); index++) {
			if (index == input.indexOf(input.charAt(index))) {
				frequency = getFrequencyOfGivenChar(input, input.charAt(index));
			}
		}

		return frequency;
	}

	void getFrequencyOfUniqueChar(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch))
				getFrequencyOfGivenChar(input, ch);
		}
	}

	void getFrequencyOfDuplicateChar(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.lastIndexOf(ch) > input.indexOf(ch)) {
				if (index == input.indexOf(ch)) {
					getFrequencyOfGivenChar(input, ch);
				}
			}
		}
	}

	public static void main(String[] args) {
		CountFrequency CountFrequency = new CountFrequency();
		Scanner scanner = new Scanner(System.in);

		System.out.println("---------------Frequency of Given Character--------------------");
		System.out.println("Enter the String :");
		String arr = scanner.next();
		System.out.println("Enter the character :");
		char ch = scanner.next().charAt(0);
		System.out.println(CountFrequency.getFrequencyOfGivenChar(arr, ch));

		System.out.println("---------------Frequency of Each Character--------------------");
		System.out.println("Enter the String :");
		String input = scanner.next();
		CountFrequency.getFrequencyOfEachChar(input);

		System.out.println("--------------Frequency of Unique Characters---------------------");
		System.out.println("Enter the String :");
		String input1 = scanner.next();
		CountFrequency.getFrequencyOfUniqueChar(input1);

		System.out.println("----------------Frequency of Duplicate Characters-------------------");
		System.out.println("Enter the String :");
		String input2 = scanner.next();
		CountFrequency.getFrequencyOfDuplicateChar(input2);
	}
}
