/*Assignment - 24 : 28th Aug'2021
Program 1: Java Program to Count the Number of Vowels in user defined string.
Input : technocredits
output : vowels are e , o, i */

package shraddha.Assignment24;

import java.util.Scanner;

public class CountNumberOfVowelsInString {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to know number of vowels in it :- ");
		String inputString = sc.next();
		CountNumberOfVowelsInString newObject = new CountNumberOfVowelsInString();
		newObject.getVowelsInString(inputString);
	}

	void getVowelsInString(String inputString) {
		inputString.toLowerCase();
		int count = 0;
		for (int index = 0; index < inputString.length(); index++) {
			if (inputString.charAt(index) == 'a' || inputString.charAt(index) == 'e' || inputString.charAt(index) == 'i'
					|| inputString.charAt(index) == 'o' || inputString.charAt(index) == 'u') {
				count++;
				System.out.print(" , "+inputString.charAt(index));
				
			}
		}
		System.out.println();
		if (count != 0)
			System.out.println("There are " + count + " vowels in the above string");
		else
			System.out.println("there are no vowels in this string");
	}
}
