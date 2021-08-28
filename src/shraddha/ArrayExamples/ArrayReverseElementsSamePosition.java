package shraddha.ArrayExamples;

import java.util.Arrays;

public class ArrayReverseElementsSamePosition {
	public static void main(String[] args) {
		ArrayReverseElementsSamePosition reverseElements = new ArrayReverseElementsSamePosition();
		String[] inputArray = { "Hello", "Reverse", "Elements", "in", "Array", "SAME", "POsiTIOn" };
		String[] outputArray = new String[inputArray.length];
		System.out.print("Input Array is :- ");
		System.out.println(Arrays.toString(inputArray));
		System.out.println();
		System.out.print("Reverse String Array In Same Position is :- ");
		for (int index = 0; index < inputArray.length; index++) {
			String reverseString = reverseElements.getReverseString(inputArray[index]);
			outputArray[index] = reverseString;
		}
		System.out.println(Arrays.toString(outputArray));
	}

	String getReverseString(String inputString) {
		String reverseString = "";
		for (int index = inputString.length() - 1; index >= 0; index--) {
			reverseString += inputString.charAt(index);
		}
		return reverseString;
	}
}