/*Program 1: find frequency of given character from user defined string. use
 * scanner class to take word and character from user. input : word ->
 * technocredits ch -> e output : e -> 2*/

package sameer.Assignment_20;

import java.util.Scanner;

public class Program1 {
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
		Program1 program1 = new Program1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String : ");
		String input = sc.next();
		System.out.println("Frequency Of Given Character From User Defined String Is :");
		char ch = sc.next().charAt(0);
		program1.getFrequencyOfChar(input, ch);
	}

}
