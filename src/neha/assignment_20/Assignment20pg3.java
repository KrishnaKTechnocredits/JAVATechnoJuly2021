package neha.assignment_20;

import java.util.Scanner;

/*program 3: print unique characters from user defined string.
input : word -> aakanksha
output : n
         s
         h*/
public class Assignment20pg3 {
	private void findUniqueCharacters(String str) {
		System.out.println("Unique characters in given string are: ");
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (str.indexOf(ch) == str.lastIndexOf(ch))
				System.out.println(ch);
		}

	}

	public static void main(String[] args) {
		Assignment20pg3 assignment20pg3 = new Assignment20pg3();
		System.out.println("Please provide String :");
		assignment20pg3.findUniqueCharacters(new Scanner(System.in).nextLine());

	}
}
