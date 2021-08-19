package shyam;

import java.util.Arrays;

public class Assignment_18_P2 {
	
	String getReverseString(String input) {
		String output="";
		for(int index=input.length()-1; index>=0; index--) {
			output+=input.charAt(index);
		}
		return output;
	}

	String[] getReverseStringPositionArray(String[] input) {
		String[] output=new String[input.length];
		int count = 0;
		for(int index=input.length-1; index>=0; index--) {
			output[count]=getReverseString(input[index]);
			count++;
		}
		return output;
	}
	
	public static void main(String[] args) {
		String[] input = {"techno","credits","krishna","advika"};
		Assignment_18_P2 assignment18_P2 = new Assignment_18_P2();
		String[] output = assignment18_P2.getReverseStringPositionArray(input);
		System.out.println("Reverse all elements of an array " + Arrays.toString(input) + " at the Reverse position-> ");
		System.out.println("Output:- " + Arrays.toString(output));
	}

}
