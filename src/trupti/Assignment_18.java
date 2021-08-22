package trupti;

import java.util.Arrays;

public class Assignment_18 {

	String[] reverseStringArray(String[] str) {
		for (int index = 0; index < str.length; index++) {
			str[index] = getReverseString(str[index]);
		}
		return str;
	}

	String getReverseString(String str) {
		String output = "";
		for (int index = str.length() - 1; index >= 0; index--) {
			output += str.charAt(index); // string + (anything will be always string
		}
		return output;
	}

	public static void main(String[] arg) {
		Assignment_18 reverseVar = new Assignment_18();
		String[] str = { "Technocredits", "Trupti", "Mandar", "Manik" };
	
		 /* String[] input = reverseVar.reverseStringArray(str); 
		 * for (int index = 0;index < str.length; index++) {
		 *  System.out.println(str[index]);
		 *  }
		 */ // you can useabove method to display but if we want o/p in array form then must
			// use Array.toString(output) method.
		System.out.println(Arrays.toString(reverseVar.reverseStringArray(str)));
	}
}
