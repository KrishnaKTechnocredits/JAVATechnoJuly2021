/*Convert all lowercase to uppercase and uppercase to lowercase in a given string.

Input : A1ashVi6
Output : a1ASHvI6*/

package monika;

public class ScodingTest_2 {

	String changeCase(String str) {
		char ch = ' ';
		String str1 = "";

		for (int index = 0; index < str.length(); index++) {
			ch = str.charAt(index);
			if (Character.isDigit(ch))
				str1 += ch;
			else if (Character.isUpperCase(str.charAt(index))) {
				ch = Character.toLowerCase(str.charAt(index));
				str1 += ch;
			} else if (Character.isLowerCase(str.charAt(index))) {
				ch = Character.toUpperCase(str.charAt(index));
				str1 += ch;
			}
		}
		return str1;
	}

	public static void main(String[] args) {
		ScodingTest_2 scodingTest_2 = new ScodingTest_2();
		String input = "A1ashVi6";
		System.out.println(scodingTest_2.changeCase(input));
	}
}
