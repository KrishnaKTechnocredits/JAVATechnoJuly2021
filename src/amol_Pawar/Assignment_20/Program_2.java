package amol_Pawar.Assignment_20;

import java.util.Scanner;

public class Program_2 {

	void getFrequencyOfChar(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch) {
				count++;
			}
		}
		System.out.println("In String " + input + " occurance of character " + ch + " is : " + count);
	}

	void getFrequencyOfEachChar(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == index)
				getFrequencyOfChar(input, ch);
		}
	}

	public static void main(String[] args) {
		Program_2 program_2 = new Program_2();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to which frequency of each character need to find ");
		String word = sc.next();
		program_2.getFrequencyOfEachChar(word);
	}
}

/*
 * Program 1: find frequency of given character from user defined string. use
 * scanner class to take word and character from user. input : word ->
 * technocredits ch -> e output : e -> 2
 * 
 * Note : We dont have any method to take character from String. Solution : char
 * ch = scanner.next().charAt(0); will help to capture character given by user.
 * Explanation : scanner.next() returns String and on that string we are asking
 * for first character using charAt(0) method.
 * 
 * program 2: Find frequency of each character from user defined string. input :
 * word -> hello output : h -> 1 e -> 1 l -> 2 o -> 1
 * 
 * program 3: print unique characters from user defined string. input : word ->
 * aakanksha output : n s h
 * 
 * program 4 : print duplicate characters with their frequency from user defined
 * string. input : word -> aakanksha output : a -> 4 k -> 2 n -> 1 s -> 1 h -> 1
 */