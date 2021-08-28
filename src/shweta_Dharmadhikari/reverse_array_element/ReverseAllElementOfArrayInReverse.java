package shweta_Dharmadhikari.reverse_array_element;

import java.util.Arrays;

public class ReverseAllElementOfArrayInReverse {
	String getReverseString(String temp) {
		String output = "";
		for (int index = temp.length() - 1; index >= 0; index--) {
			output += temp.charAt(index);
		}
		return output;
	}

	String[] reverseArray(String[] input) {
		int index1 = 0;
		String output[] = new String[input.length];
		for (int index = output.length - 1; index >= 0; index--) {
			output[index] = getReverseString(input[index1]);
			index1++;
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseAllElementOfArrayInReverse reverseAllElementOfArrayInReverse = new ReverseAllElementOfArrayInReverse();
		String[] input = { "techno", "credits", "krishna", "harsh" };
		System.out.println(Arrays.toString(reverseAllElementOfArrayInReverse.reverseArray(input)));
	}

}
