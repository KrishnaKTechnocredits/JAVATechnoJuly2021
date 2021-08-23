package genius;

import java.util.Arrays;

public class Assignment_18 {
    
	String reverseElementOfAnArray(String input) {
		String output = "";
		for(int index=input.length()-1; index>=0;index--) {
			output = output + input.charAt(index);
		}
		return output;
	}
	
	String[] revereseElementofArraySamePosition(String[] input) {
		for(int index=0;index<input.length;index++) {
			input[index]  = reverseElementOfAnArray(input[index]);
		}
		
		return input;
	}
	
	String[] revereseElementofArrayReversePosition(String[] input) {
		String[] output = new String[input.length];
		for(int index=input.length-1;index>=0;index--) {
			output[(input.length - 1) - index] = reverseElementOfAnArray(input[index]);
		}
		return output;
	}
	
	public static void main(String[] args) {
		String[] input = {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};
		Assignment_18 assignment_18 = new Assignment_18();
		System.out.print("Reverse all elements of an array and place it in a reverse order is ");
		System.out.println(Arrays.toString(assignment_18.revereseElementofArrayReversePosition(input)));
		
		System.out.print("Reverse all elements of an array at same position is ");
		System.out.println(Arrays.toString(assignment_18.revereseElementofArraySamePosition(input)));
		

	}

}
