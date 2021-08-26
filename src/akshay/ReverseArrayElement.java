package akshay;

import java.util.Arrays;

public class ReverseArrayElement {
	
	String reverseString(String input) {
		String output = "";
		for(int index = input.length()-1; index>= 0; index--) {
			output += input.charAt(index);
		}
		return output;
	}
	
	String[] reverseArrayString(String[] input) {
		for(int index = 0; index<input.length; index++) {
			input[index] = reverseString(input[index]);
		}
		return input;
	}
	
	public static void main(String[] args) {
		ReverseArrayElement reversearrayelement = new ReverseArrayElement();
		String[] input = {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};
		String[] output = reversearrayelement.reverseArrayString(input);
		System.out.println(Arrays.toString(output));
	}
}
