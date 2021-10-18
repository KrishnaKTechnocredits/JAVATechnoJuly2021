/*
 * Write a program to convert Array to List.
 */
package bhagyashree.Assignment46;

import java.util.ArrayList;
import java.util.List;

public class Assignment46_14 {
	
	static List<Integer> convertArrayToList(int[] input) {
		List<Integer> output = new ArrayList();
		for (int num : input) {
			output.add(num);
		}
		return output;
	}

	public static void main(String[] args) {
		int[] input = { 19, 12, 18, 17, 23, 22 };
		System.out.println(convertArrayToList(input));
	}

}
