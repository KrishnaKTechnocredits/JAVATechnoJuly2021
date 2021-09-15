/*Program : 2 
reverse given string array.
input : {"Credits", "Techno","From","Diwali","Happy"}
output : {"Happy","Diwali","From","Techno","Credits"}*/

package shraddha.Assignment26;

import java.util.Arrays;

public class ReverseStringArray {
	public static void main(String[] args) {
		String[] inputArray = { "Credits", "Techno", "From", "Diwali", "Happy" };
		String[] reverseArray = new String[inputArray.length];
		System.out.println("Input Array is:- " + Arrays.toString(inputArray));
		int count = 0;
		for (int index = inputArray.length - 1; index >= 0; index--) {
			reverseArray[count] = inputArray[index];
			count++;
		}
		System.out.print("Reverse String Array will be :- " + Arrays.toString(reverseArray));
	}
}
