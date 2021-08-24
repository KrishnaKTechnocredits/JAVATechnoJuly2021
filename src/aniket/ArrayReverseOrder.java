package aniket;

import java.util.Arrays;

public class ArrayReverseOrder {

	String reverseString(String input) {
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			output += input.charAt(index);
		}
		return output;

	}

	String[] getReverseStringReverseArray(String[] input) {
		String[] output = new String[input.length];
		int count = 0;
		for (int index = input.length - 1; index >= 0; index--) {
			output[count] = reverseString(input[index]);
			count++;
		}
		return output;
	}

	public static void main(String[] args) {

		String[] input = { "techno", "credits", "krishna", "aniket" };
		ArrayReverseOrder arrayreverseorder = new ArrayReverseOrder();
		System.out.println(Arrays.toString(arrayreverseorder.getReverseStringReverseArray(input)));

	}

}
