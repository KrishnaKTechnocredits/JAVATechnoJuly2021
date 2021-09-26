/*  Assignment-20 : 21st Aug'2021

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

package arti_K.Assignment_20;

import java.util.Scanner;

public class Assignment20usingScanner {

	// Program 1 : Freq of single char
	void findFreqOfSingleChar(String str, char ch) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == ch)
				count++;
		}
		System.out.println("Frequency of charcter " + ch + " in given string " + str + " is " + count + " times.");
	}

	// Program 2 : Freq of each char
	void findFreqOfEachChar(String input) {

		String str = input.toLowerCase();

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);

			if (str.indexOf(ch) == index)
				findFreqOfSingleChar(str, ch);
		}
	}

	// Program 3 : Print unique char
	void findUniqueChar(String input) {
		String str = input.toLowerCase();

		for (int index = 0; index < str.length(); index++) {

			if (str.indexOf(str.charAt(index)) == str.lastIndexOf(str.charAt(index)))
				System.out.println(str.charAt(index) + " is unique char in given string " + str);
		}
	}

	// Program 4 : Print duplicate char
	void findDuplicateChar(String input) {

		String str = input.toLowerCase();

		for (int index = 0; index < str.length(); index++) {

			if (str.indexOf(str.charAt(index)) == index)

				if (str.indexOf(str.charAt(index)) != str.lastIndexOf(str.charAt(index)))
					System.out.println(str.charAt(index) + " is duplicate char in given string " + str);
		}
	}

	public static void main(String[] args) {
		Assignment20usingScanner assign1 = new Assignment20usingScanner();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String name = sc.next();
		char ch = name.charAt(0);
		assign1.findFreqOfSingleChar(name, ch);

		System.out.println("\n-----------------------------------------------------\n");
		System.out.println("Enter String : ");
		String name1 = sc.next();
		assign1.findFreqOfEachChar(name1);

		System.out.println("\n-----------------------------------------------------\n");
		System.out.println("Enter String : ");
		String name2 = sc.next();
		assign1.findUniqueChar(name2);

		System.out.println("\n-----------------------------------------------------\n");
		System.out.println("Enter String : ");
		String name3 = sc.next();
		assign1.findDuplicateChar(name3);
	}
}
