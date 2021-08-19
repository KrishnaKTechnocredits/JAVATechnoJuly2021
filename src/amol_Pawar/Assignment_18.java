package amol_Pawar;

import java.util.Arrays;

public class Assignment_18 {

	String getReverseString(String input) {
		String rev = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			char ch = input.charAt(index);
			rev = rev + ch;
		}
		return rev;
	}

	void getArray(String[] input) {
		String arr[] = new String[input.length];
		for (int index = 0; index < input.length; index++) {
			arr[index] = getReverseString(input[index]);
		}
		System.out.println(Arrays.toString(arr));
	}

	void getArrayInReverse(String[] input) {
		String arr[] = new String[input.length];
		int count = 0;
		for (int index = input.length - 1; index >= 0; index--) {
			arr[count] = getReverseString(input[index]);
			count++;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {

		Assignment_18 assignment_18 = new Assignment_18();

		String[] input = { "madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav" };
		System.out.println("Program 1 : Reverse all elements of an array at same position");
		assignment_18.getArray(input);
		System.out.println();
		System.out.println("Program 2 : Reverse all elements and place it in a reverse order");
		assignment_18.getArrayInReverse(input);
	}
}
