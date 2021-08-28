package neha.assignment_18;

import java.util.Arrays;

/*Program 2 : Reverse all elements and place it in a reverse order
String[] input = {"techno", "credits", "krishna","harsh"}
output : [hsrah, anhsirk, stiderc, onhcet]*/
public class Assignment18pg2 {
	String getReverseString(String input) {
		String output = "";
		int outIndex = input.length() - 1;
		for (; outIndex >= 0; outIndex--) {
			output += input.charAt(outIndex);
		}
		return output;
	}

	String[] reverseStringArray(String[] input) {
		String outputArr[] = new String[input.length];
		int inputIndex = 0;
		for (int index = outputArr.length - 1; index >= 0; index--) {
			outputArr[index] = getReverseString(input[inputIndex]);
			inputIndex++;
		}
		return outputArr;
	}

	public static void main(String[] args) {
		Assignment18pg2 assignment18pg2 = new Assignment18pg2();
		String[] input = {"techno", "credits", "krishna","harsh"};
		System.out.println("Reversed elements of string array are in reverse order are: "
				+ Arrays.toString(assignment18pg2.reverseStringArray(input)));
	}
}
