/*Program 1: Java Program to Count the Number of Vowels in user defined string.
Input : technocredits
output : vowels are e , o, i 

Program 2 : Max repeating word with its freq.
input : Hi Hello Hi Techno Hello Hi
output : Hi -> 3*/

package shalaka.Assignment24;

import java.util.Scanner;

public class CountTheNoOfvowels {
	void displayNoOfVowels(String countVowel) {
		System.out.print("Vowels are ");
		for (int index = 0; index < countVowel.length(); index++) {
			char ch = countVowel.charAt(index);
			if(index==countVowel.indexOf(ch))
			switch (ch) {
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'I':
			case 'i':
			case 'O':
			case 'o':
			case 'U':
			case 'u':
				System.out.print(ch + ",");
				break;
		//	default:
			//	continue;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Input String");
		String str = scanner.next();
		CountTheNoOfvowels countTheNoOfvowels = new CountTheNoOfvowels();
		countTheNoOfvowels.displayNoOfVowels(str);
		scanner.close();
	}

}
