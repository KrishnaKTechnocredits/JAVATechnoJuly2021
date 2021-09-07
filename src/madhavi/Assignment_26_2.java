package madhavi;

import java.util.Arrays;

public class Assignment_26_2 {
	String[] getReverseArray(String[] input1) {
		String[] output = new String[5];
		int count = 0;
		for (int index = input1.length - 1; index >= 0; index--) {
			output[count] = input1[index];
			count++;
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment_26_2 assignment_26_2 = new Assignment_26_2();
		System.out.println("Reverse given string array :");
		String[] input = { "Credits", "Techno", "From", "Diwali", "Happy" };
		String[] output = (assignment_26_2.getReverseArray(input));
		System.out.println(Arrays.toString(output));
	}

}
