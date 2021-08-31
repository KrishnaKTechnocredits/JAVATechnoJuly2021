package neha.assignment_20;

import java.util.Scanner;

/*Program 1: find frequency of given character from user defined string.
use scanner class to take word and character from user.
input : word -> technocredits
        ch -> e
output : e -> 2*/
public class Assignment20pg1 {
	int freqOfCharacter(String inputStr, char inputChar) {
		int freq = 0;
		for (int index = 0; index < inputStr.length(); index++) {
			if (inputStr.charAt(index) == inputChar)
				freq++;
		}
		return freq;
	}

	public static void main(String[] args) {
		Assignment20pg1 assignment20pg1 = new Assignment20pg1();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please provide String: ");
		String str = scan.nextLine();
		System.out.println("Please provide the character for which frequency need to be calculated: ");
		char ch = scan.next().charAt(0);
		System.out.println("Frequency of the character " + "\'" + ch + "\'" + " in given String " + "\"" + str + "\""
				+ " is: " + assignment20pg1.freqOfCharacter(str, ch));
	}
}
