package avinash.codingtest;

import java.util.Scanner;

public class ScodingTest2 {
	String getConverted(String input) {
		String str = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch)) {
				str = str + Character.toLowerCase(ch);
			} else if (Character.isLowerCase(ch)) {
				str = str + Character.toUpperCase(ch);
			} else if (Character.isDigit(ch)) {
				str = str + ch;
			}
		}

		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScodingTest2 scodingTest2 = new ScodingTest2();
		System.out.println("Enter the given Input:");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		System.out.println("The output will be: " + scodingTest2.getConverted(str));

	}

}
