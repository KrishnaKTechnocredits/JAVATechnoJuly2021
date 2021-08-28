package neha.assignment_18;

import java.util.Arrays;

/*Program 1 : Reverse all elements of an array at same position  
String[] input = {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};
output : [ivhdam, ihbrus, ahen, hsednas, tikna, vahbiav]*/
public class Assignment18pg1 {
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
		for (int index = 0; index < outputArr.length; index++) {
			outputArr[index] = getReverseString(input[index]);
		}
		return outputArr;
	}

	public static void main(String[] args) {
		Assignment18pg1 assignment18pg1 = new Assignment18pg1();
		String[] input = { "madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav" };
		System.out.println("Reversed elements of string array at same position are: "
				+ Arrays.toString(assignment18pg1.reverseStringArray(input)));
	}
}
