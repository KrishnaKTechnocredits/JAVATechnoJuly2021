/*
 Program 1: Remove multiple occurrence of characters from given string.

input : "technocredits"
output : technordis

Program 2: Remove all occurrence of duplicate character from given string.
input : "technocredits"
output : "hnordis"
 */
package umakant;

public class Assignment42 {

	String removeMultipleOcurenceOfCharacter(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == index)
				output += ch;
		}
		return output;
	}

	String removeDuplicateCharacter(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch))
				output += ch;
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment42 assignment = new Assignment42();
		System.out.println(assignment.removeMultipleOcurenceOfCharacter("technocredits"));
		System.out.println(assignment.removeDuplicateCharacter("technocredits"));
	}

}
