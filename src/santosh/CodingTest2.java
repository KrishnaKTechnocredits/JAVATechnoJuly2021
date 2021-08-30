/* Convert all lowercase to uppercase and uppercase to lowercase in a given string.
Input : A1ashVi6
Output : a1ASHvI6*/
package santosh;
public class CodingTest2 {

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
		CodingTest2 codingTest_2 = new CodingTest2();
		String str = "A1ashVi6";
		System.out.println("--------------------------");
		System.out.println("The Input String  is: " + str);
		System.out.println("Output String is: " +codingTest_2.getConvertedString(str));
		System.out.println("--------------------------");
	}
}