package avinash.assignment26;
/*Program : 2 
reverse given string array.
input : {"Credits", "Techno","From","Diwali","Happy"}
output : {"Happy","Diwali","From","Techno","Credits"}
 */

import java.util.Arrays;
import java.util.Scanner;

public class ReverseStringArray {
	String[] reverseofStringArray(String[] input) {
		String[] output = new String[input.length];
		int count = 0;
		for (int index = input.length - 1; index >= 0; index--) {
			output[count] = input[index];
			count++;
		}
		System.out.println("String[] reverse is:" + Arrays.toString(output));
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseStringArray reverseStringArray = new ReverseStringArray();
		String[] input = { "Credits", "Techno", "From", "Diwali", "Happy" };
		reverseStringArray.reverseofStringArray(input);

	}

}
