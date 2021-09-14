/*
 program 1 : place 0 after the triple which in sequence.

input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99}; // 11 + 3 = 14
output = [1,3,4,5,0,7,3,9,10,11,0,14,44,67,1,2,3,0,99];

		 
program 2 : place sum of triple after each triple which in sequence.

input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
output = [1,3,4,5,12,7,3,9,10,11,30,14,44,67,1,2,3,6,99];
		 

program 3 : find first non repeating vowel character from given string.
input : aeapquawrpti
output : u
 */

package sushant;

public class Assignment34_3 {

	void findNonRepeatingVowel(String str) {
		char output = ' ';
		while (str.length() > 0) {
			char ch = str.charAt(0);
			int originalLength = str.length();
			str = str.replace(String.valueOf(ch), "");
			int newLength = str.length();

			if (originalLength - newLength == 1)
				if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
						|| ch == 'u' || ch == 'U') {
					output = ch;
					break;
				}

		}
		System.out.println("The first non-repeating vowel is " + output);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment34_3 assignment34_3 = new Assignment34_3();
		String str = "aeapquawerpti";
		System.out.println("Input string is " + str);
		assignment34_3.findNonRepeatingVowel(str);

	}

}
