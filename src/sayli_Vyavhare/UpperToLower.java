/*Programming Test - 2 : 30th Aug 2021

Convert all lowercase to uppercase and uppercase to lowercase in a given string.

Input : A1ashVi6
Output : a1ASHvI6*/
package sayli_Vyavhare;

public class UpperToLower {

	String getConvertedString(String input) {

		char output = ' ';
		String str = "";
		for (int index = 0; index < input.length(); index++) {

			if (Character.isUpperCase(input.charAt(index))) {
				output = Character.toLowerCase((input.charAt(index)));
				str = str + String.valueOf(output);
			} else {
				output = Character.toUpperCase((input.charAt(index)));
				str = str + String.valueOf(output);
			}
		}
		return str;
	}

	public static void main(String[] args) {
		UpperToLower s1 = new UpperToLower();
		String str = "A1ashVi6";
		System.out.println("Provided String is: " + str);
		System.out.println("Converted String is: " +s1.getConvertedString(str));
	}
}
