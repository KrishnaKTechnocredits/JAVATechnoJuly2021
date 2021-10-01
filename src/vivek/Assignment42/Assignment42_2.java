/*Program 2: Remove all occurrence of duplicate character from given string.
input : "technocredits"
output : "hnordis"*/

package vivek.Assignment42;

public class Assignment42_2 {

	static String getStringWithoutDuplicateCharacters(String str) {
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			if (str.indexOf(str.charAt(index)) == str.lastIndexOf(str.charAt(index)))
				output += str.charAt(index);
		}
		return output;
	}

	public static void main(String[] args) {
		String str = "technocredits";
		System.out.println(
				"String without duplicate characters is " + Assignment42_2.getStringWithoutDuplicateCharacters(str));
	}
}
