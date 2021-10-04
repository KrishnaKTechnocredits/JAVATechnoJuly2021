/*Assignment - 42 : 29th Sep'2021 
Program 1: Remove multiple occurrence of characters from given string.

input : "technocredits"
output : technordis

Program 2: Remove all occurrence of duplicate character from given string.
input : "technocredits"
output : "hnordis"*/

package amol_Vyas;

public class Assignment_42 {

	static void removeMultipleOccurenceOfCharFromString(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			if (input.indexOf(input.charAt(index)) == index)
				output += input.charAt(index);
		}
		System.out.println("Remove multiple occurrence of characters from given '" + input + "' string is " + output);
	}

	static void removeAllOccurenceOfCharFromString(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			if (input.indexOf(input.charAt(index)) == input.lastIndexOf(input.charAt(index)))
				output += input.charAt(index);
		}
		System.out.println("Remove all occurrence of characters from given '" + input + "' string is " + output);
	}

	public static void main(String[] args) {
		Assignment_42.removeMultipleOccurenceOfCharFromString("technocredits");
		Assignment_42.removeAllOccurenceOfCharFromString("technocredits");
	}
}
