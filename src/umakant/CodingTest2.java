/*
 Convert all lowercase to uppercase and uppercase to lowercase in a given string.

Input : A1ashVi6
Output : a1ASHvI6
 */

package umakant;

public class CodingTest2 {

	String getCaseChangedSring(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch))
				ch = Character.toLowerCase(ch);
			else if (Character.isLowerCase(ch))
				ch = Character.toUpperCase(ch);
			output += ch;
		}
		return output;
	}

	public static void main(String[] args) {
		System.out.println(new CodingTest2().getCaseChangedSring("A1ashVi6"));
	}
}
