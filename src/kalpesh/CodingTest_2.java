package kalpesh;

public class CodingTest_2 {
	void ConvertAllLowercaseToUppercaseAndUppercaseToLowercase(String str) {
		String input = "";

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isUpperCase(ch)) {
				input = input + Character.toLowerCase(ch);
			} else if (Character.isLowerCase(ch)) {
				input = input + Character.toUpperCase(ch);
			} else
				input = input + ch;
		}
		System.out.println("String : " + input);
	}

	public static void main(String[] args) {
		CodingTest_2 codingtest = new CodingTest_2();
		codingtest.ConvertAllLowercaseToUppercaseAndUppercaseToLowercase("A1ashVi6");
	}

}

/*
 * Programming Test - 2 : 30th Aug 2021
 * 
 * Convert all lowercase to uppercase and uppercase to lowercase in a given
 * string.
 * 
 * Input : A1ashVi6 Output : a1ASHvI6
 */