package tanmoy_Roy;
import java.util.Arrays;

import tanmoy_Roy.Assignment18_1;

public class Assignment18_2 {
	
	String[] reversedArray(String[] input) {
		Assignment18_1 assign = new Assignment18_1();
		String[] revArr= assign.arrElementsReverse(input);
		int i=0,N=revArr.length;
		while(i< N)
			input[i]=revArr[N-1-i++];
		return input;
	}

	public static void main(String[] args) {
		Assignment18_2 assgn = new Assignment18_2();
		String[] input = { "madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav" };
		System.out.println("Before Reversal of array elements : "+Arrays.toString(input));
		System.out.println("After Reversal of array : "+Arrays.toString(assgn.reversedArray(input)));

	}

}
