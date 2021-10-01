/*
 * Program 1: Remove multiple occurrence of characters from given string.

input : "technocredits"
output : technordis

Program 2: Remove all occurrence of duplicate character from given string.
input : "technocredits"
output : "hnordis"
 */
package bhagyashree;

public class Assignment42 {

	void removeMultipleOccurence(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			if (input.indexOf(input.charAt(index)) == index) {
				output += input.charAt(index);
			}
		}
		System.out.println("String after removing multiple occurences from given string: " + output);
	}

	void removeAllOccurences(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			if (input.indexOf(input.charAt(index)) == input.lastIndexOf(input.charAt(index))) {
				output += input.charAt(index);
			}
		}
		System.out.println("String after removing all duplicate occurences: " + output);
	}

	public static void main(String[] args) {
		Assignment42 ass42 = new Assignment42();
		ass42.removeMultipleOccurence("technocredits");

		ass42.removeAllOccurences("technocredits");
	}

}
