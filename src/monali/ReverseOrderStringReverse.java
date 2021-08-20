package monali;

import java.util.Arrays;
/*Program 2 : Reverse all elements and place it in a reverse order

String[] input = {"techno", "credits", "krishna","harsh"}
output : [hsrah, anhsirk, stiderc, onhcet]

Note : use sop(Arrays.toString(output)) to print the array content.*/

public class ReverseOrderStringReverse {

	String getReverseString(String input) {
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			output = output + input.charAt(index);
		}
		return output;
	}

	String[] getStringReverseArray(String[] input) {

		int resultIndex = 0;
		String output[] = new String[input.length];
		for (int index = input.length - 1; index >= 0; index--) {
			output[resultIndex] = getReverseString(input[index]);
			resultIndex++;
		}
		return output;
	}

	public static void main(String[] args) {
		ReverseOrderStringReverse reverseOrderStringRev = new ReverseOrderStringReverse();
		String[] input = { "techno", "credits", "krishna", "harsh" };
		System.out.println(Arrays.toString(reverseOrderStringRev.getStringReverseArray(input)));
	}

}
