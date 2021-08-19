package dattaraj;

import java.util.Arrays;

public class Assignment_18 {
	String getReverseString(String input) {
		String output = "";
		for(int index=input.length()-1; index>=0; index--) {
			output = output + input.charAt(index);
		}
		return output;
	}

	String[] getReverseStringArray(String[] input) {
		String[] output = new String[input.length];
		for(int index=0; index<input.length; index++) {
			output[index] = getReverseString(input[index]);
		}
		return output;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};
		Assignment_18 assignment_18_p1 = new Assignment_18();
		String[] output = assignment_18_p1.getReverseStringArray(input);
		System.out.println("Reverse all elements of an array " + Arrays.toString(input) + " at the same position- ");
		System.out.println("Output:- " + Arrays.toString(output));
	}

}
