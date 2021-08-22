package parthav.parthavD_Assignment18;

import java.util.Arrays;

public class ReverseElementsArrayInReversePosition {

	String getReverseString(String str) {
		String outputString = "";
		for (int index = str.length() - 1; index >= 0; index--) {
			outputString += str.charAt(index);
		}

		return outputString;
	}

	String[] getReversedArray(String[] strArray) {
		int reversedArrayIndex = strArray.length - 1;
		String[] returnArray = new String[strArray.length];

		for (int index = 0; index <= strArray.length - 1; index++) {
			returnArray[reversedArrayIndex] = getReverseString(strArray[index]);
			// System.out.println(strArray[reversedArrayIndex]);
			reversedArrayIndex--;

		}

		return returnArray;
	}

	public static void main(String[] args) {
		System.out.println("-----------------------Program1---------------------------------------");
		ReverseElementsArrayInSamePosition newObject = new ReverseElementsArrayInSamePosition();
		String[] inputStringArray = { "madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav" };
		String[] outputStringArray = new String[inputStringArray.length];
		outputStringArray = newObject.getReversedArray(inputStringArray);
		System.out.print("The reversed array with elements in the same position is:  [");
		for (int index = 0; index < outputStringArray.length; index++) {
			System.out.print(outputStringArray[index] + ",");
		}
		System.out.print("]");
		System.out.println("");      //This is just an attempt from my side to print the output without using a predefined function like toString

		System.out.println("---------------------Program2---------------------------------");
		ReverseElementsArrayInReversePosition newObject1 = new ReverseElementsArrayInReversePosition();
		String[] inputStringArray1 = { "techno", "credits", "krishna", "harsh" };
		String[] outputStringArray1 = new String[inputStringArray1.length];
		outputStringArray1 = newObject1.getReversedArray(inputStringArray1);
		System.out.println("The reversed array with elements in the reversed position is: ");
		System.out.println(Arrays.toString(outputStringArray1));

	}

}
