package arti_G_Assignment18;
/*Assignment - 18 : 19th Aug'21

Program 1 : Reverse all elements of an array at same position  
String[] input = {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};
output : [ivhdam, ihbrus, ahen, hsednas, tikna, vahbiav]

Note : you can print array content directly using sop(Arrays.toString(output)); toString() method of Arrays class return String. 

Method should take String array and return String array.*/

import java.util.Arrays;

public class ReverseString {

	String reverseString(String input) {
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			output = output + input.charAt(index);
		}
		return output;
	}

	// 1 program
	String[] arrayReverseOder(String[] input) {
		for (int index = 0; index <= input.length - 1; index++) {
			input[index] = reverseString(input[index]);
		}
		return input;
	}

	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		String[] input = { "madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav" };
		System.out.println("Reversed all elements of an array");
		System.out.println(Arrays.toString(reverseString.arrayReverseOder(input)));

	}
}
