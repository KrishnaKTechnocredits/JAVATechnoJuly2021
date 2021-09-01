package akanksha_Jain.Assignment_26;

import java.util.Arrays;

public class Program_2 {
	
	void reverseArrayWords(String[] input) {
		String[] output = new String[input.length];
		int count = 0;
		for(int index=input.length-1; index>=0; index--) {
			output[count] = input[index];
			count ++;
		}
		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args) {
		String[] input = {"Credits", "Techno","From","Diwali","Happy"};
		Program_2 program_2 = new Program_2();
		program_2.reverseArrayWords(input);
	}
}
