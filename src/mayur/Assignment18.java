package mayur;

import java.util.Arrays;

public class Assignment18 {

	String getreverseString(String input) {
		String output = "";
		for(int index=input.length()-1; index>=0; index--) {
			output += input.charAt(index);
		}
		return output;
	}
	
	String [] getreverseArrayAtSamePosition(String[] input) {
		String[] output = new String[input.length];
		for(int index=0; index<input.length; index++)
			output[index] = getreverseString(input[index]);
		return output;
	}
	public static void main(String[] args) {
		String [] input = {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};
		Assignment18 assignment18 = new Assignment18();
		String [] output = assignment18.getreverseArrayAtSamePosition(input);
		System.out.println("Reverse all elements of an array " + Arrays.toString(input) + " at the same position- ");
		System.out.println("Output:- " + Arrays.toString(output));
	}
}
