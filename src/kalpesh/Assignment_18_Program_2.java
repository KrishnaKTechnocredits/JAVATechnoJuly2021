package kalpesh;

import java.util.Arrays;

public class Assignment_18_Program_2 {
	String getReverseString(String input) {
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			output = output + input.charAt(index);
		}
		return output;
	}

	String[] getReverseStringReverseArray(String[] input) {
		String[] output = new String[input.length];
		int count = 0;
		for (int index = input.length - 1; index >= 0; index--) {
			output[count] = getReverseString(input[index]);
			count++;
		}
		return output;
	}

	public static void main(String[] args) {
		String[] input = { "techno", "credits", "krishna", "harsh" };
		Assignment_18_Program_2 assignment_18_program_2 = new Assignment_18_Program_2();
		String[] output = assignment_18_program_2.getReverseStringReverseArray(input);
		System.out.println(
				"Reverse all elements of an array " + Arrays.toString(input) + " and place it in the reverse order- ");
		System.out.println("Output:- " + Arrays.toString(output));
	}
}

/*
 * Program 2 : Reverse all elements and place it in a reverse order
 * 
 * String[] input = {"techno", "credits", "krishna","harsh"} output : [hsrah,
 * anhsirk, stiderc, onhcet]
 * 
 * Note : use sop(Arrays.toString(output)) to print the array content.
 */
