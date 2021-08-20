package shraddha;

import java.util.Arrays;

public class ArrayReverseElementsReversePosition {
	public static void main(String[] args) {
		ArrayReverseElementsReversePosition reverseElements = new ArrayReverseElementsReversePosition();
		String[] inputArray = { "Hello", "Reverse", "Elements", "in", "Array", "rEVERSe", "Order" };
		String[] outputArray = new String[inputArray.length];
		System.out.print("Input Array is :- ");
		System.out.println(Arrays.toString(inputArray));
		System.out.println();
		System.out.print("Reverse String Array with Reverse elements Position is :- ");
		int count = inputArray.length - 1;
		for (int index = 0; index < inputArray.length; index++) {
			String reverseString = reverseElements.getReverseString(inputArray[index]);
			outputArray[count] = reverseString;
			count--;
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
