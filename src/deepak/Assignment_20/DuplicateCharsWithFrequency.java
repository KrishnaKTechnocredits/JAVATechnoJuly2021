/*Assignment 20 [program 4 : print duplicate characters with their frequency from user defined string.] DATE: 08/22
input : word -> aakanksha
output : a -> 4
         k -> 2*/
package deepak.Assignment_20;

import java.util.Scanner;

public class DuplicateCharsWithFrequency {

	int getCharFrequency(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		} //if(count>1)
		System.out.println(ch + " --> "+count);
		return count;
	}

	void getDuplicateCharFrequency(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.indexOf(str.charAt(i)) != str.lastIndexOf(str.charAt(i))) {
				if (i == str.indexOf(str.charAt(i)))
				getCharFrequency(str, str.charAt(i));
			}		
			
		}
	}

	void inputByUser() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = input.next();
		System.out.println("Duplicate Characters in string are: ");
		getDuplicateCharFrequency(str);
	}

	public static void main(String[] args) {
		DuplicateCharsWithFrequency obj = new DuplicateCharsWithFrequency();
		// System.out.println("Unique Characters in string are ");
		obj.inputByUser();
	}
}
