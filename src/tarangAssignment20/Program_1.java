/* Assignment-20 : 21st Aug'2021
Program 1: find frequency of given character from user defined string.
use scanner class to take word and character from user.
input : word -> technocredits  	 ch -> e
output : e -> 2
Note : We dont have any method to take character from String.
Solution : char ch = scanner.next().charAt(0); will help to capture character given by user.                          	
Explanation : scanner.next() returns String and on that string we are asking for first character using charAt(0) method.
*/

package tarangAssignment20;

import java.util.Scanner;

public class Program_1 {
	static int count=0;
	
	int freqOfChar(String str, char ch) {
		for(int index=0; index<str.length(); index++) {
			if(str.charAt(index) == ch)
				count ++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scanner.next();
		System.out.println("Enter the character");
		char ch = scanner.next().charAt(0);
		Program_1 program_1 = new Program_1();
		program_1.freqOfChar(str, ch);
		System.out.println("The frequency of " + ch + " character from user defined string " + str + " is " + 
				"" + count);
		scanner.close();
	}
}
