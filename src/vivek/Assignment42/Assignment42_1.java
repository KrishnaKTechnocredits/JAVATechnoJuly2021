/*Program 1: Remove multiple occurrence of characters from given string.
input : "technocredits"
output : technordis*/

package vivek.Assignment42;

public class Assignment42_1 {

	static String getDistinctCharacterString(String str) {
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			if (str.indexOf(str.charAt(index)) == index)
				output += str.charAt(index);
		}
		return output;
	}

	public static void main(String[] args) {
		String str = "technocredits";
		System.out.println("String with distinct characters is " + Assignment42_1.getDistinctCharacterString(str));
	}
}
