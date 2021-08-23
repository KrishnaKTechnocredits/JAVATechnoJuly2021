package shweta_Dharmadhikari.reverse_array_element;

import java.util.Arrays;

public class ReverseAllElementOfArray {

	String[] reverseArray(String[] input) {
		String output[] = new String[input.length];
		for (int index = 0; index < input.length; index++) {
			output[index] = getReverseString(input[index]);
		}
		return output;
	}
	
	String getReverseString(String temp) {
		String output = "";
		for (int index = temp.length() - 1; index >= 0; index--) {
			output += temp.charAt(index);
		}
		return output;
	}

	public static void main(String[] args) {
		ReverseAllElementOfArray reverseAllElementOfArray = new ReverseAllElementOfArray();
		String input[] = { "madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav" };
		System.out.println(Arrays.toString(reverseAllElementOfArray.reverseArray(input)));
	}

}
