/*
 * Program : 2 
reverse given string array.
input : {"Credits", "Techno","From","Diwali","Happy"}
output : {"Happy","Diwali","From","Techno","Credits"}
 */
package mayur.Assignment_26;

import java.util.Arrays;

public class ReverseStringArray {
	
	
		void getReveseStringArray(String[] input) {
			String[] output = new String[input.length];
			for (int index = 0; index < input.length; index++) {
				output[index] = input[(input.length - 1) - index];
			}
			System.out.println("Reverse of given array is " + Arrays.toString(output));
		}

		public static void main(String[] args) {
			String[] input = { "Credits", "Techno", "From", "Diwali", "Happy" };
			ReverseStringArray reverseStringArray = new ReverseStringArray();
			reverseStringArray.getReveseStringArray(input);
		}

	}