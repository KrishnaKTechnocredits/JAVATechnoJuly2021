/*Program 2: Remove all occurrence of duplicate character from given string.
input : "technocredits"
output : "hnordis"*/
package shalaka.Assignment42;

public class RemoveAllDuplicateChar {
	void removeAllDuplicateChar(String str) {
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (str.indexOf(ch) == str.lastIndexOf(ch)) {
				output += ch;
			}
		}
		System.out.println(
				"Removing all occurrence of duplicate characters from string: " + str + "\nOutput String is:" + output);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "technocredits";
		RemoveAllDuplicateChar removeAllDuplicateChar = new RemoveAllDuplicateChar();
		removeAllDuplicateChar.removeAllDuplicateChar(input);
	}

}
