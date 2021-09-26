package kalpesh;

import java.util.Scanner;

public class Assignment_24_Program_1 {
	void getVowelsCount(String str) {
		String vowels = "";
		int count[] = new int[5];
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == 'a' && count[0] == 0) {
				vowels += "a ";
				count[0]++;
			}
			if (ch == 'e' && count[1] == 0) {
				vowels += "e ";
				count[1]++;
			}
			if (ch == 'o' && count[2] == 0) {
				vowels += "o ";
				count[2]++;
			}
			if (ch == 'i' && count[3] == 0) {
				vowels += "i ";
				count[3]++;
			}
			if (ch == 'u' && count[4] == 0) {
				vowels += "u ";
				count[4]++;
			}
		}
		System.out.println("The vowels in a string are " + vowels);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string-");
		String str = scanner.next();
		Assignment_24_Program_1 program_1 = new Assignment_24_Program_1();
		program_1.getVowelsCount(str);
		scanner.close();
	}
}

/*
 * Assignment - 24 : 28th Aug'2021 Program 1: Java Program to Count the Number
 * of Vowels in user defined string. 
 * Input : technocredits
 *  output : vowels are e, o, i
 */
