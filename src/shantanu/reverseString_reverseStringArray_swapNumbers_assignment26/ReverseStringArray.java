package shantanu.reverseString_reverseStringArray_swapNumbers_assignment26;

import java.util.Arrays;

public class ReverseStringArray {
	String[] getStringArrayInReverse(String[] input) {
		String[] output = new String[input.length];
		for(int inputIndex = input.length - 1, outputIndex = 0; inputIndex >= 0; inputIndex--,outputIndex++)
			output[outputIndex] = input[inputIndex];
		return output;
	}
	void displayStringArrayInReverse(String[] input) {
		System.out.println("String array in reverse:");
		String[] output = getStringArrayInReverse(input);
		System.out.println(Arrays.toString(output));
	}
	public static void main(String[] args) {
		ReverseStringArray reverseStringArray = new ReverseStringArray();
		String[] input = {"Credits", "Techno","From","Diwali","Happy"};
		reverseStringArray.displayStringArrayInReverse(input);
	}
}
