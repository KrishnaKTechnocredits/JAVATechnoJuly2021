/*Program 2: Remove all occurrence of duplicate character from given string.
input : "technocredits"
output : "hnordis"*/
package shalaka.Assignment42;

public class RemoveDuplicateOccOfChar {
	void removeAllDuplicateChar(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch)) {
				output += ch;
			}
		}
		System.out.println(
				"Removing all occurrence of duplicate character from: " + input + "\nThe Output String is: " + output);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "technocredits";
		RemoveDuplicateOccOfChar RemoveDuplicateOccOfChar = new RemoveDuplicateOccOfChar();
		RemoveDuplicateOccOfChar.removeAllDuplicateChar(input);
	}

}
