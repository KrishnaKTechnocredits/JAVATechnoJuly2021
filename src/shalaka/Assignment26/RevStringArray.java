package shalaka.Assignment26;

import java.util.Arrays;

public class RevStringArray {
	String[] getRevStringArray(String[] input) {
		int count = 0;
		String output[] = new String[input.length];
		for (int index = output.length - 1; index >= 0; index--) {
			output[count] = input[index];
			count++;
		}
		// System.out.println(output[count]);
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = { "Credits", "Techno", "From", "Diwali", "Happy" };
		RevStringArray revStringArray = new RevStringArray();
		System.out.println("Output Array is:" + Arrays.toString(revStringArray.getRevStringArray(input)));
	}
}
