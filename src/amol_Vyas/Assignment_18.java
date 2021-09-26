/*
 Program 1 : Reverse all elements of an array at same position  
String[] input = {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};
output : [ivhdam, ihbrus, ahen, hsednas, tikna, vahbiav]

Note : you can print array content directly using sop(Arrays.toString(output)); toString() method of Arrays class return String. 

Method should take String array and return String array.

Program 2 : Reverse all elements and place it in a reverse order

String[] input = {"techno", "credits", "krishna","harsh"}
output : [hsrah, anhsirk, stiderc, onhcet]

Note : use sop(Arrays.toString(output)) to print the array content.
 */

package amol_Vyas;

import java.util.Arrays;

public class Assignment_18 {

	String getReverseString(String input) {
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			output += input.charAt(index);
		}
		return output;
	}

	String[] getReverseOfArrayAtSamePosition(String[] input) {
		for (int index = 0; index < input.length; index++) {
			input[index] = getReverseString(input[index]);
		}
		return input;
	}

	String[] getReverseElementAtReverseOrder(String[] input) {
		String[] output = new String[input.length];
		for (int index = 0; index < input.length; index++) {
			output[(input.length - 1) - index] = getReverseString(input[index]);
		}
		return output;
	}

	public static void main(String[] args) {
		String[] input = { "madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav" };
		Assignment_18 assignment_18 = new Assignment_18();
		System.out.print("Reverse all elements of an array at same position is ");
		System.out.println(Arrays.toString(assignment_18.getReverseOfArrayAtSamePosition(input)));
		String[] input1 = { "techno", "credits", "krishna", "harsh" };
		System.out.print("Reverse all elements of an array and place it in a reverse order is ");
		System.out.println(Arrays.toString(assignment_18.getReverseElementAtReverseOrder(input1)));
	}
}
