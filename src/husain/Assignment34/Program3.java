/*
 * program 3 : find first non repeating vowel character from given string.
input : aeapquawrpti
output : u

 */
package husain.Assignment34;

public class Program3 {

	void findNonRepeatingVowel(String str) {
		char output = ' ';
		while (str.length() > 0) {
			char ch = str.charAt(0);
			int originalLength = str.length();
			str = str.replace(String.valueOf(ch), "");
			int newLength = str.length();

			if (originalLength - newLength == 1)
				if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
						|| ch == 'u' || ch == 'U') {
					output = ch;
					break;
				}

		}
		System.out.println("The first non-repeating vowel is " + output);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program3 obj = new Program3();
		String str = "aeapquawerpti";
		System.out.println("Input string is " + str);
		obj.findNonRepeatingVowel(str);

	}

}
