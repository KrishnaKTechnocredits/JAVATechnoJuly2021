package suruchi.ScodingTest_2;

import java.util.Scanner;

public class CodingTest2 {

	String getSwitchedCaseString(String input) {
		String str = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isLowerCase(ch)) {
				ch = Character.toUpperCase(ch);
				str += ch;
			} else if (Character.isUpperCase(ch)) {
				ch = Character.toLowerCase(ch);
				str += ch;
			} else {
				str += ch;
			}
		}

		return str;
	}

	public static void main(String[] args) {
		CodingTest2 codingTest2 = new CodingTest2();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a word:");
		String output = scanner.next();

		System.out.println(
				"Word with switched case of letters is displayed as: " + codingTest2.getSwitchedCaseString(output));
		
		scanner.close();
	}
}