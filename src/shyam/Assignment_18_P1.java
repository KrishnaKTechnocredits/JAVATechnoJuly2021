package shyam;

import java.util.Arrays;

public class Assignment_18_P1 {
	
	String getReverseString(String input) {
		String output="";
		for(int index=input.length()-1; index>=0; index--) {
			output+=input.charAt(index);
		}
		return output;
	}

	String[] getReverseStringArray(String[] array) {
		String[] output=new String[array.length];
		for(int index=0; index<array.length; index++) {
			output[index]=getReverseString(array[index]);
		}
		return output;
	}
	
	public static void main(String[] args) {
		String[] input = {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};
		Assignment_18_P1 assignment18_P1 = new Assignment_18_P1();
		String[] output = assignment18_P1.getReverseStringArray(input);
		System.out.println("Reverse all elements of an array " + Arrays.toString(input) + " at the same position-> ");
		System.out.println("Output:- " + Arrays.toString(output));
	}
}
