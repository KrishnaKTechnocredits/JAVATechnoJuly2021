/*
 * Return all negative numbers (remove duplicates if any and maintain insertion order) from given array.
Input : 10, -11, 13, -11, 14, -19, -99, -11, -19, 33
Ouput : [-11, -19, -99]
Hint : parameter - Array, return type - LinkedList

 */

package bhagyashree.Assignment46;

import java.util.Arrays;
import java.util.LinkedList;

public class Assignment46_8 {

	static LinkedList returnNegativeNumber(LinkedList<Integer> input) {
		LinkedList<Integer> output = new LinkedList();
		for (int num : input) {
			if (!output.contains(num) && num < 10) {
				output.add(num);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Integer[] arr = { 10, -11, 13, -11, 14, -19, -99, -11, -19, 33 };
		LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(arr));
		System.out.println(list);
		System.out.print(returnNegativeNumber(list));
	}

}
