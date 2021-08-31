/*Program 1: find frequency of given character from user defined string.
use scanner class to take word and character from user.
input : word -> technocredits
        ch -> e
output : e -> 2 */

package akshay;

import java.util.Scanner;

public class CharFrequency {
	
	int getCharFrequency(String input, char ch) {
		int count = 0;
		for(int index = 0; index < input.length(); index++ ) {
			if(input.charAt(index)== ch) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		CharFrequency charfrequency = new CharFrequency();
		//String word = "technocredits";
		System.out.println("Please enter the string:");
		Scanner scanner = new Scanner(System.in);
		String word = scanner.next();
		char ch = word.charAt(1);
		System.out.println("Frequency of char " + ch + " :" +charfrequency.getCharFrequency(word, ch));
		
	}
}
