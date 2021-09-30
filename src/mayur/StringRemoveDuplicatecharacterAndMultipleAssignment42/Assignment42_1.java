/*Assignment - 42 : 29th Sep'2021 
Program 1: Remove multiple occurrence of characters from given string.

input : "technocredits"
output : technordis

Program 2: Remove all occurrence of duplicate character from given string.
input : "technocredits"
output : "hnordis"
*/
package mayur.StringRemoveDuplicatecharacterAndMultipleAssignment42;

public class Assignment42_1 {

	void removeMultipleOccurenceOfCharFromString(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == index)
				output += ch;
		}
		System.out.println(
				"Remove all occurrence of duplicate character from given string '" + input + "'string is :- " + output);
	}

	void removeAllOccureenceCharfromString(String str) {
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (str.indexOf(ch) == str.lastIndexOf(ch))
				output += ch;

		}
		System.out.println("Remove all occurrence of characters from given '" + str + "' string is :- " + output);
	}

	public static void main(String[] args) {
		Assignment42_1 assignment42_1 = new Assignment42_1();
		String str = "technocredits";
		assignment42_1.removeMultipleOccurenceOfCharFromString(str);
		assignment42_1.removeAllOccureenceCharfromString(str);

	}
}
