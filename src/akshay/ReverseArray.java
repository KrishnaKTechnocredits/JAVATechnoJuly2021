package akshay;

import java.util.Arrays;

public class ReverseArray {
	
	String reverseString(String input) {
		String output = "";
		for(int index = input.length()-1; index>= 0; index--) {
			output += input.charAt(index);
		}
		return output;
	}
	
	String[] reverseArrayString(String[] input) {
		String[] output = new String[input.length];
		int count = 0;
		for(int index = input.length-1; index >=0 ; index--) {
			output[count] = reverseString(input[index]);
			count++;
		}
		return output;
	}
	
	public static void main(String[] args) {
		ReverseArray reversearray = new ReverseArray();
		String[] input = {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};
		System.out.println(Arrays.toString(reversearray.reverseArrayString(input)));
	}
}
