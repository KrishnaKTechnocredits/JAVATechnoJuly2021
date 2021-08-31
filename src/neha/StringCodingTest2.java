package neha;

/*Programming Test - 2 : 30th Aug 2021
Convert all lowercase to uppercase and uppercase to lowercase in a given string.
Input : A1ashVi6
Output : a1ASHvI6*/
public class StringCodingTest2 {
	String convertStringCase(String strInput) {
		String convStr = "";
		for (int index = 0; index < strInput.length(); index++) {
			char ch = strInput.charAt(index);
			if (Character.isLowerCase(ch))
				ch = Character.toUpperCase(ch);
			else if (Character.isUpperCase(ch))
				ch = Character.toLowerCase(ch);
			convStr += ch;

		}
		return convStr;
	}

	public static void main(String[] args) {
		StringCodingTest2 stringCodingTest2 = new StringCodingTest2();
		String input = "A1ashVi6";
		System.out.println("String after conversion is: " + stringCodingTest2.convertStringCase(input));
	}
}
