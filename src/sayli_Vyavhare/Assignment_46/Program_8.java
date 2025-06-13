/*Example 8:
Return all negative numbers (remove duplicates if any and maintain insertion order) from given array.
Input : 10, -11, 13, -11, 14, -19, -99, -11, -19, 33
Ouput : [-11, -19, -99]
Hint : parameter - Array, return type - LinkedList*/
package sayli_Vyavhare.Assignment_46;

import java.util.List;
import java.util.Arrays;
import java.util.LinkedList;

public class Program_8 {

	static void returnAllNegativeNum(Integer[] input) {

		List<Integer> al = new LinkedList<Integer>(Arrays.asList(input));
		List<Integer> output = new LinkedList<Integer>();
		for (Integer num : al) {
			if (num < 0) {
				if (!output.contains(num)) {
					output.add(num);
				}

			}

		}
		System.out.println("all negative numbers" + output);
	}

	public static void main(String[] args) {
		Integer[] input1 = { 10, -11, 13, -11, 14, -19, -99, -11, -19, 33 };
		returnAllNegativeNum(input1);
	}

}
