package monali;

import java.util.Arrays;
/*Program 1 : Reverse all elements of an array at same position  
String[] input = {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};
output : [ivhdam, ihbrus, ahen, hsednas, tikna, vahbiav]

Note : you can print array content directly using sop(Arrays.toString(output)); toString() method of Arrays class return String. 

Method should take String array and return String array.*/

class ReverseStringArray {

	String reverseString(String input) {
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			output = output + input.charAt(index);
		}
		return output;
	}

	String[] getStringReverseArray(String[] input) {

		for (int index = 0; index < input.length; index++) {
			input[index] = reverseString(input[index]);
		}
		return input;
	}

	public static void main(String[] args) {

		ReverseStringArray reverseString = new ReverseStringArray();
		String[] input = { "Technocredits", "Aashvi", "Monali", "Mahi" };
		System.out.println(Arrays.toString(reverseString.getStringReverseArray(input)));
	}
}