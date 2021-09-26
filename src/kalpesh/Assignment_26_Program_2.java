package kalpesh;

import java.util.Arrays;

public class Assignment_26_Program_2 {
	void reverseArrayWords(String[] input) {
		String[] output = new String[input.length];
		int count = 0;
		for (int index = input.length - 1; index >= 0; index--) {
			output[count] = input[index];
			count++;
		}
		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args) {
		String[] input = { "Credits", "Techno", "From", "Diwali", "Happy" };
		Assignment_26_Program_2 program_2 = new Assignment_26_Program_2();
		program_2.reverseArrayWords(input);
	}

}

/*Program : 2 
reverse given string array.
input : {"Credits", "Techno","From","Diwali","Happy"}
output : {"Happy","Diwali","From","Techno","Credits"}
*/
