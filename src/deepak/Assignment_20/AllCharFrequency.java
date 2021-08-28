/*Assignment 20 [program 2: Find frequency of each character from user defined string.] DATE: 08/21
input : word -> hello
output : h -> 1
         e -> 1
         l -> 2
         o -> 1*/
package deepak.Assignment_20;

import java.util.Scanner;

public class AllCharFrequency {

	int getCharFrequency(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println("Frequency of " + ch + " : " + count);
		return count;
	}

	void getAllCharFrequency(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (i == str.indexOf(str.charAt(i))) {
				getCharFrequency(str, str.charAt(i));
			}
		}
	}

	void inputByUser() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = input.next();
		getAllCharFrequency(str);
	}

	public static void main(String[] args) {
		AllCharFrequency obj = new AllCharFrequency();
		obj.inputByUser();
	}
}
