package shantanu.assignment18;

import java.util.Arrays;

public class ReverseElementsAtSamePosition {
	String getReverseString(String str) {
		String reverse = "";
		for(int index = str.length() - 1; index >=0; index--)
			reverse = reverse + str.charAt(index);
		return reverse;
	}
	
	String[] getArrayElementsInReverse(String[] arr) {
		for(int index = 0; index < arr.length; index++) {
			arr[index] = getReverseString(arr[index]);
		}
		return arr;
	}
	
	void displayArrayElementsInReverse(String[] arr) {
		getArrayElementsInReverse(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		ReverseElementsAtSamePosition reverseElementsAtSamePosition = new ReverseElementsAtSamePosition();
		String[] input = {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};
		reverseElementsAtSamePosition.displayArrayElementsInReverse(input);
	}
}
