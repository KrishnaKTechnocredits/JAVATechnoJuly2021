package trupti;

import java.util.Arrays;

public class Assignment_18_1 {

	String[] reverseStringArray(String[] str) {
		String[] output = new String[str.length];
		for (int index = 0; index < str.length; index++) {
			output[(str.length - 1) - index] = getReverseString(str[index]);
		}
		return output;
	}

	String getReverseString(String str) {
		String output = "";
		for (int index = str.length() - 1; index >= 0; index--) {
			output += str.charAt(index); // string + (anything will be always string
		}
		return output;
	}

	/*
	 * public static void main(String[] arg){ Assignment_18 assignment_18 = new
	 * Assignment_18(); String[] str = { "Technocredits", "Trupti", "Mandar","Manik"
	 * }; String[] input = assignment_18.reverseStringArray(str); for (int index =
	 * str.length - 1; index >= 0; index--) { System.out.println(str[index]); } }
	 */
	
	public static void main(String[] arg) {
		Assignment_18_1 assignment_18_1 = new Assignment_18_1();
		String[] str = { "Technocredits", "Trupti", "Mandar", "Manik" };
		System.out.println(Arrays.toString(assignment_18_1.reverseStringArray(str)));
		
	}
}
