/*
 Program 1: find frequency of given character from user defined string.
use scanner class to take word and character from user.
input : word -> technocredits
        ch -> e
output : e -> 2

Note : We dont have any method to take character from String. 
Solution : char ch = scanner.next().charAt(0); will help to capture character given by user.		
Explanation : scanner.next() returns String and on that string we are asking for first character using charAt(0) method.
 */
package harshada.ArrayScannerClassPrograms;

import java.util.Scanner;

public class Assignment_20_1 {
	
	
	int findLetterFreq(String input, char letter) {
		int count=0;
		for(int index=0; index<input.length(); index++) {
			if(input.charAt(index)==letter)
				count++;	
		}
		return count;	
	}

	public static void main(String args[]) {
		
		Assignment_20_1 assignment_20_1=new Assignment_20_1();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String strInput=scanner.next();
		System.out.println("Enter a character to find its frequency of entered input String : ");
		char ch=scanner.next().charAt(0);
		int freqCount=assignment_20_1.findLetterFreq(strInput, ch);
		System.out.println("Frequency of letter "+ch+" in String "+strInput+ " is = "+freqCount);
		
		
	}
}
