/*Assignment 20 [program 3: print unique characters from user defined string.] DATE: 08/22
input : word -> aakanksha
output : n
         s
         h*/
package deepak.Assignment_20;

import java.util.Scanner;

public class UniqueChars {

	int getCharFrequency(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		} // if(count==1)
		System.out.println(ch);
		return count;
	}

	void getUniqueCharFrequency(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
				getCharFrequency(str, str.charAt(i));
			}
		}
	}

	void inputByUser() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = input.next();
		System.out.println("Unique Characters in string are: ");
		getUniqueCharFrequency(str);
	}

	public static void main(String[] args) {
		UniqueChars obj = new UniqueChars();
		// System.out.println("Unique Characters in string are ");
		obj.inputByUser();
	}
}
