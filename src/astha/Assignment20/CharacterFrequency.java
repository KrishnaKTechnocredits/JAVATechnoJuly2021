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
		 h -> 1
*/

package astha.Assignment20;

import java.util.Scanner;

public class CharacterFrequency {

	int getCharFrequency(String input, char target) {
		String userInput = input.toLowerCase();
		int frequency = 0;
		for (int index = 0; index < input.length(); index++) {
			if (userInput.charAt(index) == target)
				frequency++;
		}
		return frequency;

	}

	void getCharFrequencyofEachCharacter(String input) {
		System.out.println("Frequency of each character in "+ input);
		String userInput = input.toLowerCase();
			for (int index = 0; index < input.length(); index++) {
			int frequency = getCharFrequency(userInput, userInput.charAt(index));
			if(index == input.indexOf(userInput.charAt(index)))
				System.out.println("The frequency of "+userInput.charAt(index)+ " is : "+frequency);
			}
		}
	
	void findUniqueCharactersInString(String input) {
		System.out.println("Unique characters in the given string "+ input +" : ");
		String userInput = input.toLowerCase();
		for (int index = 0; index < input.length(); index++) {
			if(input.indexOf(userInput.charAt(index)) == userInput.lastIndexOf(userInput.charAt(index)))
				System.out.println(userInput.charAt(index));
		}
	}
	
	void findDuplicateCharactersInString(String input) {
		System.out.println("Duplicate characters in the given string : "+ input +" : ");
		String userInput = input.toLowerCase();
		for (int index = 0; index < input.length(); index++) {
			int frequency = getCharFrequency(userInput, userInput.charAt(index));
			if(userInput.indexOf(userInput.charAt(index)) != userInput.lastIndexOf(userInput.charAt(index)))
				if(index == userInput.indexOf(userInput.charAt(index)))
				System.out.println(userInput.charAt(index)+ " > " +frequency );
		}
	}

	public static void main(String[] args) {
		CharacterFrequency characterFrequency = new CharacterFrequency();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input string");
		String input = scanner.nextLine();
		System.out.println("Enter the target character");
		char target = scanner.next().charAt(0);
		scanner.close();
		System.out.println("The frequency of "+ target +" in " + input +" is "+characterFrequency.getCharFrequency(input, target));
		characterFrequency.getCharFrequencyofEachCharacter(input);
		characterFrequency.findUniqueCharactersInString(input);
		characterFrequency.findDuplicateCharactersInString(input);
	}
}