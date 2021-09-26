//Program 1 : Reverse all elements of an array at same position  

package bhagyashree;

import java.util.Arrays;

public class Assignment18 {

	String getReverseString(String input) {
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			output = output + input.charAt(index);
		}
		return output;

	}

	String[] getReverseStringAtIndex(String[] array) {
		for (int index = 0; index < array.length; index++) {
			array[index] = getReverseString(array[index]);
		}
		return array;
	}

	// Program 2 : Reverse all elements and place it in a reverse order

	String[] getRevereseStringfromLast(String[] array) {
		String[] output = new String[array.length];
		for (int index = 0; index < array.length; index++) {
			output[(array.length - 1) - index] = getReverseString(array[index]);
		}
		return output;
	}

	public static void main(String[] args) {
		String[] giveninput = { "madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav" };
		Assignment18 assignment18 = new Assignment18();
		System.out.println("String after reverse at same position:");
		System.out.println(Arrays.toString(assignment18.getReverseStringAtIndex(giveninput)));

		System.out.println("--------------------------------------------------------------------");

		String[] giveninput1 = { "techno", "credits", "krishna", "harsh" };
		System.out.println("String after reverse and print in reverse order is:");
		System.out.println(Arrays.toString(assignment18.getRevereseStringfromLast(giveninput1)));
	}

}
