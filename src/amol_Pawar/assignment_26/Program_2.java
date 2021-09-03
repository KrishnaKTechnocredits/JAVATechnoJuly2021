package amol_Pawar.assignment_26;

import java.util.Arrays;

public class Program_2 {

	void getReverseArray(String[] input) {
		int count = 0;
		String arr[] = new String[input.length];
		for (int index = input.length - 1; index >= 0; index--) {
			arr[count] = input[index];
			count++;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		Program_2 program_2 = new Program_2();
		String[] input = { "Credits", "Techno", "From", "Diwali", "Happy" };
		program_2.getReverseArray(input);
	}
}
/*Program : 2 
reverse given string array.
input : {"Credits", "Techno","From","Diwali","Happy"}
output : {"Happy","Diwali","From","Techno","Credits"}*/
