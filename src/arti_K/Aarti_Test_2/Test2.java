/*  Convert all lowercase to uppercase and uppercase to lowercase in a given string.

Input : A1ashVi6
Output : a1ASHvI6
 */

package arti_K.Aarti_Test_2;

public class Test2 {

	void convertChar(String str) {
		String input = "";

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);

			if (Character.isUpperCase(ch))
				input = input + Character.toLowerCase(ch);
			else if (Character.isLowerCase(ch))
				input = input + Character.toUpperCase(ch);
			else
				input = input + ch;
		}
		System.out.println("String after Conversions : " + input);
	}

	public static void main(String[] args) {
		Test2 t = new Test2();
		t.convertChar("A1ashVi6");
	}
}
