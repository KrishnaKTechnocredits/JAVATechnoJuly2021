package nasir_Assignment_26;

import java.util.Arrays;

public class ReverseStringArray {
	
	String[] getReverseArray(String[] input) {
		String[] output = new String[5];
		int count = 0;
		for (int index = input.length - 1; index >= 0; index--) {
			output[count] = input[index];
			count++;
		}
		return output;
	}

	public static void main(String[] args) {
		ReverseStringArray reverseStringArray = new ReverseStringArray();
		System.out.println("Reverse given string array :");
		String[] input = { "Credits", "Techno", "From", "Diwali", "Happy" };
		String[] output = (reverseStringArray.getReverseArray(input));
		System.out.println(Arrays.toString(output));

	}

}
