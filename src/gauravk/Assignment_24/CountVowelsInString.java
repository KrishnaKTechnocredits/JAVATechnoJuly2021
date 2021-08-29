package gauravk.Assignment_24;

import java.util.Scanner;

/*
 * Assignment - 24 : 28th Aug'2021
Program 1: Java Program to Count the Number of Vowels in user defined string.
Input : technocredits
output : vowels are e , o, i 

Program 2 : Max repeating word with its freq.
input : Hi Hello Hi Techno Hello Hi
output : Hi -> 3
 */
public class CountVowelsInString {
	
	int countingVovelsInString(String s) {
		int vowelCount = 0;
		System.out.print("Vowels found are:");
		for(int i=0; i<s.length(); i++) {
			switch(s.charAt(i)) {
				case 'A':
				case 'a':
				case 'E':
				case 'e':
				case 'I':
				case 'i':
				case 'O':
				case 'o':
				case 'U':
				case 'u':
					vowelCount++;
					if(i == s.indexOf(s.charAt(i)))
						System.out.print("["+s.charAt(i)+"] ");
					break;
				//default : continue;
			}
		}
		return vowelCount;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string of your choice.");
		System.out.println("\nTotal "+new CountVowelsInString().countingVovelsInString(sc.next())+" vowels found.");
	}
}