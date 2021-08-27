package tanmoy_Roy;
import java.util.Arrays;

import tanmoy_Roy.Assignment17;

public class Assignment18_1 {
	
	String[] arrElementsReverse(String[] input) {
		Assignment17 assignment17 =new Assignment17();
		int i=0;
		while(i<input.length) 
			input[i]=assignment17.getReverseString(input[i++]); //use the reverse function of Assgn 17
																//post increment uses the value of i to populate in input[i] then increment
		
		return input;
	}
	
	public static void main(String[] args) {
		Assignment18_1 assgn = new Assignment18_1();
		String[] input = { "madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav" };
		System.out.println("Before Reversal of elements : "+Arrays.toString(input));
		System.out.println("After Reversal of elements : "+Arrays.toString(assgn.arrElementsReverse(input)));

	}

}
	