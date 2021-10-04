package neha;

/**
 * Program 2: Remove all occurrence of duplicate character from given string.
 * input : "technocredits" output : "hnordis"
 */
public class Program2Assignment42 {
	void removeDuplicateCharacters(String str) {
		StringBuilder sb = new StringBuilder(str);
		int strLength = str.length();
		int i = 0;
		while (i < strLength) {
			char ch = sb.charAt(i);
			if (str.indexOf(ch) == str.lastIndexOf(ch))
				i++;
			else {
				sb.deleteCharAt(i);
				strLength--;
			}
		}
		System.out.println("String '" + str + "' after removing all dupliactes is " + "'" + sb.toString() + "'");
	}

	public static void main(String[] args) {
		Program2Assignment42 program2Assignment42 = new Program2Assignment42();
		String input = "technocredits";
		program2Assignment42.removeDuplicateCharacters(input);
	}
}
