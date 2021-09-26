/* Convert all lowercase to uppercase and uppercase to lowercase in a given string.
Input : A1ashVi6
Output : a1ASHvI6 */
package somnath;

public class CodingTest_2 {

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
		CodingTest_2 codingTest_2 = new CodingTest_2();
		String str = "A1ashVi6";
		System.out.println("Input String  is: " + str);
		System.out.println("Output String is: " +codingTest_2.getConvertedString(str));
	}
}

