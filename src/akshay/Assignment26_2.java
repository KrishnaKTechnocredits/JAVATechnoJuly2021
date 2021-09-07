package akshay;

import java.util.Arrays;

public class Assignment26_2 {
	
	String[] getReverseArray(String[] input) {
		int i = 0;
		String[] output = new String[input.length];
		for(int index=output.length-1; index >=0; index--) {
			output[i] = input[index];
			i++;
		}
		return output;
	}
	
	public static void main(String[] args) {
		Assignment26_2 reverseArray = new Assignment26_2();
		String [] input = {"Credits", "Techno", "From", "Diwali", "Happy"};
		System.out.println(Arrays.toString(reverseArray.getReverseArray(input)));
	}
}
