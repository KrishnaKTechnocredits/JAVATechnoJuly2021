/*Return all negative numbers (remove duplicates if any and maintain insertion order) from given array.
Input : 10, -11, 13, -11, 14, -19, -99, -11, -19, 33
Ouput : [-11, -19, -99]
Hint : parameter - Array, return type - LinkedList*/

package amol_Vyas.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Program_8 {

	static LinkedList isRemoveDuplicateAndNegativeNumbers(LinkedList<Integer> input) {
		LinkedList<Integer> output = new LinkedList();
		for (int num : input) {
			if (!(output.contains(num)) && num < 10)
				output.add(num);
		}
		return output;
	}

	public static void main(String[] args) {
		Integer[] input = { 10, -11, 13, -11, 14, -19, -99, -11, -19, 33 };
		LinkedList<Integer> linkedList = new LinkedList<Integer>(Arrays.asList(input));
		System.out.println(linkedList);
		System.out.println(isRemoveDuplicateAndNegativeNumbers(linkedList));
	}
}
