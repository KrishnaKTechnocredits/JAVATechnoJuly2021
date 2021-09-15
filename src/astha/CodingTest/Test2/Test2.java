/*Programming Test - 2 : 30th Aug 2021

Convert all lowercase to uppercase and uppercase to lowercase in a given string.

Input : A1ashVi6
Output : a1ASHvI6*/

package astha.CodingTest.Test2;

import java.util.Scanner;

public class Test2 {

	String convertCases(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			if ((Character.isUpperCase(input.charAt(index))))
				output += Character.toLowerCase(input.charAt(index));
			else if ((Character.isLowerCase(input.charAt(index))))
				output += Character.toUpperCase(input.charAt(index));
			else
				output += input.charAt(index);
		}
		return output;
	}

	public static void main(String[] args) {
		Test2 test2 = new Test2();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input");
		String input = scanner.next();
		scanner.close();
		System.out.println("Input: " + input);
		System.out.println("Output: "+test2.convertCases(input));
	}
}
