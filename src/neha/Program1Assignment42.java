package neha;

/**
 * Program 1: Remove multiple occurrence of characters from given string. input
 * : "technocredits" output : technordis
 */
public class Program1Assignment42 {
	void removeMultipleCharacterOccurrence(String str) {
		StringBuilder sb = new StringBuilder(str);
		int strLength = str.length();
		int i = 0;
		while (i < strLength) {
			char ch = sb.charAt(i); // condition true for unique character or for first occurrence of duplicate
									// characters
			if ((str.indexOf(ch) == str.lastIndexOf(ch)) || (i == str.indexOf(ch)))
				i++;
			else if (i != str.indexOf(ch)) {
				sb.deleteCharAt(i);
				strLength--;
			}
		}
		System.out.println("String '" + str + "' after removing multiple occurrence of duplicates is " + "'"
				+ sb.toString() + "'");
	}

	public static void main(String[] args) {
		Program1Assignment42 program1Assignment42 = new Program1Assignment42();
		String input = "technocredits";
		program1Assignment42.removeMultipleCharacterOccurrence(input);

	}
}
